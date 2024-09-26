import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;
public class main {
    /*******************************
     -	Open amazon link “https://www.amazon.com/” then type " car accessories"
     -	Select the first Item
     -	Add item to the cart
     -	Go to the cart and check that item is added successfully
     ***********************************/
    EdgeDriver driver = new EdgeDriver();
    homePage searchBox=new homePage();
    productsPage ps=new productsPage();
    cartPage addToCart=new cartPage();
/*****************************************************************************/
    @BeforeTest
    public void beforeTest() throws IOException {
        driver.manage().window().setSize(new Dimension(1024, 768));
    }
    /*****************************************************************************/
    @Test
    public void Scenario1() {
        searchBox.Web(driver,"https://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(10));
        searchBox.searchBox(driver).sendKeys("car accessories");
        searchBox.searchBox(driver).submit();
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(10));
        ps.prductSel(driver).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(10));
        addToCart.addToCart(driver).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(10));
        addToCart.cartPage(driver).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(10));
        WebElement cartItem = addToCart.cartItem(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(10));
        if (cartItem.isDisplayed()) {
            System.out.println("Item is successfully added to the cart: " + cartItem.getText());
        } else {
            System.out.println("Item is not found in the cart.");
        }
    }
@Test
    public void Scenario2() {
        driver.get("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb&discounts-widget=%2522%257B%255C%2522state%255C%2522%253A%257B%255C%2522refinementFilters%255C%2522%253A%257B%257D%257D%252C%255C%2522version%255C%2522%253A1%257D%2522");
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(10));
        driver.findElement(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/button/a")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(10));
        driver.findElement(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/div/span[15]/div/label/span/span")).click();
        driver.findElement(By.xpath("//*[text()='10% off or more']")).click();

    }
    /*****************************************************************************/
//    @AfterTest
//            public void afterTest(){
//        driver.quit();
//    }





}
