package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage(title = "", summary = "", page = "ProductSelector", namespacePrefix = "ProvarQS", object = "Opportunity", connection = "Admin")
public class ProductSelector {

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.Name}\"]")
	@SalesforceField(name = "Name", object = "Opportunity")
	public WebElement opportunityName;

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.StageName}\"]")
	@SalesforceField(name = "StageName", object = "Opportunity")
	public WebElement stage;

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.CloseDate}\"]")
	@SalesforceField(name = "CloseDate", object = "Opportunity")
	public WebElement closeDate;

	@PageTable(row = LineItems.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!LineItems}\"]")
	public List<LineItems> lineItems;

	@FindBy(xpath = "//input[contains(@class,'this is for IE') or contains(@id,'this is for firefox')]")
	public WebElement dropdown;

	@PageRow(byColumn = true)
	public static class LineItems {

		@ChoiceListType(values = { @ChoiceListValue(value = "GenWatt Diesel 1000kW"),
				@ChoiceListValue(value = "GenWatt Diesel 10kW"), @ChoiceListValue(value = "GenWatt Diesel 200kW"),
				@ChoiceListValue(value = "GenWatt Gasoline 2000kW"), @ChoiceListValue(value = "GenWatt Gasoline 300kW"),
				@ChoiceListValue(value = "GenWatt Gasoline 750kW"), @ChoiceListValue(value = "GenWatt Propane 100kW"),
				@ChoiceListValue(value = "GenWatt Propane 1500kW"), @ChoiceListValue(value = "GenWatt Propane 500kW"),
				@ChoiceListValue(value = "Installation: Industrial - High"),
				@ChoiceListValue(value = "Installation: Industrial - Low"),
				@ChoiceListValue(value = "Installation: Industrial - Medium"),
				@ChoiceListValue(value = "Installation: Portable"), @ChoiceListValue(value = "SLA: Bronze"),
				@ChoiceListValue(value = "SLA: Gold"), @ChoiceListValue(value = "SLA: Platinum"),
				@ChoiceListValue(value = "SLA: Silver") })
		@VisualforceBy(componentXPath = "apex:selectList[@value = \"{!lines.PriceBookEntryId}\"]")
		public WebElement selectProduct;

		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!lines.TotalPrice}\"]")
		public WebElement amount;

		@VisualforceBy(componentXPath = "apex:inputTextArea[@value = \"{!lines.Description}\"]")
		@SalesforceField(name = "Description", object = "Opportunity")
		public WebElement notes;
	}

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!save}']")
	public WebElement save;

}
