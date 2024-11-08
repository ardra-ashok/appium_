package android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class browserTest {
    public static AndroidDriver driver;

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME,"Chrome");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
        capabilities.setCapability("chromedriverExecutable", "/Users/aashok/IdeaProjects/appium_/drivers/chromedriver"); // Specify ChromeDriver path

//        capabilities.setCapability();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.get("http://google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("hello");
        driver.quit();
    }

}
