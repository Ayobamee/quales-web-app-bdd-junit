package utils.driverUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class loadApp {
    public WebDriver driver;
    public Properties prop;

    public WebDriver loadApp() throws IOException, InterruptedException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream(
                System.getProperty("user.dir") + "//utilities//datadriven.properties");
        prop.load(fis);

        if (prop.getProperty("browser").equals("chrome")) {
            // Print the version of the driver that was downloaded
            System.out.println(
                    "Downloaded ChromeDriver version: " + WebDriverManager.chromedriver().getDownloadedDriverVersion());
            WebDriverManager.chromedriver().setup();
            // Create ChromeOptions instance to set preferences
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--window-size=1920,1080"); // Adjust the window size as needed
            options.addArguments("--remote-allow-origins=*");
            options.setHeadless(false);
            // Initialize the WebDriver with ChromeOptions
            driver = new ChromeDriver(options);

            //To make test run on firefox
            // WebDriverManager.firefoxdriver().useMirror().setup();
            // driver = new FirefoxDriver();

        } else if (prop.getProperty("browser").equals("firefox")) {
            driver = new FirefoxDriver();
            

        } else {

            driver = new InternetExplorerDriver();

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Open the quales app home page.
        driver.get("https://academy.quales.tech");
        System.out.println("The home page has been opened");

        return driver;
    }

}
