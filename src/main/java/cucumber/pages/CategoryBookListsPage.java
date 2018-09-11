package cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CategoryBookListsPage {
  private WebDriver driver;

  public CategoryBookListsPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  // ---------------------- Web Element Declarations ---------------------------------
}