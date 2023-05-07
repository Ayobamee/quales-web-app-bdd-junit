package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;


public class DashboardPage {

    public static WebDriver driver;
    private static By loginAlert = By.xpath("//div[contains(text(),'Login Successfull')]");

    public boolean checkLoginAlertDisplay() {
        driver.findElement(loginAlert);
        return true;
    }


    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }


    public void verifyLandingPageView() {

        String url = "https://academy.quales.tech/courses";
        String currenturl = driver.getCurrentUrl();
        assertEquals(url, currenturl);
        System.out.println("Page url is displayed");

    }

    public void verifyLoginAlertDisplay() {
        assertTrue(checkLoginAlertDisplay());

    }
}


