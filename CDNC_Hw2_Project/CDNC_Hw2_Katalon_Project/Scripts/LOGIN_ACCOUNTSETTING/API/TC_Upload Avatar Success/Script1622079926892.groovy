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

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.FormDataBodyParameter as FormDataBodyParameter
import com.kms.katalon.core.testobject.RestRequestObjectBuilder
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
String baseUrl = "https://haibui-mattermost-demo.herokuapp.com/api/v4/users/"

String url = baseUrl + userId + "/image"

TestObjectProperty auth = new TestObjectProperty('Authorization', ConditionType.EQUALS, accessToken)
TestObjectProperty contentType = new TestObjectProperty('Content-Type', ConditionType.EQUALS, 'multipart/form-data')
TestObjectProperty accept = new TestObjectProperty('Accept', ConditionType.EQUALS, '*/*')

FormDataBodyParameter image = new FormDataBodyParameter('image',image, 'File')

RequestObject req = new RestRequestObjectBuilder()
.withRestUrl(url)
.withHttpHeaders([auth, contentType, accept])
.withRestRequestMethod('POST')
.withMultipartFormDataBodyContent([image])
.build()


ResponseObject res = WS.sendRequest(req)

WS.verifyResponseStatusCode(res, 200)

