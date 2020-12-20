package test1;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import validate.PageObjectPO;

public class TestAnnotationsLoactors {
	
	public WebDriver driver;
	
	@Test
	public void locatorsAnnotations() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("file:///home/qualitrix/Desktop/ws/Test_01/html/xpath.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageObjectPO po=new PageObjectPO(driver);
		for (int i = 0; i < po.getRadioButtonSize(); i++) {
			Thread.sleep(1000);
			po.getAllRadioButtons(i).click();
		}
		driver.close();
	}

}
