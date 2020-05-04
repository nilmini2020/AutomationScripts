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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

String username='dilshan1744'
String password='#compaq123'
String email='dilshan991@gmail.com'
String secanswer='test answer'

String urlresult

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('http://localhost:8080/index.jsp')
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HomePage/lnkSignupNow'))
WebUI.delay(2)
String urltext=WebUI.getUrl()

if(urltext.contains("http://localhost:8080/applicant/applicant.jsp"))
{
	urlresult='pass'
}

else{
	urlresult='fail'
}

WebUI.verifyMatch(urlresult, 'pass', false)
WebUI.delay(1)

WebUI.sendKeys(findTestObject('ApplicantRegistration/txtUserName'), username)
WebUI.sendKeys(findTestObject('ApplicantRegistration/txtPassword'), password)
WebUI.sendKeys(findTestObject('ApplicantRegistration/txtPasswordConfirmation'), password)
WebUI.sendKeys(findTestObject('ApplicantRegistration/txtEmail'), email)
WebUI.sendKeys(findTestObject('ApplicantRegistration/txtEmailConfirmation'), email)
WebUI.selectOptionByIndex(findTestObject('ApplicantRegistration/ddlSelectQuestion'), 2)
WebUI.sendKeys(findTestObject('ApplicantRegistration/txtSecretAnswer'), secanswer)
WebUI.delay(1)
WebUI.click(findTestObject('ApplicantRegistration/btnCreateAccount'))
WebUI.delay(2)

urltext=WebUI.getUrl()

if(urltext.contains("http://localhost:8080/applicant/welcome.jsp"))
{
	urlresult='pass'
}

else{
	urlresult='fail'
}
WebUI.verifyMatch(urlresult, 'pass', false)

