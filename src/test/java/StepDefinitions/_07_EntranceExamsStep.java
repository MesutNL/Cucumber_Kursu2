package StepDefinitions;

import Pages.FormContent;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class _07_EntranceExamsStep {
    FormContent fc = new FormContent();

    @And("^Click on the element in the Form Content$")
    public void clickOnTheElementInTheFormContent(DataTable elements) {
        List<String> Listelement = elements.asList(String.class);
        System.out.println(elements);

        for (int i = 0; i < Listelement.size(); i++) {
            fc.findAndClick(Listelement.get(i));
        }

    }

    @When("^User delete the  \"([^\"]*)\" from Form$")
    public void userDeleteTheFromForm(String examName) {

        fc.findAndDelete(examName);
    }
}
