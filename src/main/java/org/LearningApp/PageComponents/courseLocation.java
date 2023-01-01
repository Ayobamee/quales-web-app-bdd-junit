package org.LearningApp.PageComponents;

import org.LearningApp.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class courseLocation extends AbstractComponent {
    WebDriver driver;


    By courseLocation = By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/input[1]");
    public courseLocation(WebDriver driver, By courseLocation) {
        super(driver, courseLocation);
    }

    public void chooseChooseUrl() {
        findElement(courseLocation).sendKeys("34b Magodo Ikeja");
    }

}

