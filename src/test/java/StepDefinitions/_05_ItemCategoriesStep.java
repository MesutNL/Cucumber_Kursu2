package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.BaseDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class _05_ItemCategoriesStep {
    @And("^Navigate to Item Category page$")
    public void navigateToItemCategoryPage() {
        LeftNav lc = new LeftNav();
        lc.findAndClick("inventory");
        lc.findAndClick("setupTwo");
        lc.findAndClick("itemCategories");

    }

    @When("^User create a item categories name as \"([^\"]*)\" short name as\"([^\"]*)\"$")
    public void userCreateAItemCategoriesNameAsShortNameAs(String name, String usertype) {
        DialogContent dc = new DialogContent();
        dc.findAndClick("addButton");
        dc.findAndSend("name", name);
        dc.findAndClick("userTypeclick");
        dc.SelectYserType("userTypesAllOptions",usertype);
        dc.findAndClick("save");


    }
}
