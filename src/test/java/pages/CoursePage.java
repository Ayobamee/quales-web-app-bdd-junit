package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;


public class CoursePage {

    private static WebDriver driver;
    private static By addCourseBtn = By.xpath("//button[normalize-space()='Add Course']");
    private static By courseInputField = By.xpath("//input[@data-testid='Title*']");


    public CoursePage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickAddCourse() {
        driver.findElement(addCourseBtn).click();
    }

    public void enterCourseTitle() {
        driver.findElement(courseInputField).sendKeys("Selenium test");
    }


}


