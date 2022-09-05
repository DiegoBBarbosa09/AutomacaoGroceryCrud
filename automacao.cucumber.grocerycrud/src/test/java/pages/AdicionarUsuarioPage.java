package pages;

import org.openqa.selenium.By;
import elementos.ElementosWeb;
import metodos.MetodosDeTestes;

public class AdicionarUsuarioPage {

	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	By addUsuario = By.xpath("//a[@href='/v1.x/demo/bootstrap_theme_v4/add']");
	By btnSalvar = By.xpath("//button[@id='form-button-save']");
	By msg = By.xpath(" //div[@id='report-success']/p");

	public void selecionarVersao(String versao) {

		metodos.digitar(el.versao, versao);

	}

	public void addUsuario() {
		metodos.clicar(addUsuario);
		metodos.pausa(3000);
		metodos.screenShot("CT 01 - Formulario em branco");
		
	}

	public void salvar() {
		metodos.clicar(btnSalvar);

	}

	public void validarMensagem(String addUsuario)   {
		metodos.pausa(3000);
		metodos.validarTexto(msg, addUsuario);
		metodos.screenShot("CT 03 - add usuario");
	

	}

	public void preencherDados() {
		metodos.digitar(el.name, "teste");
		metodos.digitar(el.lastName, "teste");
		metodos.digitar(el.contactFirstName, "teste");
		metodos.digitar(el.phone, "11 955554444");
		metodos.digitar(el.address1, "teste");
		metodos.digitar(el.address2, "teste");
		metodos.digitar(el.city, "Barueri");
		metodos.digitar(el.state, "São Paulo");
		metodos.digitar(el.postalCode, "06462-000");
		metodos.digitar(el.country, "Brasil");
		metodos.clicar(el.fromEnployeer);
		metodos.clicar(el.fromEnployeer2);
		metodos.digitar(el.creditLimit, "1000");
		metodos.digitar(el.delete, "teste");
		metodos.screenShot("CT 02 - Fomulario Preenchido");
	}

}
