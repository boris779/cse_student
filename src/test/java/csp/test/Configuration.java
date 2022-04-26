package csp.test;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Configuration {

  private static final String GECKODRIVER_PATH = Paths.get("drivers/geckodriver").toAbsolutePath().toString();
  private static final String CHROMEDRIVER_PATH = Paths.get("drivers/chromedriver").toAbsolutePath().toString();

  public static WebDriver createFirefoxBrowser() {
    System.setProperty("webdriver.gecko.driver", GECKODRIVER_PATH);
    return new FirefoxDriver();
  }

  public static WebDriver createChromeBrowser() {
    System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH);
    return new ChromeDriver();
  }
}
