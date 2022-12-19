package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Desafio {
	
	String url;
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Before
	public void iniciar() {
		url = "https://reservas.desbravador.com.br/8050";
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	}
	
	@After
	public void finalizar() {
		driver.quit();		
	}
	
	@Test
	public void efetuarReserva() {
		//Pagina Inicial
		driver.get(url);
		driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[4]/td[2]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[4]/td[5]/div[1]/div[1]")).click();
		driver.findElement(By.cssSelector("input.form-control")).sendKeys(Keys.chord("2"));
		driver.findElement(By.cssSelector("button.btn-children.btn.btn-secondary")).click();
		driver.findElement(By.id("faixa1")).sendKeys(Keys.chord("1"));
		driver.findElement(By.cssSelector("button.sc-hLBbgP.hsssXM.btn.btn-secondary.d-block.w-100")).click();
		//Pagina da Tarifa
		driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[3]/button[1]/span[1]")).click();
		driver.findElement(By.cssSelector("button.sc-hLBbgP.hsssXM.animate__animated.animate__tada.animate__delay-2s.btn.btn-secondary.d-block.w-100")).click();
		//Pagina dos Hospedes
		driver.findElement(By.xpath("//button[contains(text(),'Hóspedes')]")).click();
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys(Keys.chord("Teste"));
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys(Keys.chord("Teste2"));
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/input[1]")).sendKeys(Keys.chord("Teste3"));
		driver.findElement(By.xpath("//button[contains(text(),'Salvar')]")).click();
		driver.findElement(By.cssSelector("button.sc-hLBbgP.hsssXM.btn.btn-primary")).click();
		//Pagina de pagamento
		driver.findElement(By.xpath("//body/div[@id='root']/main[1]/div[1]/div[1]/div[4]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.chord("teste@teste.com.br"));
		driver.findElement(By.xpath("//body/div[@id='root']/main[1]/div[1]/div[1]/div[4]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//body/div[@id='root']/main[1]/div[1]/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/input[1]")).sendKeys(Keys.chord("4000 0000 0000 0044"));
		driver.findElement(By.xpath("//body/div[@id='root']/main[1]/div[1]/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[3]/div[4]/div[1]/input[1]")).sendKeys(Keys.chord("DESBRAVADOR SOFTWARE"));
		driver.findElement(By.xpath("//body/div[@id='root']/main[1]/div[1]/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[3]/div[5]/div[1]/input[1]")).sendKeys(Keys.chord("12/23"));
		driver.findElement(By.xpath("//body/div[@id='root']/main[1]/div[1]/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[3]/div[6]/div[1]/input[1]")).sendKeys(Keys.chord("123"));
		driver.findElement(By.id("recaptcha-anchor")).click();
		driver.findElement(By.cssSelector("input.form-check-input")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Finalizar')]")).click();
		
	}
}
