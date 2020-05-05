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

String invalidUsername='erefdrerdfdf'
String validUsername='dilshan993'
String invalidPwd='erererer'
String validPwd='#compaq123'


//login only by enter invalid username 
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('http://localhost:8080/index.jsp')
WebUI.click(findTestObject('HomePage/lnkAllVacancies'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyGridView/lnkViewAsList'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyListView/lnkPostTest2email'))
WebUI.delay(1)
WebUI.switchToWindowTitle('ADVIEW')
WebUI.delay(1)
WebUI.click(findTestObject('VacancyAdview/btnApplyViaEmail'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyAdview/lnkLogin'))
WebUI.delay(2)
WebUI.switchToWindowTitle('Applicant Login')
String urltext=WebUI.getUrl()
WebUI.verifyMatch(urltext, 'http://localhost:8080/applicant/login.jsp', false)
WebUI.sendKeys(findTestObject('Object Repository/ApplicantLogin/txtUserName'), invalidUsername)
WebUI.click(findTestObject('Object Repository/ApplicantLogin/btnLoginSubmit'))
WebUI.delay(1)
WebUI.acceptAlert()
WebUI.delay(1)
WebUI.verifyElementVisible(findTestObject('Object Repository/ApplicantLogin/lblErrorInvalidLogin'))
WebUI.closeBrowser()


//login only by enter valid username
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('http://localhost:8080/index.jsp')
WebUI.click(findTestObject('HomePage/lnkAllVacancies'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyGridView/lnkViewAsList'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyListView/lnkPostTest2email'))
WebUI.delay(1)
WebUI.switchToWindowTitle('ADVIEW')
WebUI.delay(1)
WebUI.click(findTestObject('VacancyAdview/btnApplyViaEmail'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyAdview/lnkLogin'))
WebUI.delay(2)
WebUI.switchToWindowTitle('Applicant Login')
urltext=WebUI.getUrl()
WebUI.verifyMatch(urltext, 'http://localhost:8080/applicant/login.jsp', false)
WebUI.sendKeys(findTestObject('Object Repository/ApplicantLogin/txtUserName'), validUsername)
WebUI.click(findTestObject('Object Repository/ApplicantLogin/btnLoginSubmit'))
WebUI.delay(1)
WebUI.acceptAlert()
WebUI.delay(1)
WebUI.verifyElementVisible(findTestObject('Object Repository/ApplicantLogin/lblErrorInvalidLogin'))
WebUI.closeBrowser()




//login only by enter invalid Password
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('http://localhost:8080/index.jsp')
WebUI.click(findTestObject('HomePage/lnkAllVacancies'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyGridView/lnkViewAsList'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyListView/lnkPostTest2email'))
WebUI.delay(1)
WebUI.switchToWindowTitle('ADVIEW')
WebUI.delay(1)
WebUI.click(findTestObject('VacancyAdview/btnApplyViaEmail'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyAdview/lnkLogin'))
WebUI.delay(2)
WebUI.switchToWindowTitle('Applicant Login')
urltext=WebUI.getUrl()
WebUI.verifyMatch(urltext, 'http://localhost:8080/applicant/login.jsp', false)
WebUI.sendKeys(findTestObject('Object Repository/ApplicantLogin/txtLoginPassword'), invalidPwd)
WebUI.click(findTestObject('Object Repository/ApplicantLogin/btnLoginSubmit'))
WebUI.delay(1)
WebUI.acceptAlert()
WebUI.delay(1)
WebUI.verifyElementVisible(findTestObject('Object Repository/ApplicantLogin/lblErrorInvalidLogin'))
WebUI.closeBrowser()


//login only by enter valid Password
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('http://localhost:8080/index.jsp')
WebUI.click(findTestObject('HomePage/lnkAllVacancies'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyGridView/lnkViewAsList'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyListView/lnkPostTest2email'))
WebUI.delay(1)
WebUI.switchToWindowTitle('ADVIEW')
WebUI.delay(1)
WebUI.click(findTestObject('VacancyAdview/btnApplyViaEmail'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyAdview/lnkLogin'))
WebUI.delay(2)
WebUI.switchToWindowTitle('Applicant Login')
urltext=WebUI.getUrl()
WebUI.verifyMatch(urltext, 'http://localhost:8080/applicant/login.jsp', false)
WebUI.sendKeys(findTestObject('Object Repository/ApplicantLogin/txtLoginPassword'), validPwd)
WebUI.click(findTestObject('Object Repository/ApplicantLogin/btnLoginSubmit'))
WebUI.delay(1)
WebUI.acceptAlert()
WebUI.delay(1)
WebUI.verifyElementVisible(findTestObject('Object Repository/ApplicantLogin/lblErrorInvalidLogin'))
WebUI.closeBrowser()



//login only by enter invalid Username and Password
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('http://localhost:8080/index.jsp')
WebUI.click(findTestObject('HomePage/lnkAllVacancies'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyGridView/lnkViewAsList'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyListView/lnkPostTest2email'))
WebUI.delay(1)
WebUI.switchToWindowTitle('ADVIEW')
WebUI.delay(1)
WebUI.click(findTestObject('VacancyAdview/btnApplyViaEmail'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyAdview/lnkLogin'))
WebUI.delay(2)
WebUI.switchToWindowTitle('Applicant Login')
urltext=WebUI.getUrl()
WebUI.verifyMatch(urltext, 'http://localhost:8080/applicant/login.jsp', false)
WebUI.sendKeys(findTestObject('ApplicantLogin/txtUserName'), invalidUsername)
WebUI.sendKeys(findTestObject('ApplicantLogin/txtLoginPassword'), invalidPwd)
WebUI.click(findTestObject('ApplicantLogin/btnLoginSubmit'))
WebUI.verifyElementVisible(findTestObject('Object Repository/ApplicantLogin/lblErrorInvalidLogin'))
WebUI.closeBrowser()




//login only by enter valid Username and Password 

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('http://localhost:8080/index.jsp')
WebUI.click(findTestObject('HomePage/lnkAllVacancies'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyGridView/lnkViewAsList'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyListView/lnkPostTest2email'))
WebUI.delay(1)
WebUI.switchToWindowTitle('ADVIEW')
WebUI.delay(1)
WebUI.click(findTestObject('VacancyAdview/btnApplyViaEmail'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyAdview/lnkLogin'))
WebUI.delay(2)
WebUI.switchToWindowTitle('Applicant Login')
urltext=WebUI.getUrl()
WebUI.verifyMatch(urltext, 'http://localhost:8080/applicant/login.jsp', false)
WebUI.sendKeys(findTestObject('ApplicantLogin/txtUserName'), validUsername)
WebUI.sendKeys(findTestObject('ApplicantLogin/txtLoginPassword'), validPwd)
WebUI.click(findTestObject('ApplicantLogin/btnLoginSubmit'))
WebUI.delay(2)
urltext=WebUI.getUrl()
String urlresult
if(urltext.contains("http://localhost:8080/applicant/welcome.jsp"))
{
	urlresult='pass'
}

else{
	urlresult='fail'
}
WebUI.verifyMatch(urlresult, 'pass', false)
