package webpage.google

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import webpage.HomePage

class GoogleHomePage(private val driver: WebDriver) : HomePage(driver) {
    // TODO: Try other arguments... className, id, name, etc.
    @FindBy(css = "#lst-ib")
    private lateinit var search: WebElement

    val title: String
        get() {
            return driver.title
        }

    fun open() {
        driver.get("http://google.com")
    }

    fun search(query: String) {
        search.sendKeys(query)
        search.submit()
    }
}
