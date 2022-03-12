package qualitystreamtutorial;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;/*importar los archivos para ejecucion*/

public class Gogleserchtest {

	private WebDriver driver;
	
	@Before
	public void setUp(){
		System.setProperty("WebDriver.chrome.driver","./src/test/resources/chromeDriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();//to appear on the screen//
		
		driver.get("https//www.google.com/");
		
	}
	@SuppressWarnings("deprecation")
	@Test //steps to run the test//
	
	public void restGooglePage() {
		WebElement searchbox = driver.findElement(By.name("q"));//element id//
		
		searchbox.clear();//to delete what is in the search box//
		
		searchbox.sendKeys("quality-stream Intruduccion a la Automatizacion de Pruebas de Software");//search is required//
		
		searchbox.submit();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		assertEquals("quality-tream Introduccion a la Automatizacion de Pruebas de Software - Google Search", driver.getTitle());//make sure that is the title of the page//
	
	}
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
