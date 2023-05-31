package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUser {
    public static WebDriver driver;
    public LoginUser(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "Invalid credentials")
    private WebElement fieldUsername;

    public void setFieldUsername(String userName){
        fieldUsername.sendKeys(userName);
    }

    @FindBy(xpath = "//input[@name='password']")
    private WebElement fieldPassword;

    public void setFieldPassword(String password){
        fieldPassword.sendKeys(password);
    }

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    private WebElement buttonLogin;

    public void setButtonLogin(){
        buttonLogin.click();
    }


}
