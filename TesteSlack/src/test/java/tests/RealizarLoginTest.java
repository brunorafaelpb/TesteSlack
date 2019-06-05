package tests;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;
import suporte.Web;

public class RealizarLoginTest {
	
	private WebDriver navegador;
	
	@Before
	public void setUp() {
		navegador = Web.createChrome();
	}
	
	
	@Test
	public void loginValido() {
		String validacao = new LoginPage(navegador)
			.fazerLogin("brunorafael1992@gmail.com", "br58075130")
			.validarLogin();
		
		assertEquals("brunorafael1992", validacao);
	}
	
	
	
	
	@After
	public void tearDown() {
		navegador.quit();
	}
	

}
