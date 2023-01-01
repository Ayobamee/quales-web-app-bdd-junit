package org.LearningApp.PageComponents;

import org.LearningApp.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginDisplayModal extends AbstractComponent {
    WebDriver driver;
    By loginDisplayModal = By.xpath("//div[contains(text(),'Login Successfull')]");
    public loginDisplayModal(WebDriver driver, By loginDisplayModal) {
        super(driver, loginDisplayModal);
    }

    public boolean checkLoginDisplay() {
        findElement(loginDisplayModal);
        return true;
    }

}

