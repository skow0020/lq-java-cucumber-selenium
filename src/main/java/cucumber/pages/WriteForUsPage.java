package cucumber.pages;

import cucumber.helpers.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WriteForUsPage {
  private WebDriver driver;
  private Helpers Helper = new Helpers();

  public WriteForUsPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  // ---------------------- Web Element Declarations ---------------------------------
}