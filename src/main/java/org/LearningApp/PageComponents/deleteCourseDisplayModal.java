package org.LearningApp.PageComponents;

import org.LearningApp.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class deleteCourseDisplayModal extends AbstractComponent {
    WebDriver driver;
    By deleteCourseDisplayModal = By.xpath("//div[contains(text(),'Course deleted successfully')]");
    public deleteCourseDisplayModal(WebDriver driver, By deleteCourseDisplayModal) {
        super(driver, deleteCourseDisplayModal);
    }

    public boolean checkDeletedCourseDisplay() {
        findElement(deleteCourseDisplayModal);
        return true;
    }

}

