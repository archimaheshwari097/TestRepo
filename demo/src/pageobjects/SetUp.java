package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="SetUp"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class SetUp {

	@LinkType()
	@FindBy(linkText = "Setup")
	public WebElement setup;
			
}
