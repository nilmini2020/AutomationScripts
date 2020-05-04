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
import org.openqa.selenium.Keys as Keys


String referno

String username='dilshan1759'
String password='#compaq123'
String email='dilshan991@gmail.com'
String secanswer='test answer'



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
referno=WebUI.getText(findTestObject('VacancyAdview/lblReferenceNo'))


WebUI.click(findTestObject('VacancyAdview/btnApplyViaEmail'))
WebUI.delay(2)

WebUI.click(findTestObject('VacancyAdview/lnkSignUp'))
WebUI.delay(2)


WebUI.switchToWindowTitle('Applicant Registration')

String urltext=WebUI.getUrl()
WebUI.verifyMatch(urltext, 'http://localhost:8080/applicant/applicant.jsp', false)
WebUI.delay(2)

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
WebUI.switchToWindowTitle('Applicant Details')
WebUI.verifyElementVisible(findTestObject('ApplicantCommonProfile/lnkClickHere'))
WebUI.verifyElementVisible(findTestObject('ApplicantCommonProfile/frmDetailTable'))

//WebUI.verifyElementText(WebUI.getWindowTitle(), 'topjobs - Sri Lanka Job Network - jobs/vacancies, careers and employment')


