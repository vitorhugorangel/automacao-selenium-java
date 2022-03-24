package automatizado.test;

import org.junit.BeforeClass;
import org.junit.Test;

import automatizado.page.WebsitePO;

public class WebsiteTest extends BaseTest {
    private static WebsitePO WebsitePage;

    @BeforeClass
    public static void preperarTestes() {
        driver.get("http://automationpractice.com/index.php?controller=contact");
        WebsitePage = new WebsitePO(driver);
    }

    @Test
    public void TC0001_realizarContato() {
        WebsitePage.realizarContato("vitorhugo.rangel111@yahoo.com.br", "479", "Minha mensagem de teste");
    }

}
