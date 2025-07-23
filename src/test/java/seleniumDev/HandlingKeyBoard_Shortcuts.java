package seleniumDev;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HandlingKeyBoard_Shortcuts {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/web/keyboard_shortcut.html");
		driver.manage().window().maximize();
	}

	@Test
	public void keyBoardShortCuts() throws InterruptedException {
		Actions act = new Actions(driver);

		driver.findElement(By.tagName("body")).click();
		
		// CTRL + 1: red
		act.keyDown(Keys.CONTROL)
		   .sendKeys(Keys.NUMPAD1)
		   .keyUp(Keys.CONTROL)
		   .perform();
		Thread.sleep(2000);
		String color1 = driver.findElement(By.xpath("//body")).getAttribute("style");
		System.out.println(color1);

		// SHIFT + 1: green
		act.keyDown(Keys.SHIFT)
		   .sendKeys(Keys.NUMPAD1)
		   .keyUp(Keys.SHIFT)
		   .perform();
		Thread.sleep(2000);
		String color2 = driver.findElement(By.xpath("//body")).getAttribute("style");
		System.out.println(color2);

		// CTRL + SHIFT + 1: yellow
		act.keyDown(Keys.CONTROL)
		   .keyDown(Keys.SHIFT)
		   .sendKeys(Keys.NUMPAD1)
		   .keyUp(Keys.SHIFT)
		   .keyUp(Keys.CONTROL)
		   .perform();
		Thread.sleep(2000);
		String color3 = driver.findElement(By.xpath("//body")).getAttribute("style");
		System.out.println(color3);

		// ALT + 1: lightblue
		act.keyDown(Keys.ALT)
		   .sendKeys(Keys.NUMPAD1)
		   .keyUp(Keys.ALT)
		   .perform();
		Thread.sleep(2000);
		String color4 = driver.findElement(By.xpath("//body")).getAttribute("style");
		System.out.println(color4);

		// CTRL + ALT + 1: lightgreen
		act.keyDown(Keys.CONTROL)
		   .keyDown(Keys.ALT)
		   .sendKeys(Keys.NUMPAD1)
		   .keyUp(Keys.ALT)
		   .keyUp(Keys.CONTROL)
		   .perform();
		Thread.sleep(2000);
		String color5 = driver.findElement(By.xpath("//body")).getAttribute("style");
		System.out.println(color5);

		// SHIFT + ALT + 1: silver
		act.keyDown(Keys.SHIFT)
		   .keyDown(Keys.ALT)
		   .sendKeys(Keys.NUMPAD1)
		   .keyUp(Keys.ALT)
		   .keyUp(Keys.SHIFT)
		   .perform();
		Thread.sleep(2000);
		String color6 = driver.findElement(By.xpath("//body")).getAttribute("style");
		System.out.println(color6);

		// CTRL + SHIFT + ALT + 1: magenta
		act.keyDown(Keys.CONTROL)
		   .keyDown(Keys.SHIFT)
		   .keyDown(Keys.ALT)
		   .sendKeys(Keys.NUMPAD1)
		   .keyUp(Keys.ALT)
		   .keyUp(Keys.SHIFT)
		   .keyUp(Keys.CONTROL)
		   .perform();
		Thread.sleep(2000);
		String color7 = driver.findElement(By.xpath("//body")).getAttribute("style");
		System.out.println(color7);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
