import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleAutomation {

    public static void main(String[] args) {
    	String driverPath = "geckodriver.exe";
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", driverPath);


        // Instantiate ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");

        // Submit the search form
        searchBox.submit();

        // Wait for the results to load and click the first result (link locator)
        WebElement firstResult = driver.findElement(By.xpath("//h3"));
        firstResult.click();

        // Close the browser
        driver.quit();
    }
}