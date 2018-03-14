import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

class Raidwar {
    private lateinit var driver: WebDriver
    private lateinit var executor: JavascriptExecutor
    private lateinit var baseUrl: String

    @Before
    fun setUp() {
        val options = ChromeOptions()

        //chromeのパスを指定
        options.setBinary(java.io.File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"))

        //chrome driverの指定
        System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe")

        driver = ChromeDriver(options)
        executor = driver as JavascriptExecutor
        baseUrl = "http://" + "vcard" + ".ameba" + ".jp/"

    }

    @After
    fun tearDown() {
        driver.quit()
    }

    @Test
    fun raidwarNotification() {

        driver.get(baseUrl)
        Thread.sleep(1000)
    }

}
