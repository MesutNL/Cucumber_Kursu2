package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _02_CountryStep {
    DialogContent dc=new DialogContent();
    @Then("^Success message should be displayed$")
    public void successMessageShouldBeDisplayed() {
        DialogContent dc=new DialogContent();


        dc.findAndContainsText("succesMessage","success");

    }

    @When("^Create a country$")
    public void createACountry() {
        DialogContent dc=new DialogContent();
        dc.findAndClick("addButton");
        dc.findAndSend("name","Asistan972");
        dc.findAndSend("code","111111111");
        dc.findAndClick("save");
        Parent.delay(2);

    }

    @And("^Navigate to country page$")
    public void navigateToCountryPage() throws InterruptedException {
        LeftNav ln=new LeftNav();

        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("country");
        Thread.sleep(5000);
    }

    @When("^Create a country name as \"([^\"]*)\" code as \"([^\"]*)\"$")
    public void createACountryNameAsCodeAs(String name, String code){
        DialogContent dc=new DialogContent();
        dc.findAndClick("addButton");
        dc.findAndSend("name",name);
        dc.findAndSend("code",code);
        dc.findAndClick("save");
        Parent.delay(2);
    }

    @When("^User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditTheTo(String oldname, String newname) throws Throwable {
        dc.findAndEdit(oldname, newname);
    }

    @When("^User delete the new \"([^\"]*)\"$")
    public void userDeleteTheNew(String newname) throws Throwable {
      dc.findAndDelete(newname);
    }
}
