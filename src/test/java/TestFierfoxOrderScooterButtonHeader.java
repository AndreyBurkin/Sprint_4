import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.PraktikumServices.QaScooter.AboutRentWindow;
import ru.PraktikumServices.QaScooter.HomePageSamokat;
import ru.PraktikumServices.QaScooter.WhoIsTheScooterForWindow;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class TestFierfoxOrderScooterButtonHeader {

    WebDriver driver;

    @Before
    public void setUp(){
       WebDriverManager.firefoxdriver().setup();
        /*
        FirefoxOptions options = new FirefoxOptions()
                .addPreference("browser.startup.page", 3)
                        .addPreference("browser.startup.homepage", "https://qa-scooter.praktikum-services.ru/");
        driver = new FirefoxDriver(options);
        */

        System.setProperty("webdriver.gecko.driver", "D:\\WebDriver\\bin\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @Test
    public void FirefoxTestOrderScooterButtonIsHeader(){

        driver.get("https://qa-scooter.praktikum-services.ru/");

        //Нажимаем на кнопку "Заказать" в хедере
        HomePageSamokat objHomePage = new HomePageSamokat(driver);
        objHomePage.clickButtonHeaderToOrder();

        //Заполняем поля в окне "Для кого самокат" и нажимаем "Далее"
        WhoIsTheScooterForWindow objWholsTheScooter = new WhoIsTheScooterForWindow(driver);
        objWholsTheScooter.fillOutOrderForm("Евпатий","Коловратов", "ул. Маршала Ульянова, дом 18","Смоленская", "89156554585");

        //Заполнение полей в окне "Про аренду"
        AboutRentWindow objAboutRent = new AboutRentWindow(driver);
        objAboutRent.fillAboutRent("07.06.2023", "Скорее");

        boolean isDisplayed = driver.findElement(By.xpath(".//div[text() = 'Заказ оформлен']")).isDisplayed();
        assertTrue(isDisplayed);

    }

    @After
    public void browsersQuit() {
        driver.quit();
    }


}
