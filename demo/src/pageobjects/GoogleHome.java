package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.Page;

@Page(title = "GoogleHome", summary = "", relativeUrl = "", connection = "google")
public class GoogleHome {

	WebDriver driver;

	public GoogleHome(WebDriver driver) {

		this.driver = driver;

	}

	@ButtonType()
	@FindBy(xpath = "(//input[@value='Google Search'])[2]")
	public WebElement googleSearch;

	public void selectCSSValue() {
	
	googleSearch.getCssValue("yourAttribute");
	
	}

}
