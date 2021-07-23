package pageobjects.UIApp;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="WebtoCasePO"                                
     , summary=""
     , relativeUrl=""
     , connection="WebToCase"
     )             
public class WebtoCasePO {
	WebDriver driver;
	public WebtoCasePO(WebDriver driver){
	 this.driver =driver;
	}

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Contact Name']/following-sibling::div//input")
	public WebElement AM_text_contactName;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Priority']/following-sibling::div//select")
	public WebElement AM_dropdown_priority;
	@ButtonType()
	@FindByLabel(label = "Submit")
	public WebElement AM_btn_submit;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='New Report']")
	public WebElement AM_btn_Report;
	@ButtonType()
	@FindBy(xpath="//a[normalize-space(.)='New Report (Salesforce Classic)']")
	public WebElement AM_btn_NewReportClassic;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Search for:']/input[@name='s']")
	public WebElement searchByKeyword;

		public void Method(){
		//////MethodBody///////
		}	
}
