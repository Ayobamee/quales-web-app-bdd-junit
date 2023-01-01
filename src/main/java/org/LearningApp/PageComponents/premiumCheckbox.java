package org.LearningApp.PageComponents;

import org.LearningApp.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class premiumCheckbox extends AbstractComponent {
    WebDriver driver;


    By premiumCheckbox = By.xpath("//input[@type='checkbox']");
    public premiumCheckbox(WebDriver driver, By premiumCheckbox) {
        super(driver, premiumCheckbox);
    }

    public void choosePremiumCategory() {
        findElement(premiumCheckbox).click();
    }

}

