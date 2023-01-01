package org.LearningApp.PageComponents;

import org.LearningApp.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class courseDescriptionInputField extends AbstractComponent {
    WebDriver driver;


    By courseDescriptionInputField = By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/textarea[1]");

    public courseDescriptionInputField(WebDriver driver, By courseDescriptionInputField) {
        super(driver, courseDescriptionInputField);
    }

    public void enterCourseDescription() {
        findElement(courseDescriptionInputField).sendKeys("Selenium Description");
    }

}

