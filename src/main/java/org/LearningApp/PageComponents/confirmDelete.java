package org.LearningApp.PageComponents;

import org.LearningApp.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class confirmDelete extends AbstractComponent {
    WebDriver driver;
    By confirmDelete = By.xpath("/html[1]/body[1]/div[2]/div[3]/button[1]");

    public confirmDelete(WebDriver driver, By confirmDelete) {
        super(driver, confirmDelete);
    }

    public void click() {
        findElement(confirmDelete).click();
    }

}

