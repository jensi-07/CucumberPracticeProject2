package stepdefinations;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HoverPage;

public class HoverStepDefinationTest {
	
	WebDriver driver;
	HoverPage hp = new HoverPage();
	
	@Given("user is already on Home Page")
	public void user_is_already_on_home_page() {
//		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
		hp.openBrowser();
		hp.openHomePage();
		
	}

	@When("title of login page is {string}")
	public void title_of_login_page_is(String title) {
		//System.out.println(driver.getTitle());
		String expectedTitle = title ;
		  String actualTitle = hp.getTitle();
		  Assert.assertEquals(expectedTitle, actualTitle);
	}
	@Then("user close login pop up")
	public void user_close_login_pop_up() throws InterruptedException {
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		Thread.sleep(2000);
		hp.closePopUpPage();
	}

	@Then("user hover on fashion")
	public void user_hover_on_fashion() throws InterruptedException {
//		WebElement fashion = driver.findElement(By.xpath("//div[@class='_37M3Pb']/div[3]"));
//		Actions builder = new Actions(driver);
//		builder.moveToElement(fashion).build().perform();
//		Thread.sleep(2000);
		hp.hoverOnFashion();
	}

	@Then("user get fashion list")
	public void user_get_fashion_list() {
//		List<WebElement> menList = driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a"));
//		System.out.println(menList.size());
//
//		for (WebElement a : menList) {
//			System.out.println(a.getText());
		
//		}
		hp.getFashionList();
	}

	@Then("user quit")
	public void user_quit() {
//	   driver.quit();
		hp.closeBrowser();
	}
	
	@Then("user hover on electronics")
	public void user_hover_on_electronics() throws InterruptedException {
//		WebElement electronics = driver.findElement(By.xpath("//div[@class='_37M3Pb']/div[4]"));
//		Actions builder = new Actions(driver);
//		builder.moveToElement(electronics).build().perform();
//	Thread.sleep(2000);
		hp.hoverOnElectronics();
	}
	@Then("user get electronics list")
	public void user_get_electronics_list() {
//		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a"));
//		System.out.println(ele.size());
//
//		for (WebElement e : ele) {
//			System.out.println(e.getText());
//		}
		hp.getElectronicsList();
		}
	@Then("user hover on Furniture")
	public void user_hover_on_furniture() throws InterruptedException {
//		WebElement home = driver.findElement(By.xpath("//div[@class='_37M3Pb']/div[5]"));
//		Actions builder = new Actions(driver);
//		builder.moveToElement(home).build().perform();
//		Thread.sleep(2000);
		hp.hoverOnFurniture();
	}

	@Then("user get Furniture list")
	public void user_get_furniture_list() {
//		List<WebElement> hm = driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a"));
//		System.out.println(hm.size());
//
//		for (WebElement h : hm) {
//			System.out.println(h.getText());
//		}
		hp.getFurnitureList();
	}
	@Then("user hover on toys,beauty and others")
	public void user_hover_on_toys_beauty_and_others() throws InterruptedException {
//		WebElement toys = driver.findElement(By.xpath("//div[@class='_37M3Pb']/div[9]"));
//		Actions builder = new Actions(driver);
//		builder.moveToElement(toys).build().perform();
//		Thread.sleep(2000);
hp.hoverOntoysAndMore();
	}

	@Then("user get toys,beauty and others list")
	public void user_get_toys_beauty_and_others_list() {
//		List<WebElement> tb = driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a"));
//		System.out.println(tb.size());
//
//		for (WebElement t : tb) {
//			System.out.println(t.getText());
//		}
		hp.getToysAndMoreList();
	}
	@Then("user hover on motorBike")
	public void user_hover_on_motor_bike() throws InterruptedException {
//		WebElement bike = driver.findElement(By.xpath("//div[@class='_37M3Pb']/div[10]"));
//		Actions builder = new Actions(driver);
//		builder.moveToElement(bike).build().perform();
//		Thread.sleep(2000);
		hp.hoverOnMotorBike();
	}

	@Then("user get motorBike list")
	public void user_get_motor_bike_list() {
//		List<WebElement> mb = driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a"));
//		System.out.println(mb.size());
//
//		for (WebElement b : mb) {
//			System.out.println(b.getText());
//		}
		hp.getMotorBikeList();
	}

}
