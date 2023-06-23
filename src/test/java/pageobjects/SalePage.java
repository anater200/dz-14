package pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SalePage extends Page {
    private final By hoodiesAndSweatshirts = By.xpath("//*[text()='Hoodies and Sweatshirts']");

    public SalePage(WebDriver driver) {
        super(driver);
    }
    @Step("User chooses HoodiesSweatshirts")
    public HoodiesSweatshirtsPage chooseHoodiesSweatshirts(){
        getElement(hoodiesAndSweatshirts).click();
        return new HoodiesSweatshirtsPage(driver);
    }
}
