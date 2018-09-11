package cucumber.pages;

import cucumber.pages.CommonPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class HomePage {
  private WebDriver driver;
  private CommonPage common;
  private String url = "http://www.literaryquicksand.com";

  public HomePage(WebDriver driver) {
    this.driver = driver;
    this.common = new CommonPage(driver);
    PageFactory.initElements(driver, this);
  }

  public void goTo() {
    driver.navigate().to(url);
  }

  public void Trait() {
    common.waitForElement(pageHeader, 10000);
    pageHeader.click();
  }

  // ---------------------- Web Element Declarations ---------------------------------
  @FindBy(css = "[alt=\"Literary Quicksand\"]")
  public WebElement pageHeader;
}