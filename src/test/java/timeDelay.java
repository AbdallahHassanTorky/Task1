import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class timeDelay {


    public void timeDelay(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(100));

    }
}