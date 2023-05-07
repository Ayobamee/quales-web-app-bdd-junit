package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import pages.DashboardPage;
import pages.LoginPage;
import utils.driverUtils.loadApp;
import utils.filereader.readProperties;


import java.io.IOException;


public class LoginSteps extends loadApp {

    private WebDriver driver;
    private LoginPage loginPage;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() throws IOException, InterruptedException {

        driver = loadApp();
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() throws IOException {

        readProperties readTestData = new readProperties();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickSignInButton();
        loginPage.enterUsername((String) readTestData.getUsername());
        loginPage.enterPassword((String) readTestData.getPassword());

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

