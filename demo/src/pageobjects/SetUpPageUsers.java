package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="SetUpPageUsers"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class SetUpPageUsers {

	@PageFrame()
	public static class Frame {

		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Training User, Provar']")
		public WebElement trainingUserProvar;

	}

	@FindBy(xpath = "//iframe[contains(@name,'vfFrameId_')]")
	public Frame frame;
			
}
