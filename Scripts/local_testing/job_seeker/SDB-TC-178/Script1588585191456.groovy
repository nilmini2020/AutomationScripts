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

String invalidUsername='wronguser'
String invalidPwd='wrongpwd'

//login only by enter invalid Username and Password
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('http://localhost:8080/index.jsp')
WebUI.delay(2)
WebUI.click(findTestObject('HomePage/lnkJobseekerLogin'))
WebUI.delay(2)
WebUI.switchToWindowTitle('Applicant Login')
urltext=WebUI.getUrl()
WebUI.verifyMatch(urltext, 'http://localhost:8080/applicant/login.jsp', false)
WebUI.sendKeys(findTestObject('ApplicantLogin/txtUserName'), invalidUsername)
WebUI.sendKeys(findTestObject('ApplicantLogin/txtLoginPassword'), invalidPwd)
WebUI.click(findTestObject('ApplicantLogin/btnLoginSubmit'))
WebUI.verifyElementVisible(findTestObject('Object Repository/ApplicantLogin/lblErrorInvalidLogin'))
WebUI.closeBrowser()
