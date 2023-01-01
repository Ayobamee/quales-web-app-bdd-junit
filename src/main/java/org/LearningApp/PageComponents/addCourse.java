package org.LearningApp.PageComponents;

import org.LearningApp.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addCourse extends AbstractComponent {
    WebDriver driver;
    By addCourse = By.xpath("(//button[normalize-space()='+ Add Course'])[1]");

    public addCourse(WebDriver driver, By addCourse) {
        super(driver, addCourse);
    }

    public void click() {
        findElement(addCourse).click();
    }

}

