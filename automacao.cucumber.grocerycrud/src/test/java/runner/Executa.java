package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import conexoes.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "steps", tags = "@AdicionarUsuario", monochrome = true, dryRun = false, plugin = {
		"pretty", "html:target/cucumber-report.html" }, snippets = SnippetType.CAMELCASE

)

public class Executa extends DriversFactory {

	static String urlTeste = "https://www.grocerycrud.com/v1.x/demo/bootstrap_theme";

	@BeforeClass
	public static void iniciarTeste() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme");
		driver.manage().window().maximize();

		System.out.println(" ************************ Teste Iniciado com Sucesso!!! ************************ ");

	}

	@AfterClass
	public static void finalizarTeste() {
		driver.quit();
		System.out.println(" ************************ Teste Finalizado com Sucesso!!! ************************ ");

	}

}
