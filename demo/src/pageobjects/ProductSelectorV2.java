package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title=""                                
               , summary=""
               , page="ProductSelector"
               , namespacePrefix="ProvarQS"
               , object="Opportunity"
               , connection="SF_Admin"
     )             
public class ProductSelectorV2 {

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.Name}\"]")
	@SalesforceField(name = "Name", object = "Opportunity")
	public WebElement opportunityName;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.StageName}\"]")
	@SalesforceField(name = "StageName", object = "Opportunity")
	public WebElement stage;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.CloseDate}\"]")
	@SalesforceField(name = "CloseDate", object = "Opportunity")
	public WebElement closeDate;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!save}']")
	public WebElement save;
	@PageTable(row = LineItems.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!LineItems}\"]")
	public List<LineItems> lineItems;
	@PageRow(byColumn = true)
	public static class LineItems {

		@ChoiceListType(values = { @ChoiceListValue(value = "GenWatt Diesel 1000kW"),
				@ChoiceListValue(value = "GenWatt Diesel 10kW"), @ChoiceListValue(value = "GenWatt Diesel 200kW"),
				@ChoiceListValue(value = "GenWatt Gasoline 2000kW"), @ChoiceListValue(value = "GenWatt Gasoline 300kW"),
				@ChoiceListValue(value = "GenWatt Gasoline 750kW"), @ChoiceListValue(value = "GenWatt Propane 100kW"),
				@ChoiceListValue(value = "GenWatt Propane 1500kW"), @ChoiceListValue(value = "GenWatt Propane 500kW"),
				@ChoiceListValue(value = "Installation", title = " Industrial - High"),
				@ChoiceListValue(value = "Installation", title = " Industrial - Low"),
				@ChoiceListValue(value = "Installation", title = " Industrial - Medium"),
				@ChoiceListValue(value = "Installation", title = " Portable"),
				@ChoiceListValue(value = "SLA", title = " Bronze"), @ChoiceListValue(value = "SLA", title = " Gold"),
				@ChoiceListValue(value = "SLA", title = " Platinum"),
				@ChoiceListValue(value = "SLA", title = " Silver") })
		@VisualforceBy(componentXPath = "apex:selectList[@value = \"{!dummyId}\"]")
		public WebElement selectProduct;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!lines.TotalPrice}\"]")
		public WebElement amount;
	}
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.StageName}\"]")
	@SalesforceField(name = "StageName", object = "Opportunity")
	public WebElement stage1;
	@PageTable(row = OpportunityLineItems.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!LineItems}\"]")
	public List<OpportunityLineItems> OpportunityLineItems;
	@PageRow(byColumn = true)
	public static class OpportunityLineItems {

		@ChoiceListType(values = { @ChoiceListValue(value = "GenWatt Diesel 1000kW"),
				@ChoiceListValue(value = "GenWatt Diesel 10kW"), @ChoiceListValue(value = "GenWatt Diesel 200kW"),
				@ChoiceListValue(value = "GenWatt Gasoline 2000kW"), @ChoiceListValue(value = "GenWatt Gasoline 300kW"),
				@ChoiceListValue(value = "GenWatt Gasoline 750kW"), @ChoiceListValue(value = "GenWatt Propane 100kW"),
				@ChoiceListValue(value = "GenWatt Propane 1500kW"), @ChoiceListValue(value = "GenWatt Propane 500kW"),
				@ChoiceListValue(value = "Installation", title = " Industrial - High"),
				@ChoiceListValue(value = "Installation", title = " Industrial - Low"),
				@ChoiceListValue(value = "Installation", title = " Industrial - Medium"),
				@ChoiceListValue(value = "Installation", title = " Portable"),
				@ChoiceListValue(value = "SLA", title = " Bronze"), @ChoiceListValue(value = "SLA", title = " Gold"),
				@ChoiceListValue(value = "SLA", title = " Platinum"),
				@ChoiceListValue(value = "SLA", title = " Silver") })
		@VisualforceBy(componentXPath = "apex:selectList[@value = \"{!dummyId}\"]")
		public WebElement selectProduct;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!lines.TotalPrice}\"]")
		public WebElement amount;
		@ChoiceListType(values = { @ChoiceListValue(value = "GenWatt Diesel 1000kW"),
				@ChoiceListValue(value = "GenWatt Diesel 10kW"), @ChoiceListValue(value = "GenWatt Diesel 200kW"),
				@ChoiceListValue(value = "GenWatt Gasoline 2000kW"), @ChoiceListValue(value = "GenWatt Gasoline 300kW"),
				@ChoiceListValue(value = "GenWatt Gasoline 750kW"), @ChoiceListValue(value = "GenWatt Propane 100kW"),
				@ChoiceListValue(value = "GenWatt Propane 1500kW"), @ChoiceListValue(value = "GenWatt Propane 500kW"),
				@ChoiceListValue(value = "Installation", title = " Industrial - High"),
				@ChoiceListValue(value = "Installation", title = " Industrial - Low"),
				@ChoiceListValue(value = "Installation", title = " Industrial - Medium"),
				@ChoiceListValue(value = "Installation", title = " Portable"),
				@ChoiceListValue(value = "SLA", title = " Bronze"), @ChoiceListValue(value = "SLA", title = " Gold"),
				@ChoiceListValue(value = "SLA", title = " Platinum"),
				@ChoiceListValue(value = "SLA", title = " Silver") })
		@VisualforceBy(componentXPath = "apex:selectList[@value = \"{!dummyId}\"]")
		public WebElement selectProduct2;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!lines.TotalPrice}\"]")
		public WebElement amount2;
	}
	
}
