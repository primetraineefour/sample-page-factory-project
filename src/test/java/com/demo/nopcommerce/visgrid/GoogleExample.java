package com.demo.nopcommerce.visgrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

/**
 * Created by Jay
 */
public class GoogleExample {

    public WebDriver driver;

    @BeforeClass
    public void beforeClass() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
    }

    @Test
    public void testBingExample() {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("vis Grid Test");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
