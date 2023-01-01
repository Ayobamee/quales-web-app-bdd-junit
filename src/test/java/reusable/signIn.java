package reusable;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class signIn {
    public WebDriver driver;
    public Properties prop;

    public WebDriver signIn() throws IOException, InterruptedException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//utilities//datadriven.properties");
        prop.load(fis);

        if (prop.getProperty("browser").equals("chrome")) {
            // System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver//chromedriver");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (prop.getProperty("browser").equals("firefox")) {
            driver = new FirefoxDriver();

        } else {

            driver = new InternetExplorerDriver();

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Open the Quales App home page.
        // driver.get(prop.getProperty("URL"));
        driver.get("http://tawdry-rule.surge.sh/");
        driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
        driver.findElement(By.cssSelector("input[data-testid=EmailAddress]")).sendKeys("ay@mail.com");
        driver.findElement(By.cssSelector("input[data-testid=Password]")).sendKeys("pass1234");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        return driver;
    }

}
