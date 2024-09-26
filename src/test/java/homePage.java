import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
    void Web(WebDriver driver,String webSite) {
        driver.navigate().to(webSite);
    }
    WebElement searchBox(WebDriver driver) {
        By searchBox = By.id("twotabsearchtextbox");
        WebElement users = driver.findElement(searchBox);
        return users;
    }
}