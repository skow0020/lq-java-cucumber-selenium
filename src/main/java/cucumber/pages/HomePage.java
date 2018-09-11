package cucumber.pages;

// import cucumber.helpers.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
  private WebDriver driver;
  // private Helpers Helper = new Helpers();

  public HomePage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public void goTo(String url) {
    driver.navigate().to(url);
  }

  public void Trait() {

  }

  // ---------------------- Web Element Declarations ---------------------------------

}