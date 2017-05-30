package ru.champaproject.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.champaproject.steps.BaseTest;

import java.util.concurrent.TimeUnit;

import static ru.champaproject.steps.BaseTest.driver;

public class RegistrationPage extends MainPage{
    public  WebElement surnameField = driver.findElement(By.xpath("html/body/div[1]/div/form/input[5]"));
    public  WebElement emaiField = driver.findElement(By.xpath("html/body/div[1]/div/form/input[6]"));
    public  WebElement loginField = driver.findElement(By.xpath("html/body/div[1]/div/form/input[8]"));
    public  WebElement pswField = driver.findElement(By.xpath("html/body/div[1]/div/form/input[9]"));
    public  WebElement repeatPswField = driver.findElement(By.xpath("html/body/div[1]/div/form/input[10]"));
    public  WebElement registratoinButton = driver.findElement(By.xpath("html/body/div[1]/div/form/input[12]"));

    public void putRegistrationDate (String surname, String email, String login, String password){

        surnameField.sendKeys(surname);
        emaiField.sendKeys(email);
        loginField.sendKeys(login);
        pswField.sendKeys(password);
        repeatPswField.sendKeys(password);
    }

    public void clickRegistrationButton (){
        registratoinButton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
