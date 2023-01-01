package org.LearningApp.PageComponents;

import org.LearningApp.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class qualityAssuranceModule extends AbstractComponent {
    WebDriver driver;


    By qualityAssuranceModule = By.xpath("//li[normalize-space()='Quality Assurance']");
    public qualityAssuranceModule(WebDriver driver, By qualityAssuranceModule) {
        super(driver, qualityAssuranceModule);
    }

    public void chooseQualityAssurance() {
        findElement(qualityAssuranceModule).click();
    }

}

