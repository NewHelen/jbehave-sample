package ru.champaproject.PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static ru.champaproject.steps.BaseTest.driver;


public class LoginPopUp {
    public WebElement loginInput = driver.findElement(By.cssSelector(".login.ajax>input[name=\"name\"]"));
    public WebElement pwdInput = driver.findElement(By.cssSelector(".login.ajax>input[name=\"pass\"]"));
    public WebElement signInButton = driver.findElement(By.cssSelector(".login.ajax>input[value=\"Войти\"]"));
    public WebElement registrationButton = driver.findElement(By.cssSelector("a[href=\"http://champaproject.ru/registration/\"]"));

    public void clickRegistrationButton (){
        registrationButton.click();
    }
    //public void clickSignInButton (){
     //   signInButton.click();
    //}
}

