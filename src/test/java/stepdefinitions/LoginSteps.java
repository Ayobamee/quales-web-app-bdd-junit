package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.After;
import org.openqa.selenium.WebDriver;

import pages.DashboardPage;
import pages.LoginPage;
import reusable.loadApp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoginSteps extends loadApp {

    private WebDriver driver;
    private LoginPage loginPage;
    Properties prop = new Properties();
    FileInputStream fis = new FileInputStream("src/test/resources/testdata.properties");

    public LoginSteps() throws FileNotFoundException {
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() throws IOException, InterruptedException {

        driver = loadApp();
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() throws IOException {

        prop.load(fis);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickSignInButton();
        loginPage.enterUsername(prop.getProperty("username"));
        loginPage.enterPassword(prop.getProperty("password"));
    }

    @When("click the login button")
    public void click_the_login_button() {


        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();

    }

    @Then("I should be redirected to the dashboard page")
    public void i_should_be_redirected_to_the_dashboard_page() {
        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.verifyLandingPageView();
        dashboardPage.verifyLoginAlertDisplay();
        loginPage.closeBrowser();

    }




}

