package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LoginPage;
import pages.CoursePage;
import reusable.loadApp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CreateCourse extends loadApp {

    private WebDriver driver;
    private LoginPage loginPage;
    Properties prop = new Properties();
    FileInputStream fis = new FileInputStream("src/test/resources/testdata.properties");

    public CreateCourse() throws FileNotFoundException {
    }

    @Given("I am on the dashboard page")
    public void i_am_on_the_dashboard_page() throws IOException, InterruptedException {

        driver = loadApp();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();

    }

    @When("I choose the desktop view port")
    public void i_choose_the_desktop_view_port() throws IOException {
        CoursePage coursePage = new CoursePage(driver);
        coursePage.clickAddCourse();
        Dimension size = new Dimension(1536, 960);
        driver.manage().window().setSize(size);

    }

    @When("I input my course details")
    public void i_input_my_course_details() {
        CoursePage coursePage = new CoursePage(driver);
        coursePage.enterCourseTitle();


    }
//
//    @Then("I should be redirected to the dashboard page")
//    public void i_should_be_redirected_to_the_dashboard_page() {
//        DashboardPage dashboardPage = new DashboardPage(driver);
//        dashboardPage.verifyLandingPageView();
//        dashboardPage.verifyLoginAlertDisplay();
//
//    }

}

