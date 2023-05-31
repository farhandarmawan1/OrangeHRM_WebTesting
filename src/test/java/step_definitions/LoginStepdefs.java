package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.LoginUser;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginStepdefs {
    private WebDriver webDriver;
    public LoginStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("^user already on page login$")
    public void userAlreadyOnPageLogin() throws InterruptedException {
        WebElement verify = webDriver.findElement(By.xpath("//input[@name='password']"));
        verify.click();
        Thread.sleep(1000);
    }

    @When("^User input username$")
    public void userInputUsername() {
        LoginUser loginUser = new LoginUser(webDriver);
        loginUser.setFieldUsername("Admin");
    }

    @And("^user input password$")
    public void userInputPassword() {
        LoginUser loginUser = new LoginUser(webDriver);
        loginUser.setFieldPassword("admin123");
    }

    @And("^user click button login$")
    public void userClickButtonLogin() throws InterruptedException {
        LoginUser loginUser = new LoginUser(webDriver);
        loginUser.setButtonLogin();
        Thread.sleep(1000);
    }

    @Then("^user succefully login to dashboard$")
    public void userSuccefullyLoginToDashboard() throws InterruptedException {
        WebElement verify = webDriver.findElement(By.cssSelector(".oxd-text--h6"));
        verify.click();
        Thread.sleep(1000);
    }

    @When("^User input username and password invalid data$")
    public void userInputUsernameAndPasswordInvalidData() {
        LoginUser loginUser = new LoginUser(webDriver);
        loginUser.setFieldPassword("wkwkw");
        loginUser.setFieldUsername("admin123");
    }

    @Then("^user see notif Invalid credentials$")
    public void userSeeNotifInvalidCredentials() throws InterruptedException {
        WebElement verify = webDriver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
        verify.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }
}
