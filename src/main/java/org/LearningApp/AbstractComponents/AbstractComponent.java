package org.LearningApp.AbstractComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbstractComponent {

    WebElement continueElement;

    public AbstractComponent(WebDriver driver, By continueElement) {

        this.continueElement = driver.findElement(continueElement);
    }

    public WebElement findElement(By findElementBy) {
        return continueElement.findElement(findElementBy);

    }

}
