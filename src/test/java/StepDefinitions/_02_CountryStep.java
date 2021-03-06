package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountryStep {
    DialogContent dc=new DialogContent();
    @Then("^Success message should be displayed$")
    public void successMessageShouldBeDisplayed() {
        DialogContent dc=new DialogContent();


        dc.findAndContainsText("succesMessage","success");

    }

    @When("^Create a country$")
    public void createACountry() {
        String randomGenName= RandomStringUtils.randomAlphabetic(8);
        String randomGenCode=RandomStringUtils.randomAlphabetic(4);
        DialogContent dc=new DialogContent();
        dc.findAndClick("addButton");
        dc.findAndSend("name",randomGenName );
        dc.findAndSend("code",randomGenCode);
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
    public void userEditTheTo(String oldname, String newname)  {
        dc.findAndEdit(oldname, newname);
    }

    @When("^User delete the new \"([^\"]*)\"$")
    public void userDeleteTheNew(String newname) {
      dc.findAndDelete(newname);
    }
}
