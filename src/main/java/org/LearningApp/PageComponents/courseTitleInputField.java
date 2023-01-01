package org.LearningApp.PageComponents;

import org.LearningApp.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class courseTitleInputField extends AbstractComponent {
    WebDriver driver;

    By courseTitleInputField = By.xpath("//input[@data-testid='Title*']");

    public courseTitleInputField(WebDriver driver, By courseTitleInputField) {
        super(driver, courseTitleInputField);
    }

    public void enterCourseTitle() {
        findElement(courseTitleInputField).sendKeys("Selenium test");
    }

}

