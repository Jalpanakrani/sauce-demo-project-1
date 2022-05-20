package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']\n")
    WebElement UsernameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement PasswordField;

    @CacheLookup
    @FindBy(xpath= "//input[@id='login-button']")
    WebElement LoginButton;


    public void enterUsername(String Username) {
        sendTextToElement(UsernameField, Username);
        log.info("Enter username : " + "Username" + " to username field " + UsernameField.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(PasswordField, password);
        log.info(" Enter password : " + password + " to password field " + PasswordField.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(LoginButton);
        log.info(" click on female radio button : " + LoginButton.toString());


    }
}