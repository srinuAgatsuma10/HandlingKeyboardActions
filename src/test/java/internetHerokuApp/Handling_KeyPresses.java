package internetHerokuApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class Handling_KeyPresses {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
	}

	@Test
	public void keyPresses() {
		// Actions Class
		Actions act = new Actions(driver);

		// Click Tab Key
		act.keyDown(Keys.TAB).click().keyUp(Keys.TAB).perform();
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());

		// Click Enter Key
		act.keyDown(Keys.BACK_SPACE).click().keyUp(Keys.BACK_SPACE).perform();
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());

		// Click Escape key
		act.keyDown(Keys.ESCAPE).click().keyUp(Keys.ESCAPE).perform();
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());

		// Enter any Letters in Text Box
		WebElement textBox = driver.findElement(By.xpath("//input[@id='target']"));
		textBox.sendKeys("Z");
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		textBox.sendKeys("O");
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		textBox.sendKeys("R");
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		textBox.sendKeys("O");
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());

		// Click Enter Key
		act.keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
