package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CoursePage;
import pages.LoginPage;
import utils.driverUtils.loadApp;

import java.io.IOException;

public class EditCourseSteps extends loadApp {

    private WebDriver driver;
    private LoginPage loginPage;


    @Given("I am on the dashboard page")
    public void i_am_on_the_dashboard_page() throws IOException, InterruptedException {
        driver = loadApp();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
    }


    @When("I edit a course")
    public void i_edit_a_course() {
        CoursePage coursePage = new CoursePage(driver);
        coursePage.editCourse();
    }

    @Then("My course should be modified successfully")
    public void my_course_should_be_modified_successfully() {
        LoginPage loginPage = new LoginPage(driver);
        CoursePage coursePage = new CoursePage(driver);
        coursePage.verifyCourseisEdited();
        loginPage.closeBrowser();
    }
}

