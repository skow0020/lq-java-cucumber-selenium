package cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.pages.HomePage;
// import cucumber.pages.CommonPage;
import cucumber.support.Hooks;

public class HomeSteps {
  private HomePage page;
  // private CommonPage commonPage;

  public HomeSteps(Hooks hooks) {
    page = new HomePage(hooks.getDriver());
    // commonPage = new CommonPage(hooks.getDriver());
  }

  @Given("^I am on the home page$")
  public void i_am_on_the_home_page() throws Throwable {
    page.goTo("http://www.literaryquicksand.com");
    page.Trait();
  }
}