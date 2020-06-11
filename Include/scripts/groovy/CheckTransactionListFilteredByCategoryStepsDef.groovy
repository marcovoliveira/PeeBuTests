import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class CheckTransactionListFilteredByCategoryStepsDef {

	@Given("a categorized list of transactions")
	public void a_categorized_list_of_transactions() {
		WebUI.click(findTestObject('Page_client/div_Choose a category'))
		WebUI.click(findTestObject('Object Repository/Page_client/div_Selector'))
		WebUI.click(findTestObject('Object Repository/Page_client/div_Food'))
		WebUI.click(findTestObject('Page_client/span_Save'))
	}

	@When("the user click on the category column at the transactions list")
	public void the_user_click_on_the_category_column_at_the_transactions_list() {
		WebUI.click(findTestObject('Page_client/span_Category'))
	}

	@Then("the user sees a transactions list filtered by category")
	public void the_user_sees_a_transactions_list_filtered_by_category() {
		WebDriver driver = DriverFactory.getWebDriver()
		List<WebElement> tableElements = driver.findElements(By.cssSelector("#inspire tr td:nth-child(7)"));
		ArrayList<String> tableValues = new ArrayList<String>();
		for(int i=0; i < tableElements.size(); i++){
			String str = tableElements.get(i).getText();
			tableValues.add(str);
		}

		ArrayList<String> referenceValues = new ArrayList<String>();
		for(int i=0; i < tableValues.size(); i++){
			referenceValues.add(tableValues.get(i))
		}

		Collections.sort(referenceValues)

		assert referenceValues.equals(tableValues)
	}
}