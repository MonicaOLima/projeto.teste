package Elementos;

import org.openqa.selenium.By;

import Metodos.Metodos;

public class Elementos extends Metodos{
	
	Metodos metodos = new Metodos();
	
	public By menuUser = By.id("menuUser");
	By username = By.name("username");
	
	public void realizarLogin() {
		metodos.clicar(menuUser, "Clicar em user para acessar conta");
		metodos.escrever(username, "KeeggoWphl", "login de acesso");
	
	}
	
	By password = By.name("password");
	By btn = By.id("sign_in_btnundefined");
	
	public void senha() {
		metodos.escrever(password, "Teste@11", "senha de acesso");
		metodos.clicar(btn, "clicar no botão");
	}

}
