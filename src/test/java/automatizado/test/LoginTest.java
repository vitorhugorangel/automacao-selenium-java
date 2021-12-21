package automatizado.test;

import static org.junit.Assert.assertEquals;

import automatizado.page.LoginPO;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginTest extends BaseTest {
  private static LoginPO loginPage;

  @BeforeClass
  public static void preperarTestes() {
    loginPage = new LoginPO(driver);
  }

  @Test
  public void TC001_naoDeveLogarNoSistemaComEmailESemjaVazios() {
    loginPage.executarAcaoDeLogar("", "");
    String mensagem = loginPage.obterMensagem();

    assertEquals(
      mensagem,
      "Informe usuário e senha, os campos não podem ser brancos."
    );
  }

  @Test
  public void TC002_naoDeveLogarNoSistemaComEmailIncorrtoESenhaVazios() {
    loginPage.executarAcaoDeLogar("admin@admin", "123456");
    String mensagem = loginPage.obterMensagem();

    assertEquals(mensagem, "E-mail ou senha inválidos");
  }

  @Test
  public void TC003_deveLogarNoSistemaComEmailESenhaCorretos() {
    loginPage.executarAcaoDeLogar("admin@admin.com", "admin@123");
    loginPage.obterTituloPagina();

    assertEquals(loginPage.obterTituloPagina(), "Controle de Produtos");
  }
}
