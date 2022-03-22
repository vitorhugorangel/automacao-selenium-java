package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CefetPO extends BasePO {

    @FindBy(id = "j_username")
    public WebElement inputLogin;

    @FindBy(id = "j_password")
    public WebElement inputSenha;

    @FindBy(className = "button")
    public WebElement entrar;

    /**
     * Construtor para criação da pagina do Google.
     * 
     * @param driver Driver da pagina do Google.
     */
    public CefetPO(WebDriver driver) {
        super(driver);
    }

    /**
     * Metodo que irá efetuar o preenchimento dos dados de resgate de cupom.
     * 
     * @param login login para acessar o portal.
     * @param senha senha para acessar o portal.
     */
    public void efetuarLogin(String login, String senha) {
        try {
            Thread.sleep(5000);
            inputLogin.sendKeys(login);
            inputSenha.sendKeys(senha);
            entrar.click();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
