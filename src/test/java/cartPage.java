import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartPage {
    WebElement addToCart(WebDriver driver) {
        By addToCart = By.id("add-to-cart-button");
        WebElement atc = driver.findElement(addToCart);
        return atc;
    }
    WebElement cartPage(WebDriver driver) {
        By cartPage = By.id("nav-cart");
        WebElement cp = driver.findElement(cartPage);
        return cp;
    }
    WebElement cartItem(WebDriver driver) {
        By cartItem = By.xpath("/html/body/div[1]/div[1]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/ul/li/span/a/span[1]/h4/span/span[2]");
        WebElement ci = driver.findElement(cartItem);
        return ci;
    }

}
