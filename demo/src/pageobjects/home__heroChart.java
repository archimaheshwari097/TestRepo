package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="home__heroChart"                                
               , summary=""
               , connection="TrainingUser"
               , object=""
     )             
public class home__heroChart {

	@ButtonType()
	@AuraBy(componentXPath = "//lightning:buttonIcon[@aura:id= 'refreshButton']")
	public WebElement refreshChart;
	
}
