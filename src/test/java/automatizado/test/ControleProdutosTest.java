package automatizado.test;

import static org.junit.Assert.assertEquals;

import automatizado.builder.ProdutoBuilder;
import automatizado.page.ControleDeProdutoPO;
import automatizado.page.LoginPO;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ControleProdutosTest extends BaseTest {
  private static LoginPO loginPage;
  private static ControleDeProdutoPO controleDeProdutoPage;

  @BeforeClass
  public static void preperarTestes() {
    loginPage = new LoginPO(driver);
    loginPage.executarAcaoDeLogar("admin@admin.com", "admin@123");
    controleDeProdutoPage = new ControleDeProdutoPO(driver);

    assertEquals(
      controleDeProdutoPage.obterTituloPagina(),
      "Controle de Produtos"
    );
  }

  //=============================TESTE 01===================================//

  @Test
  public void TC001_deveAbrirModalParaCadastroAoClicarBotaoCriar() {
    controleDeProdutoPage.abrirModal();
    String titulo = controleDeProdutoPage.tituloModal.getText();
    assertEquals("Produto", titulo);
    controleDeProdutoPage.fecharModal();
  }

  //==============================TESTE 02================================//

  /* @Test
  public void TC002_naoDeveSerPossivelCadastrarProdutoSemTodosOsCampos() {
    controleDeProdutoPage.buttonAdicionar.click();
    controleDeProdutoPage.cadastrarProduto("0001", "Martelo", 10, 29.90, "");

    assertEquals(
      "Todos os campos são obrigatórios para o cadastro!",
      controleDeProdutoPage.obterMensagem()
    );
  }*/

  //==============================TESTE 03==================================//

  @Test
  public void TC003_cadastroDeProdutoPadrao() {
    controleDeProdutoPage.abrirModal();
    ProdutoBuilder produtoBuilder = new ProdutoBuilder();
    controleDeProdutoPage.cadastrarProduto(produtoBuilder);
  }
}
