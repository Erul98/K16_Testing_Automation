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

WebUI.click(findTestObject('Object Repository/send_icon_or/Page_Off-Topic - master devops Mattermost/span_Off-Topic'))

InternalData data = findTestData("icon_object_internal_data")

def index = 0;

while(index < data.getRowNumbers()) {
	WebUI.click(findTestObject('Object Repository/send_icon_or/Page_Off-Topic - master devops Mattermost/button__emoji-picker__container post-action'))
	WebUI.delay(1)
	
	WebUI.click(findTestObject(data.internallyGetValue('object', index)))
	WebUI.delay(1)
	
	WebUI.click(findTestObject('Object Repository/send_icon_or/Page_Off-Topic - master devops Mattermost/textarea_Write to Off-Topic_post_textbox'))
	WebUI.delay(1)
	
	WebUI.sendKeys(findTestObject('Object Repository/send_icon_or/Page_Off-Topic - master devops Mattermost/textarea_Write to Off-Topic_post_textbox'),
		Keys.chord(Keys.ENTER))
	WebUI.delay(1)
	
	index++
}

WebUI.closeBrowser()