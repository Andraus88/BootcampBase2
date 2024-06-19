package bootcampbase2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MantisTests {

    @Test
    public void criarTarefaComSucesso(){
        String urlSistema = "https://mantis-prova.base2.com.br/login_page.php";
        String usuario = "grupoAzulAgua";
        String senha = "123456";

        //Abrir o Chrome e Navega para o mantis
        WebDriver chrome = new ChromeDriver();
        chrome.navigate().to(urlSistema);

        //Localiza Username, Entra Usuario e click Entrar
        WebElement entrarField = chrome.findElement(By.id("username"));
        entrarField.sendKeys(usuario);
        WebElement entrarButton = chrome.findElement(By.xpath("//*[@value='Entrar']"));
        entrarButton.click();

        //Localiza Senha, Entra Senha e click Login
        WebElement senhaField = chrome.findElement(By.id("password"));
        senhaField.sendKeys(senha);
        entrarButton = chrome.findElement(By.xpath("//*[@value='Entrar']"));
        entrarButton.click();



    }

}
