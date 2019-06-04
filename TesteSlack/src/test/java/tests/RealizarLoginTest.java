package tests;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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
		new LoginPage(navegador)
			.informarLogin("brunorafael1992@gmail.com")
			.informarSenha("br58075130")
			.clicarBotaoLogin();
	}
	
	
	@After
	public void tearDown() {
		navegador.quit();
	}
	

}
