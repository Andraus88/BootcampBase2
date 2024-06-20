package bootcampbase2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MantisTests {

    @Test
    public void criarTarefaComSucesso(){
        String urlSistema = "https://mantis-prova.base2.com.br/login_page.php";
        String usuario = "grupoAzulAgua";
        String senha = "123456";
        String mensagem = "teste";

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

        //Aguardar Carregar
        WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sidebar']/ul/li[3]/a")));

        //Localiza Criar Tarefa e click
        WebElement tarefaButton = chrome.findElement(By.xpath("//*[@id='sidebar']/ul/li[3]/a"));
        tarefaButton = chrome.findElement(By.xpath("//*[@id='sidebar']/ul/li[3]/a"));
        tarefaButton.click();

        // Aguardar Carregar
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='category_id']")));

        // Localiza Categoria, click, Localiza Categoria Teste, Click
        WebElement categoriaDropdown = chrome.findElement(By.xpath("//*[@id='category_id']"));
        categoriaDropdown.click();
        WebElement categoriaOption = chrome.findElement(By.xpath("//*[@id='category_id']/option[2]"));
        categoriaOption.click();

        // Detectar e selecionar uma Frequência com os Xpaths (com click() entre cada um)
        WebElement frequenciaDropdown = chrome.findElement(By.xpath("//*[@id='reproducibility']"));
        frequenciaDropdown.click();
        WebElement frequenciaOption = chrome.findElement(By.xpath("//*[@id='reproducibility']/option[6]"));
        frequenciaOption.click();

        // Detectar e selecionar uma Gravidade com os Xpaths (com click() entre cada um)
        WebElement gravidadeDropdown = chrome.findElement(By.xpath("//*[@id='severity']"));
        gravidadeDropdown.click();
        WebElement gravidadeOption = chrome.findElement(By.xpath("//*[@id='severity']/option[4]"));
        gravidadeOption.click();

        // Detectar e selecionar uma prioridade com os Xpaths (com click() entre cada um)
        WebElement prioridadeDropdown = chrome.findElement(By.xpath("//*[@id='priority']"));
        prioridadeDropdown.click();
        WebElement prioridadeOption = chrome.findElement(By.xpath("//*[@id='priority']/option[2]"));
        prioridadeOption.click();

        // Detectar e selecionar uma Atribuição com os Xpaths (com click() entre cada um)
        WebElement atribuicaoDropdown = chrome.findElement(By.xpath("//*[@id='handler_id']"));
        atribuicaoDropdown.click();
        WebElement atribuicaoOption = chrome.findElement(By.xpath("//*[@id='handler_id']/option[7]"));
        atribuicaoOption.click();

        // Detectar a caixa de Resumo e escrever nela
        WebElement resumoField = chrome.findElement(By.xpath("//*[@id='summary']"));
        resumoField.sendKeys(mensagem);

        // Detectar a caixa de Descrição e escrever nela
        WebElement descricaoField = chrome.findElement(By.xpath("//*[@id='description']"));
        descricaoField.sendKeys(mensagem);

        // Detectar a caixa de Passos e escrever nela
        WebElement passosField = chrome.findElement(By.xpath("//*[@id='steps_to_reproduce']"));
        passosField.sendKeys(mensagem);

        // Detectar a caixa de Info e escrever nela
        WebElement infoField = chrome.findElement(By.xpath("//*[@id='additional_info']"));
        infoField.sendKeys(mensagem);

        // Localiza Criar Nova Tarefa e click
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='report_bug_form']/div/div[2]/div[2]/input")));
        WebElement reportButton = chrome.findElement(By.xpath("//*[@id='report_bug_form']/div/div[2]/div[2]/input"));
        reportButton.click();

    }

}
