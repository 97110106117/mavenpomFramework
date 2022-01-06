package com.flipkart.testscripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    private static WebDriver driver;
    private static final String CONFIG_PATH = System.getProperty("user.dir")
            + "\\src\\test\\resources\\config.properties";
    private static Properties prop;

    @BeforeClass
    public void init() {
        prop = loadProperties();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("baseUrl"));
    }

    @AfterClass
    public void tearDown() {
         //driver.quit();
    }

    public Properties loadProperties() {
        System.out.println("Config Path:" +CONFIG_PATH);
        File file = new File(CONFIG_PATH);
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Properties prop = new Properties();
        try {
            prop.load(fin);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    public WebDriver getDriver() {
        return driver;
    }


}
