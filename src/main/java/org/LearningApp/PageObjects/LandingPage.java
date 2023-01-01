package org.LearningApp.PageObjects;

import org.LearningApp.PageComponents.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    By addCourseBtn = By.xpath("//button[normalize-space()='Add Course']");

    By loginDisplayModal = By.xpath("//div[contains(text(),'Login Successfull')]");

    By courseTitleInputField = By.xpath("//input[@data-testid='Title*']");

    By courseDescriptionInputField = By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/textarea[1]");

    By selectCategoryDropdown = By.xpath("//div[@id='demo-simple-select']");

    By qualityAssuranceModule = By.xpath("//li[normalize-space()='Quality Assurance']");

    By premiumCheckbox = By.xpath("//input[@type='checkbox']");

    By location = By.xpath("//input[@value='offline']");

    By courseLocation = By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/input[1]");

    By addCourse = By.xpath("(//button[normalize-space()='+ Add Course'])[1]");

    By courseCreationDisplayModal = By.xpath("//div[contains(text(),'Course created successfully')]");

    By createdCourse = By.xpath("//div[normalize-space()='Selenium test']");

    By deleteBtn = By.xpath("//button[normalize-space()='Delete']");

    By confirmDelete = By.xpath("/html[1]/body[1]/div[2]/div[3]/button[1]");

    By deleteCourseDisplayModal = By.xpath("//div[contains(text(),'Course deleted successfully')]");

    WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public LandingPage() {
    }

    public addCourseBtn getAddCourseBtn() {
        return new addCourseBtn(driver, addCourseBtn);
    }


    public courseTitleInputField getCourseTitleInputField() {
        return new courseTitleInputField(driver, courseTitleInputField);
    }

    public courseDescriptionInputField getCourseDescriptionInputField() {
        return new courseDescriptionInputField(driver, courseDescriptionInputField);
    }

    public selectCategoryDropdown getSelectCategoryDropdown() {
        return new selectCategoryDropdown(driver, selectCategoryDropdown);
    }

    public qualityAssuranceModule getQualityAssuranceModule() {
        return new qualityAssuranceModule(driver, qualityAssuranceModule);
    }

    public premiumCheckbox getPremiumCheckbox() {
        return new premiumCheckbox(driver, premiumCheckbox);
    }

    public location getLocation() {
        return new location(driver, location);
    }

    public courseLocation getCourseLocation() {
        return new courseLocation(driver, courseLocation);
    }

    public addCourse getAddCourse() {
        return new addCourse(driver, addCourse);
    }

    public courseCreationDisplayModal getCourseCreationDisplayModal() {
        return new courseCreationDisplayModal(driver, courseCreationDisplayModal);
    }

    public createdCourse getCreatedCourse() {
        return new createdCourse(driver, createdCourse);
    }

    public deleteBtn getDeleteBtn() {
        return new deleteBtn(driver, deleteBtn);
    }

    public confirmDelete getConfirmDelete() {
        return new confirmDelete(driver, confirmDelete);
    }


    public deleteCourseDisplayModal getDeleteCourseDisplayModal() {
        return new deleteCourseDisplayModal(driver, deleteCourseDisplayModal);
    }

    public loginDisplayModal getLoginDisplayModal() {
        return new loginDisplayModal(driver, loginDisplayModal);
    }





}
