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

    @FindBy(css = "[name='username']")
    private WebElement fieldUsername;

    public void setFieldUsername(String userName){
        fieldUsername.sendKeys(userName);
    }

    @FindBy(css = "[name='password']")
    private WebElement fieldPassword;

    public void setFieldPassword(String password){
        fieldPassword.sendKeys(password);
    }

    @FindBy(css = ".oxd-button")
    private WebElement buttonLogin;

    public void setButtonLogin(){
        buttonLogin.click();
    }


}
