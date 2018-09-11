package cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WriteForUsPage {
  private WebDriver driver;

  public WriteForUsPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  // ---------------------- Web Element Declarations ---------------------------------
}