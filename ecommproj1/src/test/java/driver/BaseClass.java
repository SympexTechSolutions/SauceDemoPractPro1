package driver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility.ConfigReader;

public class BaseClass {
    public WebDriver driver;
    
    ConfigReader configReader;

	@BeforeMethod()
	public void setUp() {
		configReader = new ConfigReader();
		DriverFactory.initDriver();
		driver.get(configReader.getApplicationUrl());

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();
	}
	

	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}
}
