package com.ex;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverManagerClass {
    private  static WebDriver webDriver;

    private WebDriverManagerClass(String browser) {
        setWebDriver(browser);
    }

    private void setWebDriver(String browser) {
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        switch (browser) {
            case "chrome":
                webDriver = WebDriverManager.chromedriver().create();
//                webDriver = new ChromeDriver();
                break;
            case "ff":
                webDriver = WebDriverManager.firefoxdriver().create();
                break;
            case "chrome_standalone":
                webDriver = standAlone("http//localhost:4444/wd/hub");
                break;
            case "chrome_selenoid":
                webDriver = selenoidChrome("http://localhost:4444/wd/hub");
                break;
            default:
                throw new RuntimeException(browser + " browser does not exists. Set a correct one");
        }
    }

    public static WebDriver getWebDriver() {

        String browser = "chrome_selenoid";
        if (webDriver == null) {
            new WebDriverManagerClass(browser);
        }
        return webDriver;
    }

    private static RemoteWebDriver standAlone (String severUrl) {
        ChromeOptions chromeOptions = new ChromeOptions();
        RemoteWebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL(severUrl), chromeOptions);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }

    private static RemoteWebDriver selenoidChrome (String severUrl) {
        ChromeOptions chromeOptions = new ChromeOptions();
        RemoteWebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL(severUrl), chromeOptions);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}
