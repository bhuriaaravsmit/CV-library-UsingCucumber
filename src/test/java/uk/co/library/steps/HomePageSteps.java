package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultsPage;


public class HomePageSteps {

    @Given("I am on homepage")
    public void iAmOnHomepage() {


    }

    @When("I enters JobTitle {string}")
    public void iEntersJobTitle(String jobTitle) {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("I enter Location {string}")
    public void iEnterLocation(String location) {
        new HomePage().enterLocation(location);

    }

    @And("I select distance {string}")
    public void iSelectDistance(String distance) {
        new HomePage().selectDistance(distance);

    }

    @And("I click on moreSearchOptionsLink")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I enter salaryMin  {string}")
    public void iEnterSalaryMin(String minSalary) {
        new HomePage().enterMinSalary(minSalary);

    }

    @And("I enter salaryMax  {string}")
    public void iEnterSalaryMax(String maxSalary) {

        new HomePage().enterMaxSalary(maxSalary);

    }

    @And("I Select salaryType  {string}")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);

    }

    @And("I select jobType {string}")
    public void iSelectJobType(String selectJobType) {
        new HomePage().selectJobType(selectJobType);

    }

    @And("I click on Find JObs button")
    public void iClickOnFindJObsButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("verify the result  {string}")
    public void verifyTheResult(String result) {

        Assert.assertEquals(new ResultsPage().getResultText().getText(), result);
    }
}