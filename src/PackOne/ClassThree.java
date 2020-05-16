package PackOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassThree {
	
	@Test
	public void methodThreeA() {
		System.out.println("Inside methodThreeA of ClassThree");
		
		 System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
		  
		  WebDriver driver = new FirefoxDriver();
		  
		  driver.manage().window().maximize();
		  driver.get("http://www.facebook.com");
		  driver.close();
		
	}

}
