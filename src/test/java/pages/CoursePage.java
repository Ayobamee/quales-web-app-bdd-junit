package pages;

import org.openqa.selenium.*;

public class CoursePage {

    private static WebDriver driver;
    private static By addCourseBtn = By.xpath("//button[normalize-space()='Add Course']");
    private static By courseTitleInputField = By.xpath("//input[@data-testid='Title*']");

    private static By courseDescriptionInputField = By.xpath(
            "//textarea[@data-testid='Description*']");

    private static By selectCategoryDropdown = By.xpath("//div[@id='demo-simple-select']");

    private static By qualityAssuranceModule = By.xpath("//li[normalize-space()='Quality Assurance']");

    private static By location = By.cssSelector("input[value='offline']");

    private static By courseLocation = By
            .xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/input[1]");

    private static By secondAddCourseBtn = By.xpath("(//button[normalize-space()='+ Add Course'])[1]");

    private static By addressInputField = By
            .xpath("//input[@data-testid='Address*']");

    private static By courseCreationModal = By.xpath("//div[contains(text(),'Course created successfully')]");

    private static By selectCourseForEdit = By
            .xpath("//div[@class='MuiTypography-root MuiTypography-body1 MuiTypography-gutterBottom css-1cg8cx6']");
    private static By getCourse = By.xpath("//p[text()='Selenium Description']");

    private static By editedCourse = By.xpath("//p[text()='Selenium DescriptionEdit']");

    private static By deleteCourseBtn = By.xpath("//button[text()='Delete']");

    private static By secondDeleteCourseBtn = By.xpath("(//button[text()='Delete']) [2]");

    private static By editBtn = By.xpath("//button[normalize-space()='Edit']");

    private static By updateCourseButton = By.xpath("//button[normalize-space()='Update Course']");

    private static By courseModificationModal = By.xpath("//div[contains(text(),'Course updated successfully')]");

    private static By deleteModificationModal = By.xpath("//div[contains(text(),'Course deleted successfully')]");

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
        // Scroll to location
        WebElement element = driver.findElement(location);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        WebElement addressElement = driver.findElement(addressInputField);
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
        driver.findElement(getCourse).click();
        Dimension size = new Dimension(1536, 960);
        driver.manage().window().setSize(size);
        driver.findElement(editBtn).click();
        driver.findElement(courseDescriptionInputField).clear();
        driver.findElement(courseDescriptionInputField).sendKeys("Edit");
        WebElement updateCourseElement = driver.findElement(updateCourseButton);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", updateCourseElement);
        updateCourseElement.click();
    }

    public boolean checkCourseModification() {
        driver.findElement(courseModificationModal);
        return true;
    }

    public void verifyCourseisEdited() {
        if ((checkCourseModification())) {
            System.out.println("Test passed, user edited course successfully");
        } else {
            System.out.println("Test failed, user could not edit course successfully");

        }

    }

    public void deleteCourse() {
        driver.findElement(editedCourse).click();
        driver.findElement(deleteCourseBtn).click();
        driver.findElement(secondDeleteCourseBtn).click();

    }

    public boolean checkDeleteModification() {
        driver.findElement(deleteModificationModal);
        return true;
    }

    public void verifyCourseIsDeleted() {
        if ((checkDeleteModification())) {
            System.out.println("Test passed , user deleted course successfully");
        }

        else {
            System.out.println("Test failed , Oops, user could not delete course successfully");
        }
    }

}
