package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import suporte.BasePage;

public class HomePage extends BasePage{
	
	
	public HomePage(WebDriver navegador) {
		super(navegador);
	}

	public String validarLogin() {
		return navegador.findElement(By.id("team_menu_user_name")).getText().toString();
	}
	
	
	

}
