package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class _10_ApachePOi {
    @When("^User Create citizenship with ApachePOI$")
    public void userCreateCitizenshipWithApachePOI() {
        List<List<String>> list = ExcelUtility.getListData("src/test/java/ApachePoi/resources/ApacheExcel2.xlsx",
                "testCitizen", 2);

        DialogContent dc=new DialogContent();
        for (int i = 0; i <list.size() ; i++) {

            dc.findAndClick("addButton");
            dc.findAndSend("name",list.get(i).get(0));
            dc.findAndSend("shortName",list.get(i).get(1));
            dc.findAndClick("save");
            dc.findAndContainsText("succesMessage","success");
        }
    }

    @Then("^User Delete citizenship with ApachePOI$")
    public void userDeleteCitizenshipWithApachePOI() {
        List<List<String>> list = ExcelUtility.getListData("src/test/java/ApachePoi/resources/ApacheExcel2.xlsx",
                "testCitizen", 1);

        DialogContent dc=new DialogContent();
        for (int i = 0; i <list.size() ; i++) {
            dc.findAndDelete(list.get(i).get(0));
        }
    }
}
