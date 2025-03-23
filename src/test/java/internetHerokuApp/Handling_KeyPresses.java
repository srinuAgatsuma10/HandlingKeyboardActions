package internetHerokuApp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Handling_KeyPresses {

	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("");
		driver.manage().window().maximize();
	}
	
	@Test
	public void keyPresses() {
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
