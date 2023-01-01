package org.LearningApp.PageComponents;

import org.LearningApp.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class createdCourse extends AbstractComponent {
    WebDriver driver;
    By createdCourse = By.xpath("//div[normalize-space()='Selenium test']");

    public createdCourse(WebDriver driver, By createdCourse) {
        super(driver, createdCourse);
    }

    public void click() {
        findElement(createdCourse).click();
    }

}

