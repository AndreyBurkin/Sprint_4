package ru.PraktikumServices.QaScooter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePageSamokat {

       private final WebDriver driver;

        // кнопка "Заказать" в хедере
        private final By  headerToOrder = By.className("Button_Button__ra12g");
        // кнопка "Заказать" в теле
        private final By  bodyToOrder = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

       /*
       // аккордеон "Сколько это стоит? И как оплатить?"
        private final By accordionWhatIsThePrice = By.id("accordion__heading-0");
        // аккордеон "Хочу сразу несколько самокатов! Так можно?"
        private final By aeveralScootersAtOnce  = By.id("accordion__heading-1");
        // аккордеон "Как рассчитывается время аренды?"
        private final By howTheRentalTimeIsCalculated  = By.id("accordion__heading-2");
        // аккордеон "Можно ли заказать самокат прямо на сегодня?"
        private final By scooterRightForToday = By.id("accordion__heading-3");
        // аккордеон "Можно ли продлить заказ или вернуть самокат раньше?"
        private final By extendOrRefund = By.id("accordion__heading-4");
        // аккордеон "Вы привозите зарядку вместе с самокатом?"
        private final By chargingWitScooter = By.id("accordion__heading-5");
        // аккордеон "Можно ли отменить заказ?"
        private final By cancelTheOrder = By.id("accordion__heading-6");
        // аккордеон "Я жизу за МКАДом, привезёте?"
        private final By willYouBringItBeyondTheMKAD = By.id("accordion__heading-7");
        */

        //Локатор "Вопросы о важном"
        private By questionsAboutImportant = By.id("accordion__heading-0");
        //Локатор ответов на вопросы о важном
        private By questionsAboutImportantText = By.xpath(".//div[@id='accordion__panel-0']");



        public HomePageSamokat(WebDriver driver) {
                this.driver = driver;
        }
        //Нажать кнопку "Заказать" в хедере
        public void clickButtonHeaderToOrder() {
                driver.findElement(headerToOrder).click();
        }
        //Нажать кнопку "Заказать" в теле домашний страницы
        public void clickButtonBodyToOrder() {
                driver.findElement(bodyToOrder).click();
        }


        //Скрол до списка вопросов
        public void sckrolToAkkardionQuestions() {
         // Найди футер
         WebElement element = driver.findElement(By.xpath(".//div[text() = 'Вопросы о важном']"));
         // Прокрути страницу до футера
         ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        }

        // Метод нажатия "Вопросы о важном"
        public void clickQuestionsAboutImportant(int number) {
        questionsAboutImportant = By.id("accordion__heading-" + number);
        driver.findElement(questionsAboutImportant).click();
 }

        //Метод взятия текста из ответа на вопросы о важном
        public String getTextquestionsAboutImportantText(int number) {
        questionsAboutImportantText = By.xpath(".//div[@id='accordion__panel-" + number + "']/p");
        return driver.findElement(questionsAboutImportantText).getText();
 }



}
