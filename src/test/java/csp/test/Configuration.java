package csp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Configuration {


    private static final String GECKODRIVER_PATH =  "/home/boris/repos/CSE/drivers/geckodriver";
    private static final String CHROMEDRIVER_PATH = "/home/boris/repos/CSE/drivers/chromedriver";


    public static WebDriver createFirefoxBrowser() {
        System.setProperty("webdriver.gecko.driver", GECKODRIVER_PATH);
        return new FirefoxDriver();
    }

    public static WebDriver createChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH);
        return new ChromeDriver();
    }


}
