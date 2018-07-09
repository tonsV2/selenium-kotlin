import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver

fun main(args: Array<String>) {
    System.setProperty("webdriver.chrome.driver", "./chromedriver")

    val driver = ChromeDriver()

    driver.get("http://google.com")

    val element = driver.findElement(By.id("lst-ib"))
    element.sendKeys("hello world")
    element.submit()

    println("Page title is: ${driver.title}")

    driver.quit()
}
