package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="home__assistant_PO"                                
               , summary=""
               , connection="TrainingUser"
               , object=""
     )             
public class home__assistant_PO {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//li[2]//span[normalize-space(.)='newTaskButtonNew TasknewEventButtonNew EventcloseButtonDismiss recommendation']/button[normalize-space(.)='closeButtonDismiss recommendation']")
	public WebElement closeButton;
	
}
