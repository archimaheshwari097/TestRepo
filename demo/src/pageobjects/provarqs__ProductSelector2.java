package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Provarqs__ Product Selector 2"                                
               , summary=""
               , page="ProductSelector2"
               , namespacePrefix="ProvarQS"
               , object="Opportunity"
               , connection="TrainingUser"
     )             
public class provarqs__ProductSelector2 {

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.Name}\"]")
	@SalesforceField(name = "Name", object = "Opportunity")
	public WebElement opportunityName;
	@PageTable(row = LineItems.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!LineItems}\"]")
	public List<LineItems> lineItems;

	@PageRow(byColumn = true)
	public static class LineItems {

		@ChoiceListType()
		@VisualforceBy(componentXPath = "apex:selectList[@value = \"{!lines.PriceBookEntryId}\"]")
		public WebElement selectProduct;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!lines.TotalPrice}\"]")
		public WebElement amount;
	}

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!save}']")
	public WebElement save;
	
}
