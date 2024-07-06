package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.CoursePage;
import utils.driverUtils.loadApp;

import java.io.IOException;

public class CreateCourseSteps extends loadApp {

    private WebDriver driver;
    @Given("I am present on the dashboard page")
    public void i_am_present_on_the_dashboard_page() throws IOException, InterruptedException {

        driver = loadApp();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();

    }

    @When("I select the desktop view port")
    public void i_select_the_desktop_view_port() throws IOException {
        CoursePage coursePage = new CoursePage(driver);
        coursePage.clickAddCourse();
        Dimension size = new Dimension(1536, 960);
        driver.manage().window().setSize(size);

    }

    @And("I input my course details")
    public void i_input_my_course_details() {
        CoursePage coursePage = new CoursePage(driver);
        coursePage.fillCourseCreationForm();
    }

    @Then("My course should be created successfully")
    public void my_course_should_be_created_successfully() {
        LoginPage loginPage = new LoginPage(driver);
        CoursePage coursePage = new CoursePage(driver);
        coursePage.verifyCourseIsCreated();
        loginPage.closeBrowser();
    }




}

