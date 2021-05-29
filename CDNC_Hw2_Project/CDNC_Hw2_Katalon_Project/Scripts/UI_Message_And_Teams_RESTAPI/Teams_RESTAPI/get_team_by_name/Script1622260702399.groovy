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
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testdata.CSVData
import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def request = (RequestObject)findTestObject('Teams/getTeamByName')

CSVData data = findTestData("UI_Message_And_Teams_RESTAPI_DATA/CSVs/name_team_data")

def index = 0;
while(index < data.getRowNumbers()) {
	request.setRestUrl("https://haibui-mattermost-demo.herokuapp.com/api/v4/teams/name/" + data.getAllData()[index][0])
	def response = WS.sendRequest(request)
	JsonSlurper slurper = new JsonSlurper()
	def object = slurper.parseText(response.getResponseText())
	System.out.println(object)
	index++
}