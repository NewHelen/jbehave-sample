package ru.champaproject.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static ru.champaproject.steps.BaseTest.driver;

public class PDP extends MainPage{
    public WebElement inCartButton = driver.findElement(By.cssSelector("input[ value=\"Купить\"]"));

    public void clickInCartButton (){
        inCartButton.click();
    }
}
