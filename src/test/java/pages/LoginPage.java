package pages;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import utils.filereader.readProperties;


import java.io.IOException;


public class LoginPage {

    private static WebDriver driver;

    private By signInBtn = By.xpath("//button[normalize-space()='Sign In']");
    private By emailField = By.cssSelector("input[data-testid=EmailAddress]");
    private By passwordField = By.cssSelector("input[data-testid=Password]");

    private By loginBtn = By.xpath("//button[normalize-space()='Login']");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignInButton() {

        driver.findElement(signInBtn).click();

    }


    public void enterUsername(String username) {
        driver.findElement(emailField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {

        driver.findElement(loginBtn).click();
        System.out.println("Login is successful");

    }

    public void login() throws IOException {
        readProperties readTestData = new readProperties();
        driver.findElement(signInBtn).click();
        driver.findElement(emailField).sendKeys((String) readTestData.getUsername());
        driver.findElement(passwordField).sendKeys((String) readTestData.getPassword());
        driver.findElement(loginBtn).click();
        System.out.println("Login is successful");
    }


    public void closeBrowser() {

        driver.quit();
        System.out.println("Browser session has been closed");
    }

}
