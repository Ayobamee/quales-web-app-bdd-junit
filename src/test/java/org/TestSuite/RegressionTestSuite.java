package org.TestSuite;

import org.LearningApp.Actions.actions;
import org.LearningApp.Assertions.assertions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import reusable.signIn;

import java.io.IOException;

public class RegressionTestSuite extends signIn {

    @BeforeTest
    public void SignIn() throws InterruptedException, IOException {
        // Load app.
        driver = signIn();
    }

     //Test that user can access the Quales App landing page successfully.
    @Test
    public void authloginTest() throws InterruptedException, IOException {

        assertions assertObj = new assertions(driver);
        // Assert landing page view
        assertObj.assertLandingPageView();

    }

     // Test that user can create a course successfully.
     @Test
     public void createCourseTest() throws InterruptedException, IOException {
         // Performs some test actions
         actions actionsObj = new actions(driver);
         assertions assertObj = new assertions(driver);
         //Create course
         actionsObj.createCourse();
         //Assert course creation
         assertObj.assertCourseCreation();
     }


    // Test that user can delete a course successfully.
    @Test
    public void deleteCourseTest() throws InterruptedException, IOException {
        // Performs some test actions
        actions actionsObj = new actions(driver);
        assertions assertObj = new assertions(driver);
        //Delete course
        actionsObj.deleteCourse();
        //Assert course deletion
        assertObj.assertCourseDeletion();

    }


    @AfterTest
    public void teardown() throws InterruptedException, IOException {
        // close the app
        driver.quit();

    }
}
