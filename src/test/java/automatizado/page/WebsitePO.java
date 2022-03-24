package automatizado.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class WebsitePO extends BasePO {

    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "id_order")
    public WebElement inputOrder;

    @FindBy(id = "message")
    public WebElement inputMensagem;

    @FindBy(id = "submitMessage")
    public WebElement buttonSubmit;

    public WebsitePO(WebDriver driver) {
        super(driver);
    }

    public void realizarContato(String email, String order, String mensagem) {
        try {
            Select drpModeContact = new Select(driver.findElement(By.id("id_contact")));
            drpModeContact.selectByValue("2");
            inputEmail.sendKeys(email);
            inputOrder.sendKeys(order);
            inputMensagem.sendKeys(mensagem);
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicar() {
        buttonSubmit.click();
    }
}
