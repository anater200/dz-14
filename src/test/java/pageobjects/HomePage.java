package pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page{
    private final By saleItem = By.xpath("//*[@id='ui-id-8']");
    private final By cartIcon = By.xpath("//a[@class='action showcart' and span[text()='My Cart']]");
    private final By viewAndEditCart = By.xpath("//a[@class='action viewcart' and span[text()='View and Edit Cart']]");


    public HomePage(WebDriver driver) {
        super(driver);
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @Step("User chooses Sale category")
    public SalePage chooseSaleCategory(){
        getElement(saleItem).click();
        return new SalePage(driver);
    }

    @Step("User chooses Sale category")
    public CartPage openCart() throws InterruptedException {
        getElement(cartIcon).click();
        Thread.sleep(2000);
        getElement(viewAndEditCart, 8).click();
        return new CartPage(driver);
    }


}
