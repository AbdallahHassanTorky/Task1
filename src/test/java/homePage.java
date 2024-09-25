import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
    void Web(WebDriver driver) {
        driver.navigate().to("https://www.amazon.com");
    }
    WebElement searchBox(WebDriver driver) {
        By searchBox = By.id("twotabsearchtextbox");
        WebElement users = driver.findElement(searchBox);
        return users;
    }
}