package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

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

    }

    public void login() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/test/resources/testdata.properties");
        prop.load(fis);
        driver.findElement(signInBtn).click();
        driver.findElement(emailField).sendKeys(prop.getProperty("username"));
        driver.findElement(passwordField).sendKeys(prop.getProperty("password"));
        driver.findElement(loginBtn).click();
    }

}
