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

def index = 0;

while(index < 6) {
	
	WebUI.click(findTestObject('Object Repository/recent_mentions_or/Page_Off-Topic - master devops Mattermost/span_Off-Topic'))
	
	WebUI.delay(1)
	
	WebUI.click(findTestObject('Object Repository/recent_mentions_or/Page_Off-Topic - master devops Mattermost/button_(Edit)_channelHeaderMentionButton'))
	
	if (WebUI.verifyElementPresent(findTestObject('Object Repository/recent_mentions_or/Page_Off-Topic - master devops Mattermost/span_Jump'), 2, FailureHandling.OPTIONAL)) {
		
		WebUI.click(findTestObject('Object Repository/recent_mentions_or/Page_Off-Topic - master devops Mattermost/span_Jump'))
		
		WebUI.delay(5)
		
		break;
		
	} else {
		
		WebUI.click(findTestObject('Object Repository/recent_mentions_or/Page_Off-Topic - master devops Mattermost/i_(Edit)_icon icon-close-circle'))
	
		WebUI.delay(1)
	}
	
	index++
}

WebUI.closeBrowser()