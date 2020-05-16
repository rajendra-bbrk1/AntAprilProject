package PackOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassOne {

	@Test
		public void methodOneA() {
			System.out.println("Inside methodOneA of ClassOne");
			
			 System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
			  
			  WebDriver driver = new FirefoxDriver();
			  
			  driver.manage().window().maximize();
			  driver.get("http://www.google.com");
			  driver.close();
  }
}
