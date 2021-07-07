package Metodos;

import org.openqa.selenium.By;

public class RegistrarNovoClientePage {
	
	Metodos metodos = new Metodos();
	
	By username = By.name("usernameRegisterPage");
	By email = By.name("emailRegisterPage");
	By senha = By.name("passwordRegisterPage");
	By confirmarSenha = By.name("confirm_passwordRegisterPage");
	By firstName = By.name("first_nameRegisterPage");
	By lastName = By.name("last_nameRegisterPage");
	By phone = By.name("phone_numberRegisterPage");
	By country = By.name("countryListboxRegisterPage");
	By city = By.name("cityRegisterPage");
	By address = By.name("addressRegisterPage");
	By province = By.name("state_/_province_/_regionRegisterPage");
	By postalCode = By.name("postal_codeRegisterPage");
	
	By promocoes = By.name("nanallowOffersPromotion");
	By concordo = By.name("i_agree"); 
	By register = By.id("register_btnundefined");
	
	public void registrarCliente(String nome, String email, String senha, String confirmarSenha, String firstName, String lastName, String phone, String country, String city, String address, String province, String postalCode) {
		
		metodos.escrever(username, nome, "");
		metodos.escrever(this.email, email, "");
		metodos.escrever(this.senha, senha, "");
		metodos.escrever(this.confirmarSenha, confirmarSenha, "");
		metodos.escrever(this.firstName, firstName, "");
		metodos.escrever(this.lastName, lastName, "");
		metodos.escrever(this.phone, phone, "");
		metodos.escrever(this.country, country, "");
		metodos.escrever(this.city, city, "");
		metodos.escrever(this.address, address, "");
		metodos.escrever(this.province, province, "");
		metodos.escrever(this.postalCode, postalCode, "");
		metodos.clicar(concordo, "");
		metodos.clicar(register, "");
			
	}

}
