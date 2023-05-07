package pages;

import org.openqa.selenium.*;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;


public class CoursePage {

    private static WebDriver driver;
    private static By addCourseBtn = By.xpath("//button[normalize-space()='Add Course']");
    private static By courseTitleInputField = By.xpath("//input[@data-testid='Title*']");

    private static By courseDescriptionInputField = By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/textarea[1]");

    private static By selectCategoryDropdown = By.xpath("//div[@id='demo-simple-select']");

    private static By qualityAssuranceModule = By.xpath("//li[normalize-space()='Quality Assurance']");

    private static By location = By.xpath("//input[@value='offline']");

    private static By courseLocation = By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/input[1]");

    private static By secondAddCourseBtn = By.xpath("(//button[normalize-space()='+ Add Course'])[1]");

    private static By address = By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/input[1]");

    private static By courseCreationModal = By.xpath("//div[contains(text(),'Course created successfully')]");

    private static By editCourseModal = By.xpath("//div[@class='MuiTypography-root MuiTypography-body1 MuiTypography-gutterBottom css-1cg8cx6']");

    private static By updateCourse = By.xpath("//button[normalize-space()='Edit']");

    private static By updateCourseButton = By.xpath("//button[normalize-space()='Update Course']");

    private static By courseModificationModal = By.xpath("//div[contains(text(),'Course updated successfully')]");

    public CoursePage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickAddCourse() {
        driver.findElement(addCourseBtn).click();
    }


    public void fillCourseCreationForm() {
        driver.findElement(courseTitleInputField).sendKeys("Selenium test");
        driver.findElement(courseDescriptionInputField).sendKeys("Selenium Description");
        driver.findElement(selectCategoryDropdown).click();
        driver.findElement(qualityAssuranceModule).click();
        driver.findElement(location).click();
        WebElement addressElement = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/input[1]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", addressElement);
        addressElement.sendKeys("Quales address");
        driver.findElement(secondAddCourseBtn).click();

    }

    public boolean checkCourseCreation() {
        driver.findElement(courseCreationModal);
        return true;
    }

    public void verifyCourseIsCreated() {
        if ((checkCourseCreation())) {
            System.out.println("Test passed, user created course successfully");
        } else {
            System.out.println("Test failed, user could not create course successfully");
        }

    }

    public void editCourse() {
        driver.findElement(editCourseModal).click();
        Dimension size = new Dimension(1536, 960);
        driver.manage().window().setSize(size);
        driver.findElement(updateCourse).click();
        WebElement updateCourseElement = driver.findElement(updateCourseButton);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", updateCourseElement);
        updateCourseElement.click();
    }


    public boolean checkCourseModification() {
        driver.findElement(courseModificationModal);
        return true;
    }

    public void verifyCourseisEdited()
    {
        if ((checkCourseModification())) {
            System.out.println("Test passed, user edited course successfully");
        } else {
            System.out.println("Test failed, user could not edit course successfully");

        }

    }


}


