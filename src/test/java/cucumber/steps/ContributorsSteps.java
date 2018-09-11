package cucumber.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.pages.ContributorsPage;
import cucumber.support.Hooks;

public class ContributorsSteps {
  private ContributorsPage page;

  public ContributorsSteps(Hooks hooks) {
    page = new ContributorsPage(hooks.getDriver());
  }

  @When("^I navigate to the contributors page$")
  public void i_navigate_to_the_contributors_page() throws Throwable {
    page.goTo();
  }

  @Then("^I can view the info of Joli$")
  public void i_can_view_the_info_of_Joli() throws Throwable {
    page.viewContributorInfo();
  }
}