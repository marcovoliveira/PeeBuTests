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


class CheckTop5ExpensesAndTop3IncomeStepsDef {
	@Then("the user sees a list with top{int} expenses and top{int} incomes")
	public void the_user_sees_a_list_with_top_expenses_and_top_incomes(Integer tableExpenseSize, Integer tableIncomeSize) {
		WebUI.delay(1);
		WebDriver driver = DriverFactory.getWebDriver()

		List<WebElement> tableElements = driver.findElements(By.cssSelector("#inspire #tableExpense tr td:nth-child(7)"));
		ArrayList<String> tableValues = new ArrayList<String>();
		for(int i=0; i < tableElements.size(); i++){
			String str = tableElements.get(i).getText();
			tableValues.add(str);
		}

		assert tableValues.size == tableExpenseSize;

		List<WebElement> tableElements2 = driver.findElements(By.cssSelector("#inspire #tableIncome tr td:nth-child(7)"));
		ArrayList<String> tableValues2 = new ArrayList<String>();
		for(int i=0; i < tableElements2.size(); i++){
			String str = tableElements2.get(i).getText();
			tableValues2.add(str);
		}

		assert tableValues2.size == tableIncomeSize;
	}


	@Then("the user sees the {double} at {int} of tableExpense")
	public void the_user_sees_the_at_of_tableExpenses(Double value, Integer position) {
		WebUI.delay(1);
		WebDriver driver = DriverFactory.getWebDriver()

		List<WebElement> tableElements = driver.findElements(By.cssSelector("#inspire #tableExpense tr td:nth-child(3)"));
		ArrayList<String> tableValues = new ArrayList<String>();
		for(int i=0; i < tableElements.size(); i++){
			String str = tableElements.get(i).getText();
			tableValues.add(str);
		}

		assert Double.parseDouble(tableValues.get(position)) == value;
	}

	@Then("the user sees the {double} at {int} of tableIncome")
	public void the_user_sees_the_at_of_tableIncome(Double value, Integer position) {
		WebUI.delay(1);
		WebDriver driver = DriverFactory.getWebDriver()

		List<WebElement> tableElements = driver.findElements(By.cssSelector("#inspire #tableIncome tr td:nth-child(3)"));
		ArrayList<String> tableValues = new ArrayList<String>();
		for(int i=0; i < tableElements.size(); i++){
			String str = tableElements.get(i).getText();
			tableValues.add(str);
		}

		assert Double.parseDouble(tableValues.get(position)) == value;
	}
}