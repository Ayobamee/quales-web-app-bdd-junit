package org.LearningApp.Assertions;

import org.LearningApp.PageObjects.LandingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.*;


public class assertions {

    WebDriver driver;

    public assertions(WebDriver driver) {
        this.driver = driver;
    }

    public void assertLandingPageView() {

        String url = "http://tawdry-rule.surge.sh/courses";
        String currenturl = driver.getCurrentUrl();
        assertEquals(url, currenturl);
        System.out.println("Page url is displayed");
        LandingPage landingPage = new LandingPage(driver);
        if (landingPage.getLoginDisplayModal().checkLoginDisplay()) {
            System.out.println("Test passed, user is logged in successfully");
        } else {
            System.out.println("Test failed, user is not logged in successfully");
        }


    }

    public void assertCourseCreation() {

        LandingPage landingPage = new LandingPage(driver);
        if (landingPage.getCourseCreationDisplayModal().checkCourseDisplay()) {
            System.out.println("Test passed, user created course successfully");
        } else {
            System.out.println("Test failed, user could not create course successfully");
        }


    }


    public void assertCourseDeletion() {
        LandingPage landingPage = new LandingPage(driver);
        if (landingPage.getDeleteCourseDisplayModal().checkDeletedCourseDisplay()) {
            System.out.println("Test passed, course was deleted successfully");
        } else {
            System.out.println("Test failed, course was not created");
        }

    }



}