package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="home__assistant"                                
               , summary=""
               , connection="TrainingUser"
               , object=""
     )             
public class home__assistant {

	@LinkType()
	@FindBy(linkText = "Leena Test")
	public WebElement Test;
	
}
