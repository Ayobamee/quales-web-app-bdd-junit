package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CoursePage;
import pages.LoginPage;
import utils.driverUtils.loadApp;

import java.io.IOException;

public class DeleteCourseSteps extends loadApp {

    private WebDriver driver;

    @Given("I am on the dashboard page with the intention to delete a course")
    public void i_am_on_the_dashboard_page_with_the_intention_to_delete_a_course()
            throws IOException, InterruptedException {
        driver = loadApp();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
    }

    @When("I delete a course")
    public void i_delete_a_course() {
        CoursePage coursePage = new CoursePage(driver);
        coursePage.deleteCourse();
    }

    @Then("My course should be deleted successfully")
    public void my_course_should_be_deleted_successfully() {
        LoginPage loginPage = new LoginPage(driver);
        CoursePage coursePage = new CoursePage(driver);
        coursePage.verifyCourseIsDeleted();
        loginPage.closeBrowser();
    }
}
