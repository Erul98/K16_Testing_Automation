import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By
import org.openqa.selenium.WebElement

WebUI.callTestCase(findTestCase('LOGIN_ACCOUNTSETTING/IF_ELSE/TC_Login Success'), null, FailureHandling.STOP_ON_FAILURE)

List<WebElement> memberChats = DriverFactory.getWebDriver().findElements(By.xpath("//div[contains(@class,'other--root')]"))

int lastMember = memberChats.size()

for(int i = 1 ; i <= findTestData('LOGIN_ACCOUNTSETTING_DATA/Data_CSV_IconReaction').getRowNumbers(); i++) {
	
	memberChats[lastMember-1].click();
	
	DriverFactory.getWebDriver().findElement(By.xpath("//button[contains(@class,'post-menu__item--reactions')]")).click()
	
	String icon = findTestData('LOGIN_ACCOUNTSETTING_DATA/Data_CSV_IconReaction').getValue(1, i);
	
	//click icon
	DriverFactory.getWebDriver().findElement(By.xpath("//img[(@data-testid='"+icon+"')]")).click();
	
	String xpathButtonIcon = "(//div[contains(@class,'other--root')])["+lastMember+"]/div/div[2]/div[2]/div/div[2]/button["+1+"]";
	
	println(xpathButtonIcon);
	
	TestObject buttonIcon = new TestObject().addProperty("xpath", ConditionType.EQUALS,xpathButtonIcon )
	
	WebUI.verifyElementVisible(buttonIcon, FailureHandling.STOP_ON_FAILURE)
	
	WebUI.click(buttonIcon)
}

WebUI.closeBrowser();