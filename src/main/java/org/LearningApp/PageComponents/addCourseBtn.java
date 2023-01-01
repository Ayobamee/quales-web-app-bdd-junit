package org.LearningApp.PageComponents;

import org.LearningApp.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addCourseBtn extends AbstractComponent {
    WebDriver driver;
    By addCourseBtn = By.xpath("//button[normalize-space()='Add Course']");

    public addCourseBtn(WebDriver driver, By addCourseBtn) {
        super(driver, addCourseBtn);
    }

    public void click() {
        findElement(addCourseBtn).click();
    }

}

