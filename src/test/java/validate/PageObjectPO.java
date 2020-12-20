package validate;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObjectPO {
	
	public PageObjectPO(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="userName")
	WebElement username;
	public WebElement setUserName() {
		return username;
	}
	
	@FindBy(how=How.ID,using="userName")
	WebElement username1;
	public WebElement setUserName1() {
		return username1;
	}
	
	@FindBy(xpath="//input[@id='userEmail']")
	WebElement userEmail;
	public WebElement setUserEmail() {
		return userEmail;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='userEmail']")
	WebElement userEmail1;
	public WebElement setUserEmail1() {
		return userEmail1;
	}
	
	@FindBy(xpath="//input[@type='radio']")
	List<WebElement> allRadioButtons;
	public List<WebElement> allRadioButtons(){
		return allRadioButtons;
	}
	
	public int getRadioButtonSize() {
		return allRadioButtons.size();
	}
	
	public WebElement getAllRadioButtons(int i) {
		return allRadioButtons.get(i);
	}
	
	@FindAll({
		@FindBy(xpath="//input[@type='radio']"),
		@FindBy(xpath="//input[@type='checkbox']"),
//		@FindBy(xpath="//input[@type='text']")
		})
	List<WebElement> allRadioCheckboxTextbox;
	public List<WebElement> allRadioCheckboxTextbox(){
		return allRadioCheckboxTextbox;
	}
	
	public int getAllRadioCheckboxTextbox() {
		return allRadioCheckboxTextbox.size();
	}
	
	public WebElement getAllRadioCheckbox(int i) {
		return allRadioCheckboxTextbox.get(i);
	}
	

}
