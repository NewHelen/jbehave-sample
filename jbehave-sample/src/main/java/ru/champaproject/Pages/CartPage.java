package ru.champaproject.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static ru.champaproject.steps.BaseTest.driver;

public class CartPage extends MainPage {


    public List<WebElement> shoppingCartItems = driver.findElements(By.xpath("//table[@class=\"cart\"]/tbody/tr/td[@class=\"cart_remove\"]/.."));
    public  WebElement totalQtyLocator = driver.findElement(By.xpath("//table[@class=\"cart\"]//td[text() =\"Итого за товары\"]/../td[@class=\"cart_count\"]"));
    public  WebElement totalPriceLocator =driver.findElement(By.cssSelector("//table[@class=\"cart\"]//td[text() =\"Итого за товары\"]/../td[@class=\"cart_summ\"]"));
    public  WebElement finalPriceLocator = driver.findElement(By.xpath("//table[@class=\"cart\"]//td[text() =\"Итого к оплате\"]/../td[@class=\"cart_summ\"]"));

    // all buttons "+"
    public WebElement addItemQtyLocator = driver.findElement(By.cssSelector(".js_cart_count_plus.cart_count_plus"));
    public void clickAddItemQtyLocator (){
        addItemQtyLocator.click();
    }

    // button  "Продолжить"
    public  WebElement continueButton = driver.findElement(By.cssSelector("input[value='Продолжить']"));
    public void clickContinueButton (){
        continueButton.click();
    }

    public String getItemTitle(WebElement item){
        item = driver.findElement(By.xpath(".cart_name>a"));
        String itemTitleText = item.getText();
        return itemTitleText;
    }

    public int getItemQty(WebElement item){
        item = driver.findElement(By.cssSelector(".number"));
        String itemText = item.getText();
        int itemInt = Integer.parseInt(itemText);
        return itemInt;
    }

    public double getItemPrice(WebElement item){
        item = driver.findElement(By.cssSelector("//table[@class=\"cart\"]/tbody/tr/td[@class=\"cart_remove\"]/../td[4]"));
        String itemPriceText = item.getText();

        double itemPriceInt = Double.parseDouble(itemPriceText);
        return itemPriceInt;
    }

    public Double getItemTotalPrice(WebElement item){
        item = driver.findElement(By.cssSelector("//table[@class=\"cart\"]/tbody/tr/td[@class=\"cart_remove\"]/../td[5]"));
        String itemTotalPriceText = item.getText();

        double itemTotalPriceInt = Double.parseDouble(itemTotalPriceText);
        return itemTotalPriceInt;
    }

    // remove all items ???
    public WebElement removeItemsLocator = driver.findElement(By.xpath("//table[@class=\"cart\"]/tbody/tr/td[@class=\"cart_remove\"]"));

        public void removeItem(){
            removeItemsLocator.click();
    }

    // delivery option Courier
    public WebElement courierButtonLocator = desertButton.findElement(By.cssSelector("#delivery_id_1"));
    public void clickCourierButtonLocator (){
        courierButtonLocator.click();
    }

    //get the cost of delivery by courier
    //get delivery charge pickup


    // delivery option Pickup
    public WebElement pickupButtonLocator = desertButton.findElement(By.cssSelector("#delivery_id_4"));
    public void clickPickupButtonLocator (){
        pickupButtonLocator.click();
    }

}
