package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.UsedPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class buySteps {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHoverOnBuyAndSellTab();
    }

    @And("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCar();
    }

    @Then("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage(String search)  {
        Assert.assertTrue("not matched", new HomePage().verifyNewAndUsedCar().toLowerCase().contains(search));
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String makeTab) {
        new HomePage().selectFromMakeAnyTab(makeTab);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
        new HomePage().selectAnyModel(model);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
        new HomePage().selectAnyLocation(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price1) {
        new HomePage().selectLowPrice(price1);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new HomePage().clickOnFindMyNextCarButton();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String carName) {
        Assert.assertTrue("not found", new HomePage().verifyMyMakeText().contains(carName));
    }

    @And("^I click 'Used' link$")
    public void iClickUsedLink() {
        new UsedPage().clickonUsedTab();
    }
}
