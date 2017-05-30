package ru.champaproject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static ru.champaproject.steps.BaseTest.driver;


public class MainPage {
    //TopMenu
        public WebElement desertButton = driver.findElement(By.cssSelector("a[href=\"/#product\"]"));
        public WebElement feedbacksButton = driver.findElement(By.cssSelector("a[href=\"http://champaproject.ru/otzyvy/\"]"));
        public WebElement registrationButton = driver.findElement(By.cssSelector("a.login.modal-link"));
        public WebElement cartButton = driver.findElement(By.cssSelector("a[title=\"Мой заказ\"]"));

    //Footer
        public WebElement fbButton = driver.findElement(By.cssSelector(".social.facebooks"));
        public WebElement vkButton = driver.findElement(By.cssSelector(".social.vk"));

    public void openPopUpLogin (){
       registrationButton.click();
    }

    public void openPDL (){
        desertButton.click();
    }

    public void opendFeedbacks (){
        feedbacksButton.click();
    }

    public void opendCart (){
        cartButton.click();
    }

    public void opendFB (){
        fbButton.click();
    }

    public void opendVK (){
        vkButton.click();
    }

}
