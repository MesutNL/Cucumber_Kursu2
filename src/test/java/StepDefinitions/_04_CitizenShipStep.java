package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _04_CitizenShipStep {
    @And("^Navigate to Citizenships page$")
    public void navigateToCitizenshipsPage() {
        LeftNav ln=new LeftNav();
        ln.findAndClick("setupOne");// setup
        ln.findAndClick("parameters"); // parameteres
        ln.findAndClick("citizenShip");//citizenships


    }

    @When("^USer a Citizenships name as \"([^\"]*)\" short name as \"([^\"]*)\"$")
    public void userACitizenshipsNameAsShortNameAs(String name, String shortName) {
        DialogContent dc=new DialogContent();
        dc.findAndClick("addButton");
        dc.findAndSend("name",name);
        dc.findAndSend("shortName",shortName);
        dc.findAndClick("save");
        Parent.delay(2);
    }

    @Then("^Already exits should be displayed$")
    public void alreadyExitsShouldBeDisplayed() {
        DialogContent dc=new DialogContent();


        dc.findAndContainsText("alreadyExist","already exists");
    }

    @And("^Click on clos button$")
    public void clickOnClosButton() {
        DialogContent dc=new DialogContent();
        dc.findAndClick("closeDialog");
    }

    @When("^User delete the \"([^\"]*)\"$")
    public void userDeleteThe(String name) {
        DialogContent dc=new DialogContent();
        dc.findAndDelete(name);


    }
}
