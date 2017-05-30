package ru.champaproject.steps;

import org.jbehave.core.annotations.*;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;
    public static boolean isBrowserRunning;

    //used frag isBrowserRunning because BeforeStories doesn't work
    @BeforeStories
    public void startBrowser() {
        if (!isBrowserRunning) {
            System.setProperty("webdriver.chrome.driver", "D://web_drivers//chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://champaproject.ru/");
            isBrowserRunning = true;
        }
    }


   @AfterStories
    public void cleaup() {
        driver.close();
    }

}