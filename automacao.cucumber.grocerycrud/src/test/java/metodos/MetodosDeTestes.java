package metodos;

import static org.junit.Assert.assertTrue;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import conexoes.DriversFactory;

public class MetodosDeTestes extends DriversFactory {

	
	//Metodo para clicar em um elemento web passando pelo By
	public void clicar(By elemento) {
		driver.findElement(elemento).click();		
	}
	//Metodo para clicar em um elemento web passando pelo WebElement
	public void clicar(WebElement elemento) {
		elemento.click();
	}
	public void digitar(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);		
	}
	//valida se o texto capturado contem o texto esperado passando  um By
	public void validarTexto (By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(textoEsperado));
	}
	//metodo para tirar evidencia do teste executado	
	public void screenShot (String nomeEvidencia) {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" +nomeEvidencia+ ".png");
		try {
			FileUtils.copyFile(scrFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Pausar aplicação  pelo tempo determinado em milisegundos
	public void  pausa (int tempo)  {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
