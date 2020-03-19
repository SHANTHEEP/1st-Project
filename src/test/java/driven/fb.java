package driven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\sandeep\\testing\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement mail = driver.findElement(By.xpath("//input[@type='email']"));
		mail.sendKeys("SAN");
		String at = mail.getAttribute("class");
		System.out.println(at);
	}

}
