package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Jay
 */
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    /*By loginLink = By.linkText("Log in");
    By registerLink = By.xpath("//a[@class='ico-register']");*/

    @FindBy(linkText = "Log in")
    WebElement _loginLink;

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement _registrationLink;

    public void clickOnLoginLink() {
        Reporter.log("Clicking on login link : " + _loginLink.toString() + "<br>");
        clickOnElement(_loginLink);
        log.info("Clicking on Login link : " +_loginLink.toString());
    }

    public void clickOnRegisterLink() {
        Reporter.log("Clicking on login link : " + _registrationLink.toString() + "<br>");
        clickOnElement(_registrationLink);
        log.info("Clicking on login link : " + _registrationLink.toString());
    }
}
