package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class _06_DataTableSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("^Click on the element in the left Nav$")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {
        //elementsi String
        List<String> Listelement = elements.asList(String.class);
        System.out.println(elements);

        for (int i = 0; i < Listelement.size(); i++) {
            ln.findAndClick(Listelement.get(i));
        }

    }

    @And("^Click on the element in The Dialog$")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String> Listelement = elements.asList(String.class);
        System.out.println(elements);

        for (int i = 0; i < Listelement.size(); i++) {
            dc.findAndClick(Listelement.get(i));
        }
    }

    @When("^User sending the keys in Dialog Content$")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String>> Listelement = elements.asLists(String.class);

        for (int i = 0; i < Listelement.size(); i++) {
            dc.findAndSend(Listelement.get(i).get(0),Listelement.get(i).get(1));
        }
    }
}
