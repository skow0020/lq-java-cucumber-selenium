package cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.pages.CategoryBookListsPage;
import cucumber.pages.CommonPage;
import cucumber.support.Hooks;

public class CategoryBookListsSteps {
  private CategoryBookListsPage page;
  private CommonPage commonPage;

  public CategoryBookListsSteps(Hooks hooks) {
    page = new CategoryBookListsPage(hooks.getDriver());
  }

  @Then("^I can navigate to the Book Lists category$")
  public void i_can_navigate_to_the_Book_Lists_category() throws Throwable {
    throw new PendingException();
  }
}