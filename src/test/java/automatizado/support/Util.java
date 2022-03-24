package automatizado.support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automatizado.page.BasePO;

public class Util extends BasePO {
    public Util(WebDriver driver) {
        super(driver);
    }

    public void awaitElementByClicked(By element, int tempo) {
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
