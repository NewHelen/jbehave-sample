package ru.champaproject.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.champaproject.Pages.*;
import ru.champaproject.PopUp.LoginPopUp;

import java.util.concurrent.TimeUnit;

public class MySteps extends BaseTest{
    private String wrondEmail = "email@gmail.-*/";

    @Given("Click the \"autorization\" button in MainPage")
    public void clickAutorizatoinButton (){
        MainPage el = new MainPage();
        el.openPopUpLogin();
    }

    @When("Click the \"sign in\" button")
    public void clikingSignIn (){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        LoginPopUp el = new LoginPopUp();
        el.signInButton.click();
    }

    @Then("The screen displays error login and password")
    public void displayErr(){
        String expectedMsg = "Неверный логин или пароль.";
        WebElement error = driver.findElement(By.cssSelector(".errors.error.error_message"));
        Assert.assertEquals("Error msg doesn't match", expectedMsg, error.getText());
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".modal-close")).click(); //TODO
    }




    @Given ("Click the \"registration\" button in popup")
    public void clickRegistrationButtonInPopUp (){
        LoginPopUp el = new LoginPopUp();
        el.clickRegistrationButton();
    }
    @When("Enter not valid data in fields")
    public void enterNotValidData (){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        RegistrationPage lp = new RegistrationPage();
        lp.putRegistrationDate("2345rfghj*/", wrondEmail, "ert234/*9", "-*/34rf");
    }

    @When("Click the \"registration\" button on the RegistrationPage")
    public void finishRegistration () {
        RegistrationPage lp = new RegistrationPage();
        lp.clickRegistrationButton();
    }

    @Then("The screen displays error data input")
    public void displaysErrorDataInput (){
        String expectedMsg = "E-mail адрес не правильного формата.";
        Assert.assertEquals("Error msg doesn't match", expectedMsg, driver.findElement(By.cssSelector(".errors.error_mail.error_message")).getText());
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".modal-close")).click();
    }

    @Then("The screen displays error no data input")
    public void displaysError (){
        String expectedMsg = "Заполните поле ФИО или название компании";
        Assert.assertEquals("Error msg doesn't match", expectedMsg, driver.findElement(By.cssSelector(".errors.error_fio.error_message")).getText());

    }

    @Given ("Check items quantity in the cart")
    public int checkItemsQuantityInTheCart (){
        MainPage el = new MainPage();
        String stringItemsQuantity = el.cartButton.getText();
        String [] strings = stringItemsQuantity.split(" ");

        if (strings[0] == "0"){
            System.out.println("The cart is emply");
            int itemQuantity = 0;
            return itemQuantity;
        }

        else {int itemQuantity = Integer.getInteger(strings[0]);
            return itemQuantity;
        }

    }

    @Given ("Go to PDL")
    public void clickTheDesertButton (){
        MainPage el = new MainPage();
        el.openPDL();
    }

    @When ("Choose the item and click the \"in cart\" button")
    public void AddingItemFromPDLToTheCartByNonregistratedUser (){
        PDL el = new PDL();
        el.clickInCartButton();
    }

    @Then ("The screen displays the item in the cart")
    public void toVerifyItemsInTheCart (int itemQuantity){
        MainPage el = new MainPage();
        String stringItemsQuantity2 = el.cartButton.getText();
        String [] strings = stringItemsQuantity2.split(" ");
        int quantity = Integer.getInteger(strings[0]);

        Assert.assertTrue(quantity==1+itemQuantity);
    }

    @When ("Choose the second item and click the \"in cart\" button")
    public void AddingSecondItemFromPDL (){
 //
    }

    @Given ("Go to PDP")
    public void goToPDP (){
        PDL el = new PDL();
        el.clickFirstItemLink();
    }

    @Given ("Click 'Add to cart' button")
    public void addToCart (){
        PDP el = new PDP();
        el.clickInCartButton();
    }

    @When ("Click 'Add to cart' button again")
    public void repitAddingToCart (){
        PDP el = new PDP();
        el.clickInCartButton();
    }

    @Then ("Mini cart was updated with one item more")
    public void toVerufyCart (){
        String expectedQuantity = "2";
        WebElement sms = driver.findElement(By.cssSelector("#show_cart>a"));
        String textSms = sms.getText();
        String [] strings = textSms.split(" ");
        Assert.assertEquals ("Error msg doesn't match", expectedQuantity, strings[0]);
    }

    @Then ("Go to in the shopping cart")  // is not attached to the page document
    public void goToTheShoppingCart (){
        MainPage el = new MainPage();
        el.opendCart();
    }

    @When  ("Change item quantity")
    public void changeItemQuantity (){
        CartPage el = new CartPage();
        el.clickAddItemQtyLocator();
    }

    @Then ("The total number of the items equal to the new amount")
    public void compareTotalNumberAndNewAmount (){
//Scenario: to verify summary item counter of the cart

//        for (WebElement product : shoppingCartItems) {
//                Assert.assertTrue(getItemQty(product) * getItemPrice(product) == getItemTotalPrice(product));
//            }
//
//
   }

    @Then ("product price was incriased twiced The summaryprice was chenged accordinally")
    public void comparePrice (){
 //Scenario: to verify item price and total price in the cart
    }

    @When ("Remove the item")
    public void removeTheItem (){
        CartPage el = new CartPage();
        el.removeItem();
    }

    @Then ("The screen displays emply cart")
    public void emplyCart (){
        String expectedMsg ="Корзина пуста.";
        Assert.assertEquals("Error msg doesn't match", expectedMsg, driver.findElement(By.cssSelector(".wrap>p")).getText());
    }

    @When ("Click \"Continue\" button")
    public void continueCheckout (){
        CartPage el = new CartPage();
        el.clickContinueButton();
    }

    @Then ("The screen displays errors for mandatory fields")
    public void errorMandatoryFields (){
        String errorMsg = "Пожалуйста, заполните обязательное поле «Ваше имя».";
        Assert.assertEquals("Error msg doesn't match",errorMsg,driver.findElement(By.cssSelector(".errors.error_p1.error_message")));
    }


}
