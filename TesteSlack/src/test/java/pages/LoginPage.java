package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	// Parte essencial do Page Object
	private WebDriver navegador;

	public LoginPage(WebDriver navegador) {
		this.navegador = navegador;
	}

	// Informar login
	public LoginPage informarLogin(String email) {
		navegador.findElement(By.id("email")).sendKeys(email);
		return this;

	}

	// Informar senha
	public LoginPage informarSenha(String senha) {
		navegador.findElement(By.id("password")).sendKeys(senha);
		return this;

	}

	// Clicar no botão login
	public HomePage clicarBotaoLogin() {
		navegador.findElement(By.id("signin_btn")).click();
		return new HomePage(navegador);

	}
}
