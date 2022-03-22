package automatizado.test;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import automatizado.page.CefetPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CefetTest extends BaseTest {
    private static CefetPO CefetPage;

    @BeforeClass
    public static void preperarTestes() {
        driver.get("https://alunos.cefet-rj.br/aluno/login.action?error=");
        CefetPage = new CefetPO(driver);
    }

    @Test
    public void TC001_efetuarLogin() {
        CefetPage.efetuarLogin("1815456GSIS", "Dhpc!479");
    }
}
