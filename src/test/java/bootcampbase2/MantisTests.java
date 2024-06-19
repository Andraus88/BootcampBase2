package bootcampbase2;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MantisTests {

    @Test
    public void criarTarefaComSucesso(){
        String urlSistema = "https://mantis-prova.base2.com.br/login_page.php";
        String usuario = "grupoAzulAgua";
        String senha = "123456";

        //Abrir o Chrome
        WebDriver chrome = new ChromeDriver();

        //Navegar para o Mantis
        chrome.navigate().to(urlSistema);

    }

}
