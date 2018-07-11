package webpage

import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory

abstract class HomePage(driver: WebDriver) {
    init {
        PageFactory.initElements(AjaxElementLocatorFactory(driver, 15), this)
    }
}
