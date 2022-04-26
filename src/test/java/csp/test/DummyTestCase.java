package csp.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class DummyTestCase {

  @Test
  void testFirefoxDriverWorks() throws Exception {
    WebDriver driver = Configuration.createFirefoxBrowser();
    driver.quit();
    assertNotNull(driver);
  }

  @Test
  void testCromeDriverWorks() throws Exception {
    WebDriver driver = Configuration.createChromeBrowser();
    driver.quit();
    assertNotNull(driver);
  }
}
