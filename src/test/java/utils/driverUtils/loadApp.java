package utils.driverUtils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
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
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//utilities//datadriven.properties");
        prop.load(fis);

        if (prop.getProperty("browser").equals("chrome")) {


            ChromeOptions option = new ChromeOptions();
            option.addArguments("--remote-allow-origins=*");

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(option);


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
