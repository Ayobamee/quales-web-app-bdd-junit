package org.LearningApp.PageComponents;

import org.LearningApp.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class location extends AbstractComponent {
    WebDriver driver;


    By location = By.xpath("//input[@value='offline']");
    public location(WebDriver driver, By location) {
        super(driver, location);
    }

    public void chooseOffline() {
        findElement(location).click();
    }

}

