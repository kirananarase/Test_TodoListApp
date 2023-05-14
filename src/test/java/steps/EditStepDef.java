package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.EditPage;
import pages.HomePage;

public class EditStepDef {

    private EditPage editPage;
    private WebDriver driver;

    public EditStepDef(Hook hook) throws Exception {
        this.driver = hook.getDriver();
        editPage = new EditPage(driver);
    }

    @When("^I click on the todo item in the todos list$")
    public void iClickOnTheTodoItemInTheTodosList() {
        editPage.clickOnTodoItemNameToEdit();
    }

    @Then("^I should see the todo details in the textbox$")
    public void iShouldSeeTheTodoDetailsInTheTextbox() {
    }

    @And("^I should be able to edit the todo details$")
    public void iShouldBeAbleToEditTheTodoDetails() {
    }

    @And("^I should be able to save the changes$")
    public void iShouldBeAbleToSaveTheChanges() {
    }

    @And("^the updated todo detail should appear in the todos list$")
    public void theUpdatedTodoDetailShouldAppearInTheTodosList() {
    }
}