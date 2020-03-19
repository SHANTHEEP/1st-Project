package driven;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\sandeep\\testing\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("(//a[@pogid='633118830006'])[1]")).click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
	}
	
}
