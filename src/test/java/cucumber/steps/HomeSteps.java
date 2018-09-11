package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.pages.HomePage;
import cucumber.support.Hooks;

public class HomeSteps {
  private HomePage page;

  public HomeSteps(Hooks hooks) {
    page = new HomePage(hooks.getDriver());
  }

  @Given("^I am on the home page$")
  public void i_am_on_the_home_page() throws Throwable {
    page.goTo();
    page.Trait();
  }
}