package steps;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.MetodosDeTestes;
import pages.AdicionarUsuarioPage;

public class AdicionarUsuarioTeste {

	AdicionarUsuarioPage addUsuario = new AdicionarUsuarioPage();
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Dado("que esteja com bootstrap v4")
	public void queEstejaComBootstrapV4() {
		addUsuario.selecionarVersao("Bootstrap V4 Theme");		
	   
	}
	@Dado("acione add custumer")
	public void acioneAddCustumer()  {
		addUsuario.addUsuario();
		addUsuario.preencherDados();
	  
	}
	@Quando("salvar o formulario")
	public void salvarOFormulario() {
		addUsuario.salvar();
		
	}	    
	@Entao("validar mensagem  de sucesso")
	public void validarMensagemDeSucesso()  {
		addUsuario.validarMensagem("Your data has been successfully stored into the database. ");
	    
	}



	
}
