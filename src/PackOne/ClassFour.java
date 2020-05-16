package PackOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassFour {
	
	@Test
	public void methodFourA() {
		System.out.println("Inside methodFourA of ClassFour");
		
		 System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
		  
		  WebDriver driver = new FirefoxDriver();
		  
		  driver.manage().window().maximize();
		  driver.get("http://www.netflix.com");
		  driver.close();

}
}
