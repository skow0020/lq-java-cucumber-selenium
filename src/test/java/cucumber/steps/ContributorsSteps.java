package cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
// import cucumber.pages.ContributorsPage;
// import cucumber.pages.CommonPage;
import cucumber.support.Hooks;
import org.junit.Assert;

public class ContributorsSteps {
  // private ContributorsPage page;
  // private CommonPage commonPage;

  public ContributorsSteps(Hooks hooks) {
    // page = new ContributorsPage(hooks.getDriver());
    // commonPage = new CommonPage(hooks.getDriver());
  }

  @When("^I navigate to the contributors page$")
  public void i_navigate_to_the_contributors_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }

  @Then("^I can view the info of Joli$")
  public void i_can_view_the_info_of_Joli() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }
}