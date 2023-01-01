package org.LearningApp.Actions;

import org.LearningApp.PageObjects.LandingPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class actions {

    WebDriver driver;

    public actions(WebDriver driver) {
        this.driver = driver;
    }

    public void createCourse() {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.getAddCourseBtn().click();
        Dimension size = new Dimension(1536, 960);
        driver.manage().window().setSize(size);
        landingPage.getCourseTitleInputField().enterCourseTitle();
        landingPage.getCourseDescriptionInputField().enterCourseDescription();
        landingPage.getSelectCategoryDropdown().chooseCourseCategory();
        landingPage.getQualityAssuranceModule().chooseQualityAssurance();
//        landingPage.getPremiumCheckbox().choosePremiumCategory();
        landingPage.getLocation().chooseOffline();
        landingPage.getCourseLocation().chooseChooseUrl();
        landingPage.getAddCourse().click();


    }


    public void deleteCourse() {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.getCreatedCourse().click();
        landingPage.getDeleteBtn().click();
        landingPage.getConfirmDelete().click();

    }




}