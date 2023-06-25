package tests;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class AddToCartTest extends BaseTest {

    @Test
    @Description("The test is checking positive case for login")
    public void testAddToCart() throws InterruptedException {
        new HomePage(driver)
                .chooseSaleCategory()
                .chooseHoodiesSweatshirts()
                .chooseSizeColorAndAddItemToTheCart()
                .openCart();

        String addedItem =
                driver.findElement(By.xpath("//a[text()='Circe Hooded Ice Fleece']")).getText();

        Assert.assertEquals(addedItem, "Circe Hooded Ice Fleece");
    }
}
