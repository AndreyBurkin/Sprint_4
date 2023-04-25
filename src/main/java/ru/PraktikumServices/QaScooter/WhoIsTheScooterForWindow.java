package ru.PraktikumServices.QaScooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhoIsTheScooterForWindow {

    private final WebDriver driver;



    // поле "Имя"
    private final By firstNameField = By.xpath(".//input[@placeholder = '* Имя']");
    // поле "Фамилия"
    private final By lastNameField = By.xpath(".//input[@placeholder = '* Фамилия']");
    //поле "Адрес"
    private final By addressField = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    //поле "Станция метро" при нажатии открывается аккордеон
    private final By metroStationField = By.className("select-search__input");
    //станция метро из выпадающего списка (аккордеон)
    private final By valueMetroStation = By.xpath(".//button[@value = '56']");
    //Поле с номером телефона
    private final By telephoneField = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    //кнопка "Далее"
    private final By buttonNext = By.xpath(".//button[text() = 'Далее']");



    public WhoIsTheScooterForWindow(WebDriver driver) {
        this.driver = driver;
    }

    //нажать на поле "Имя"
    public void clickFirstNameField() {
        driver.findElement(firstNameField).click();
    }
    //нажать на поле "Фамилия"
    public void clickLastNameField() {
        driver.findElement(lastNameField).click();
    }
    // Нажать на поле "Адрес"
    public void clickAddressField() {
        driver.findElement(addressField).click();
    }
    //Нажать на поле "Станция метро"
    public void clickMetroStationField() {
        driver.findElement(metroStationField).click();
    }
    //Выбрать станцию метро из выпадающего списка
    public void clickAkkardionMetroStation(){
        driver.findElement(valueMetroStation).click();
    }
    //Нажать на поле телефон
    public void clickTelephoneField(){
        driver.findElement(telephoneField).click();
    }



    //Ввести значение в поле "Имя"
    public void fillFirstNameField(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }
    //Ввести значение в поле "Фамилия"
    public void fillLastNameField(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }
    //Ввести значение в поле "Адрес"
    public void fillAddressField(String address) {
        driver.findElement(addressField).sendKeys(address);
    }
    //Ввести значение в поле "Станция метро"
    public void fillMetroStationField(String station) {
        driver.findElement(metroStationField).sendKeys(station);
    }
    //Ввести значение в поле телефон
    public void fillTelephoneField(String telephone){
        driver.findElement(telephoneField).sendKeys(telephone);
    }

    //Нажать кнопку "Далее"
    public void clickButtonNext(){
        driver.findElement(buttonNext).click();
    }



    //Заполнение формы "Для кого самокат"
    public void fillOutOrderForm(String firstName, String lastName, String address, String station, String telephone){
       clickFirstNameField();
       fillFirstNameField(firstName);
       clickLastNameField();
       fillLastNameField(lastName);
       clickAddressField();
       fillAddressField(address);
       clickMetroStationField();
       fillMetroStationField(station);
       clickAkkardionMetroStation();
       clickTelephoneField();
       fillTelephoneField(telephone);
       clickButtonNext();

    }




}
