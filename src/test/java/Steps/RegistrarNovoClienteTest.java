package Steps;

import Metodos.Browsers;
import Metodos.HomePage;
import Metodos.Metodos;
import Metodos.RegistrarNovoClientePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrarNovoClienteTest {
	
	Browsers browser = new Browsers();
	HomePage home = new HomePage();
	RegistrarNovoClientePage registrar = new RegistrarNovoClientePage();
	Metodos metodos = new Metodos();
	
	String nome;
	
	@Given("que acesso o site {string}")
	public void que_acesso_o_site(String site) {
		browser.abrirNavegador(site);
	}
	
	@Given("acesso o formulario de abertura de conta")
	public void acesso_o_formulario_de_abertura_de_conta() {
		home.formularioRegistrarCliente();
	}

	@When("preencher todos os campos obrigatorios")
	public void preencher_todos_os_campos_obrigatorios() {
		this.nome = metodos.getNome();
	    registrar.registrarCliente(this.nome, metodos.getEmail(), "Teste@12345", "Teste@12345", "Jarval", "Cardoso", "11940053248", "Brazil",
				"São Paulo", "Rua João Rodrigues Chaves", "SP", "02834170");
	}

	@Then("cliente cadastrado com sucesso")
	public void cliente_cadastrado_com_sucesso() {
	    metodos.screenShot("Cadastro", "Novo cliente cadastrado");
	    metodos.fechar("teste finalizado");
	}

}
