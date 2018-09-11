package cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.pages.CommonPage;
import cucumber.support.*;
import cucumber.pages.WriteForUsPage;

public class WriteForUsSteps {
  private WriteForUsPage page;
  private CommonPage commonPage;

  public WriteForUsSteps(Hooks hooks) {

    page = new WriteForUsPage(hooks.getDriver());
    commonPage = new CommonPage(hooks.getDriver());
  }

}
