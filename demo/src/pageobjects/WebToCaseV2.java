package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="WebToCaseV2"                                
     , summary=""
     , relativeUrl=""
     , connection="WebToCase"
     )             
public class WebToCaseV2 {

	@TextType()
	@FindByLabel(label = "Contact Name")
	public WebElement contactName;
	@TextType()
	@FindByLabel(label = "Email")
	public WebElement email;
	@TextType()
	@FindByLabel(label = "Phone")
	public WebElement phone;
	@ChoiceListType(values = { @ChoiceListValue(value = "High"), @ChoiceListValue(value = "Medium"),
			@ChoiceListValue(value = "Low") })
	@FindByLabel(label = "Priority")
	public WebElement priority;
	@TextType()
	@FindByLabel(label = "Subject")
	public WebElement subject;
	@ButtonType()
	@FindBy(name = "submit")
	public WebElement Submitbutton;
	@LinkType()
	@FindBy(linkText = "Accounts")
	public WebElement accounts;
			
}
