package StepDefinitions;

import Pages.FormContent;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class _09_AddEmployees {
    FormContent fc = new FormContent();

    @When("^User sending the keys in Form Content$")
    public void userSendingTheKeysInFormContent(List< List<String> > data) {
        for(int i=0;i<data.size();i++)
        {
            fc.findAndSend(data.get(i).get(0), data.get(i).get(1));
        }

    }



    @And("^User delete the \"([^\"]*)\" employee$")
    public void userDeleteTheEmployee(String name)  {
       fc.findAndDelete(name);
    }
}

