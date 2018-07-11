package test.google

import org.testng.annotations.Test
import test.TestBase
import webpage.google.GoogleHomePage

class GoogleHomePageTest : TestBase() {
    @Test
    fun SearchHelloWorld() {
        val google = GoogleHomePage(driver)
        google.open()

        google.search("Hello world")

        println("Page title is: ${google.title}")
    }
}
