package org.LearningApp.PageComponents;

import org.LearningApp.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class deleteBtn extends AbstractComponent {
    WebDriver driver;
    By deleteBtn = By.xpath("//button[normalize-space()='Delete']");

    public deleteBtn(WebDriver driver, By deleteBtn) {
        super(driver, deleteBtn);
    }

    public void click() {
        findElement(deleteBtn).click();
    }

}

