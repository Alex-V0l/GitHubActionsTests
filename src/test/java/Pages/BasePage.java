package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public static final String BASE_URL = "https://bonigarcia.dev/selenium-webdriver-java/";
    WebDriver driver;

    @FindBy(className = "display-6")
    private WebElement Subtitle;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Step("get current URL")
    public String getCurrentURL (){
        return driver.getCurrentUrl();
    }

    @Step ("get subtitle")
    public String getSubtitleText(){
        return Subtitle.getText();
    }
}
