package cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.pages.CategoryBookListsPage;
import cucumber.pages.CommonPage;
import cucumber.support.Hooks;
import org.junit.Assert;

public class CategoryBookListsSteps {
  private CategoryBookListsPage page;
  private CommonPage commonPage;

  public CategoryBookListsSteps(Hooks hooks) {
    page = new CategoryBookListsPage(hooks.getDriver());
    commonPage = new CommonPage(hooks.getDriver());
  }

}