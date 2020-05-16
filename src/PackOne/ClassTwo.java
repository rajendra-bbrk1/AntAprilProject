package PackOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassTwo {
	
	@Test
	public void methodTwoA() {
		
		System.out.println("Inside methodTwoA of ClassTwo");
		
		 System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
		  
		  WebDriver driver = new FirefoxDriver();
		  
		  driver.manage().window().maximize();
		  driver.get("http://www.amazon.com");
		  driver.close();
	}

}
