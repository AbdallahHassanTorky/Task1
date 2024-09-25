import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
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
    timeDelay timeDelay=new timeDelay();
    /*****************************************************************************/
    @BeforeTest
    public void beforeTest() throws IOException {
        //-	Open amazon link “https://www.amazon.com/”
        String web = "https://www.amazon.com";
        driver.manage().window().setSize(new Dimension(1024, 768));
        searchBox.Web(driver);

    }
    /*****************************************************************************/
    @Test
    public void Scenario1() {
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(10));
        searchBox.searchBox(driver).sendKeys("car accessories");
        searchBox.searchBox(driver).submit();

        ps.prductSel(driver).click();


        addToCart.addToCart(driver).click();


        addToCart.cartPage(driver).click();


        WebElement cartItem = addToCart.cartItem(driver);
        if (cartItem.isDisplayed()) {
            System.out.println("Item is successfully added to the cart: " + cartItem.getText());
        } else {
            System.out.println("Item is not found in the cart.");
        }
    }
    /*****************************************************************************/
    @AfterTest
            public void afterTest(){
        driver.quit();
    }





}
