package pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HoodiesSweatshirtsPage extends Page {
    private final By xsSize = By.xpath("//div[@class='swatch-option text' and text()='XS']");
    private final By grayColor = By.xpath("//div[@class='swatch-option color' and @option-label='Gray']\n");
    private final By addToCart = By.xpath("//button[@title='Add to Cart']\n");

    public HoodiesSweatshirtsPage(WebDriver driver) {
        super(driver);
    }

    @Step("User chooses size color and adds item to the cart")
    public HomePage chooseSizeColorAndAddItemToTheCart() throws InterruptedException {
        getElement(xsSize).click();
        getElement(grayColor).click();
        getElement(addToCart).click();
        return new HomePage(driver);
    }
}
