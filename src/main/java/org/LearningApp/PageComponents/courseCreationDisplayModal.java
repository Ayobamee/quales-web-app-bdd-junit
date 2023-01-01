package org.LearningApp.PageComponents;

import org.LearningApp.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class courseCreationDisplayModal extends AbstractComponent {
    WebDriver driver;
    By courseCreationDisplayModal = By.xpath("//div[contains(text(),'Course created successfully')]");
    public courseCreationDisplayModal(WebDriver driver, By courseCreationDisplayModal) {
        super(driver, courseCreationDisplayModal);
    }

    public boolean checkCourseDisplay() {
        findElement(courseCreationDisplayModal);
        return true;
    }

}

