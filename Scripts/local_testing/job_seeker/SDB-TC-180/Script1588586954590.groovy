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


String username='dilshan993'
String password='#compaq123'

String curenturl
String urlresult

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('http://localhost:8080/index.jsp')
WebUI.delay(2)
WebUI.click(findTestObject('HomePage/lnkJobseekerLogin'))
WebUI.delay(2)
WebUI.switchToWindowTitle('Applicant Login')


curenturl=WebUI.getUrl()

if(curenturl.contains("http://localhost:8080/applicant/login.jsp"))
{
	urlresult='pass'
}

else{
	urlresult='fail'
}

WebUI.verifyMatch(urlresult, 'pass', false)
WebUI.sendKeys(findTestObject('ApplicantLogin/txtUserName'), username)
WebUI.sendKeys(findTestObject('ApplicantLogin/txtLoginPassword'), password)
WebUI.click(findTestObject('ApplicantLogin/btnLoginSubmit'))
WebUI.delay(2)
WebUI.switchToWindowTitle('Welcome to topjobs')
WebUI.click(findTestObject('Object Repository/WelcomePage/lnkHome'))
WebUI.delay(2)
WebUI.switchToWindowTitle('topjobs - Sri Lanka Job Network - jobs/vacancies, careers and employment')
WebUI.click(findTestObject('Object Repository/HomePage/lnkMyProfile'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/ApplicantProfile/lnkBrandixEmployer'))
WebUI.delay(2)

curenturl=WebUI.getUrl()

if(curenturl.contains("http://localhost:8080/employer/home.jsp"))
{
	urlresult='pass'
}

else{
	urlresult='fail'
}


WebUI.verifyMatch(urlresult, 'pass', false)
WebUI.click(findTestObject('Object Repository/EmployerPage/lnkWelcome'))
WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Object Repository/WelcomePage/lblGoBackPreviousEmployer'))
WebUI.click(findTestObject('Object Repository/WelcomePage/lnkClickHerePreviousVisit'))

WebUI.delay(4)
curenturl=WebUI.getUrl()

if(curenturl.contains("http://localhost:8080/employer/home.jsp"))
{
	urlresult='pass'
}

else{
	urlresult='fail'
}


//check git update
