package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import suporte.BasePage;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver navegador) {
		super(navegador);
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
	
	public String validarDados() {
		String teste = navegador.findElement(By.xpath("//p[@class=\"alert alert_error\"]")).getText();
		System.out.println(teste);
		return teste;
	}
	
	
	
	public HomePage fazerLogin(String email, String senha) {
		informarLogin(email);
		informarSenha(senha);
		clicarBotaoLogin();
		return new HomePage(navegador);
	}
	
}
