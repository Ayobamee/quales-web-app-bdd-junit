package org.LearningApp.PageComponents;

import org.LearningApp.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class selectCategoryDropdown extends AbstractComponent {
    WebDriver driver;


    By selectCategoryDropdown = By.xpath("//div[@id='demo-simple-select']");
    public selectCategoryDropdown(WebDriver driver, By selectCategoryDropdown) {
        super(driver, selectCategoryDropdown);
    }

    public void chooseCourseCategory() {
        findElement(selectCategoryDropdown).click();
    }

}

