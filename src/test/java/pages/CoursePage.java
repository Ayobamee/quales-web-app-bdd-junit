package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;


public class CoursePage {

    private static WebDriver driver;
    private static By addCourseBtn = By.xpath("//button[normalize-space()='Add Course']");
    private static By courseTitleInputField = By.xpath("//input[@data-testid='Title*']");

    private static  By courseDescriptionInputField = By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/textarea[1]");


    public CoursePage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickAddCourse() {
        driver.findElement(addCourseBtn).click();
    }

    public void enterCourseTitle() {
        driver.findElement(courseTitleInputField).sendKeys("Selenium test");
    }

    public void enterCourseDescription() {
        driver.findElement(courseDescriptionInputField).sendKeys("Selenium Description");
    }


}


