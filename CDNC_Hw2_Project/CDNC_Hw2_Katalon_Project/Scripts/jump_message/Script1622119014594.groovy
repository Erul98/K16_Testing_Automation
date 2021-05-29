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
import com.kms.katalon.core.testdata.InternalData

WebUI.callTestCase(findTestCase('login_anhnh_account'), [:], FailureHandling.STOP_ON_FAILURE)

InternalData data = findTestData("text_search_internal_data")

for (def index : (0..data.getRowNumbers() - 1)) {
	WebUI.setText(findTestObject('Object Repository/jump_message_or/Page_Town Square - master devops Mattermost/input_(Edit)_searchBox'),
		data.internallyGetValue("text", index))
	
	WebUI.sendKeys(findTestObject('Object Repository/jump_message_or/Page_Town Square - master devops Mattermost/input_(Edit)_searchBox'),
		Keys.chord(Keys.ENTER))
	
	WebUI.delay(2)
	
	if (WebUI.verifyElementPresent(findTestObject('Object Repository/jump_message_or/Page_Town Square - master devops Mattermost/span_Jump'), 2, FailureHandling.OPTIONAL)) {
		
		WebUI.click(findTestObject('Object Repository/jump_message_or/Page_Town Square - master devops Mattermost/span_Jump'))
		
		WebUI.delay(1)
		
		WebUI.click(findTestObject('Object Repository/jump_message_or/Page_Town Square - master devops Mattermost/span_Town Square'))
		
		WebUI.delay(1)
	} else {
		
		WebUI.click(findTestObject('Object Repository/jump_message_or/Page_Town Square - master devops Mattermost/span_Town Square'))
		
		WebUI.delay(1)
	}
}

WebUI.delay(2)

WebUI.closeBrowser()