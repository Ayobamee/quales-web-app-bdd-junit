package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class DashboardPage {

    public static WebDriver driver;
    private static By loginAlert = By.xpath("//div[contains(text(),'Login Successfull')]");
    private static By addCourseBtn = By.xpath("//button[normalize-space()='Add Course']");
    private static By profileNameTab = By.xpath("//p[text()='Ayobami']");
    private static By logoutBtn = By.xpath("//button[text()='Log Out']");
    private static By courseSpan = By.xpath("//span[text()='Courses']");

    public boolean checkLoginAlertDisplay() {
        driver.findElement(loginAlert);
        return true;
    }

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyLandingPageUrl() {

        String url = "https://academy.quales.tech/courses";
        String currenturl = driver.getCurrentUrl();
        assertEquals(url, currenturl);
        System.out.println("Page url is displayed");

    }
    // For single assertion
    // public void verifySuccessfulLogin() {
    // assertTrue(checkLoginAlertDisplay());
    // }

    public void verifySuccessfulLogin() {
        By[] elementsToCheck = {
                loginAlert,
                addCourseBtn,
                profileNameTab,
                logoutBtn,
                courseSpan
        };

        for (By locator : elementsToCheck) {
            assertTrue(isElementDisplayed(locator));
        }
    }

    private boolean isElementDisplayed(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            return element.isDisplayed();
        } catch (Exception e) {
            System.out.println("Element not found: " + locator);
            e.printStackTrace();
            return false;
        }
    }

}
