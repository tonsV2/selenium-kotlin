package test

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import java.net.URL

abstract class TestBase {
    lateinit var driver: WebDriver
        private set

    @BeforeTest
    fun setup() {
        driver = ChromeDriver()
        //val url = URL("http://selenium:4444/wd/hub")
        //driver = RemoteWebDriver(url, DesiredCapabilities.chrome())
    }

    @AfterTest
    fun driverClose() {
        driver.close()
    }
}
