package cucumber.pages;

import cucumber.pages.CommonPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class ContributorsPage {
  private WebDriver driver;
  private CommonPage common;
  
  private String url = "http://www.literaryquicksand.com/contributors";

  public ContributorsPage(WebDriver driver) {
    this.driver = driver;
    this.common = new CommonPage(driver);
    PageFactory.initElements(driver, this);
  }

  public void goTo() {
    driver.navigate().to(url);
  }
  
  public void viewContributorInfo() {
    contributorJoli.click();
    common.waitForUrl("/contributors/joli", 7);
  }

  // ---------------------- Web Element Declarations ---------------------------------
  @FindBy(css = ".page-content h1")
  public WebElement pageHeader;

  @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Joli")
  public WebElement contributorJoli;
}