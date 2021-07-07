package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	
	Metodos metodo = new Metodos();
	Elementos account = new Elementos();
	
	@Given("que eu esteja na tela de login")
	public void que_eu_esteja_na_tela_de_login() {
		metodo.abrirNavegador("http://advantageonlineshopping.com/#/");
		}

	@When("informar usuario valido")
	public void informar_usuario_valido() {
	    account.realizarLogin();
	}

	@When("senha invalida")
	public void senha_invalida() {
		account.senha();
	}

	@Then("visualizo a mensagem Incorrect user name or password.")
	public void visualizo_a_mensagem_incorrect_user_name_or_password() {
	   metodo.screenShot("Login", "Evidência de erro ao realizar login");
	   metodo.fechar("Teste finalizado");
	}

}
