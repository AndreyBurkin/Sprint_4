package ru.PraktikumServices.QaScooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutRentWindow {
    private final WebDriver driver;

    public AboutRentWindow(WebDriver driver) {
        this.driver = driver;
    }

    //Поле "Когда привезти самокат"
    private final By whenToBoringScooterField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //Даты выпадающего календаря
    private final By enterDateCalendar = By.xpath(".//div[@aria-label = 'Choose среда, 7-е июня 2023 г.']");
    //Поле срок аренды
    private final By rentalPeriodField = By.className("Dropdown-control");
    //Выпадающий список со сроком аренды
    private final By dropListRentalPeriod = By.xpath(".//div[text() = 'сутки']");
    //Чекбокс цвета самоката
    private final By checkboxColorScooterBlack = By.id("black");
    private final By checkboxColorScooterGrey = By.id("grey");
    //Поле комментарий для курьера
    private final By commentForCourierField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //Кнопка заказать
    private final By buttonOrder = By.xpath(".//div[2]/div[3]/button[2][text() = 'Заказать']");
    //Кнопка "Да" в модальном окне подтверждения заказа
    private final By buttonYes = By.xpath(".//div/button[text() = 'Да']");


    //Нажать на поле "Когда привезти самокат"
    public void clickWhenToBoringScooterField(){
        driver.findElement(whenToBoringScooterField).click();
    }
    // Выбрать дату в выпадающем календаре (поле "Когда привезти самокат")
    public void clickEnterDateCalendar(){
        driver.findElement(enterDateCalendar).click();
    }
    //Нажать на поле "Срок аренды"
    public void clickRentalPeriodField() {
        driver.findElement(rentalPeriodField).click();
    }
    //Выбрать срок аренды из выпадающего списка
     public void clickDropListRentalPeriod() {
        driver.findElement(dropListRentalPeriod).click();
    }
    //Нажать на чекбокс выбора цвета самоката
    public void clickCheckboxColorScooterBlack() {
        driver.findElement(checkboxColorScooterBlack).click();
    }
    //Нажать на кнопку "Заказать"
    public void clickButtonOrder() {
        driver.findElement(buttonOrder).click();
    }
    //Нажать кнопку да в модальном окне подтверждения заказа
    public void clickButtonYes() {
        driver.findElement(buttonYes).click();
    }


    //Ввести значение в поле "Когда привезти самокат"
    public void fillWhenToBoringScooterField(String date){
        driver.findElement(whenToBoringScooterField).sendKeys(date);
    }
    //Вод значения в поле "Комментарий для курьера"
    public void fillCommentForCourierField(String CommentFor){
        driver.findElement(commentForCourierField).sendKeys(CommentFor);
    }

    //Заполнение полей в окне "Про аренду"
    public void fillAboutRent(String date, String CommentFor){
        clickWhenToBoringScooterField();
        fillWhenToBoringScooterField(date);
        clickEnterDateCalendar();
        clickRentalPeriodField();
        clickDropListRentalPeriod();
        clickCheckboxColorScooterBlack();
        fillCommentForCourierField(CommentFor);
        clickButtonOrder();
        clickButtonYes();

     }

}
