package util;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementHelper {
    AppiumDriver driver;
    WebDriverWait wait;
    Actions actions;

    public ElementHelper(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, (10));
        this.actions = new Actions(driver);
    }
    public WebElement presenceElement(By key){ //elemanın geldiği görülür
        return
                wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }
    public WebElement findElement(By key){ // elemanı bulma
        WebElement element = presenceElement(key);
        return element;
    }
    public void click(By key){
        findElement(key).click(); // elemana tıklama
    }
    public void sendKey(By key, String text){
        findElement(key).sendKeys(text); // elemana text gönderme
    }
    public void checkVisible(By key){ //görünürlüğünü kontrol etme
        wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }
}
