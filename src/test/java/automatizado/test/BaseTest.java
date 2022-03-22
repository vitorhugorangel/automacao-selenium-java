package automatizado.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Classe base que serve de herança para todas as classes de teste.
 */
public abstract class BaseTest {
  /** Driver do navegador da página atual. */
  protected static WebDriver driver;
  /** Caminho da URL do sistema a ser testado. */
  private static final String URL_BASE = "file:///D:/cursos/4.Udemy/automa%C3%A7%C3%A3o/sistema/login.html";
  /** Caminho relativo do driver ao projeto referente ao path */
  private static final String CAMINHO_DRIVER = "src/test/java/automatizado/resource/chromedriver.exe";

  /** Classe de iniciação do navegador */
  @BeforeClass
  public static void iniciar() {
    System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(URL_BASE);
  }

  /** Classe de fechamento da aplicação */
  @AfterClass
  public static void finalizar() {
    driver.quit();
  }
}
