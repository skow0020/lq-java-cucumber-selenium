package cucumber.pages;

import cucumber.helpers.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CategoryBookListsPage {
  private WebDriver driver;
  private Helpers Helper = new Helpers();

  public CategoryBookListsPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  // ---------------------- Web Element Declarations ---------------------------------
}