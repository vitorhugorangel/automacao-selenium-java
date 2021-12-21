package automatizado.test;

import static org.junit.Assert.assertTrue;

import automatizado.page.GooglePO;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GoogleTest extends BaseTest {
  private static GooglePO googlePage;

  @BeforeClass
  public static void preperarTestes() {
    driver.get("https://www.google.com/");
    googlePage = new GooglePO(driver);
  }

  @Test
  public void TC001_deveSerPossivelPequisarNoGoogleOTextoBatataFrita() {
    googlePage.pesquisar("Batata frita");

    String resultado = googlePage.obterResultadoDaPesquisa();

    assertTrue(resultado, resultado.contains("Aproximadamente"));
  }

  @Test
  public void TC002_deveSerPossivelPequisarNoGoogleOTextoNutella() {
    googlePage.pesquisar("Nutella");

    String resultado = googlePage.obterResultadoDaPesquisa();

    assertTrue(resultado, resultado.contains("resultados"));
  }
}
