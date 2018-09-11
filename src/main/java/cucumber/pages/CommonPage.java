package cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPage {
  private WebDriver driver;

  public CommonPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public void goTo(String url) {
    driver.navigate().to(url);
  }

  public void waitForElement(WebElement element, int timeout) {
    WebDriverWait wait = new WebDriverWait(this.driver, timeout);
    wait.until(ExpectedConditions.elementToBeClickable(element));
  }

  public void waitForUrl(String url, int timeout) {
    WebDriverWait wait = new WebDriverWait(this.driver, timeout);
    wait.until(ExpectedConditions.urlContains(url));
  }

  // ---------------------- Web Element Declarations ---------------------------------
}