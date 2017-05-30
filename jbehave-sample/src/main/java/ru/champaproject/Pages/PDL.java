package ru.champaproject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static ru.champaproject.steps.BaseTest.driver;

public class PDL extends MainPage{
    // first item
    public WebElement inCartButton = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div/form/input[4]"));
    public WebElement firstItemLink = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/h3/a"));

    public void clickInCartButton (){
        inCartButton.click();
    }

    public void clickFirstItemLink (){
        firstItemLink.click();
    }
}
