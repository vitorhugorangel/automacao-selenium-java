package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO extends BasePO {
  @FindBy(id = "email")
  public WebElement inputEmail;

  @FindBy(id = "senha")
  public WebElement inputSenha;

  @FindBy(id = "btn-entrar")
  public WebElement btnEntrar;

  @FindBy(css = "form.form-login>div.alert>span")
  public WebElement spanMensagem;

  /**
   * Construtor padrão para criação de uma nova instancia da pagina de login.
   * @param driver
   */
  public LoginPO(WebDriver driver) {
    super(driver);
  }

  public void executarAcaoDeLogar(String email, String senha) {
    escrever(inputEmail, email);
    escrever(inputSenha, senha);
    clicar(btnEntrar);
  }

  public void clicar(WebElement button) {
    button.click();
  }

  public String obterMensagem() {
    return spanMensagem.getText();
  }
}
