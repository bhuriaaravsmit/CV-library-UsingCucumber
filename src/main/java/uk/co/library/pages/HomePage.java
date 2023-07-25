package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleTextField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationTextField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
   // @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    public void enterJobTitle(String jobTitle) {

        sendTextToElement(jobTitleTextField,jobTitle);
        log.info("Entering Job title" +jobTitleTextField.toString() );

    }

    public void enterLocation(String location) {

        sendTextToElement(locationTextField,location);
        log.info("Entering the location" +locationTextField.toString() );

    }

    public void selectDistance(String distance) {

        selectByVisibleTextFromDropDown(distanceDropDown,distance);

    }

    public void clickOnMoreSearchOptionLink() {

        clickOnElement(moreSearchOptionsLink);
        log.info("clicking on more search options" +moreSearchOptionsLink.toString() );

    }

    public void enterMinSalary(String minSalary) {

        sendTextToElement(salaryMin,minSalary);
        log.info("Entering the minimum salary" +salaryMin.toString() );

    }

    public void enterMaxSalary(String maxSalary) {

        sendTextToElement(salaryMax,maxSalary);
        log.info("Entering the maximum salary" +salaryMax.toString() );


    }

    public void selectSalaryType(String sType) {

        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);

    }

    public void selectJobType(String jobType) {

        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);

    }

    public void clickOnFindJobsButton() {

        clickOnElement(findJobsBtn);
        log.info("Clicking on findJons button" +findJobsBtn.toString() );

    }













}
