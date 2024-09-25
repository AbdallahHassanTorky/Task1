import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productsPage {
    WebElement prductSel(WebDriver driver) {
        By product = By.cssSelector("div.s-main-slot div.s-result-item:nth-child(10) h2 a");
        WebElement ps = driver.findElement(product);
        return ps;
    }
}
