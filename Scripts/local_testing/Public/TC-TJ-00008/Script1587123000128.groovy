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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8080/index.jsp')

WebUI.click(findTestObject('Object Repository/a_Contact Us'))

WebUI.click(findTestObject('Object Repository/a_supporttopjobslk'))

WebUI.switchToWindowTitle('Feedback')

WebUI.setText(findTestObject('Object Repository/input__txtYourName'), 'nilmini')

WebUI.doubleClick(findTestObject('Object Repository/input__txtYourEmail'))

WebUI.setText(findTestObject('Object Repository/input__txtYourEmail'), 'nilmini@genesiis.com')

WebUI.doubleClick(findTestObject('Object Repository/input__txtYourPhnNo'))

WebUI.setText(findTestObject('Object Repository/input__txtYourPhnNo'), '0773024555')

WebUI.setText(findTestObject('Object Repository/textarea__message'), 'this is automation')

WebUI.click(findTestObject('Object Repository/input__sub'))

WebUI.click(findTestObject('Object Repository/div_Your message was submitted'))

WebUI.switchToWindowTitle('topjobs - Sri Lanka Job Network - jobs/vacancies, careers and employment')

WebUI.click(findTestObject('Object Repository/a_supporttopjobslk_1'))

WebUI.switchToWindowTitle('Feedback')

WebUI.click(findTestObject('Object Repository/h1_topjobs - Fault Notice'))

WebUI.setText(findTestObject('Object Repository/input__txtYourName'), 'nilmini')

WebUI.setText(findTestObject('Object Repository/input__txtYourEmail'), 'nilmini@genesiis.com')

WebUI.setText(findTestObject('Object Repository/input__txtYourPhnNo'), '0773024555')

WebUI.setText(findTestObject('Object Repository/textarea__message'), 'this is automation')

WebUI.click(findTestObject('Object Repository/input__sub'))

WebUI.click(findTestObject('Object Repository/body_topjobs - Fault NoticeAll fields marke_31fb48'))

WebUI.switchToWindowTitle('topjobs - Sri Lanka Job Network - jobs/vacancies, careers and employment')

WebUI.click(findTestObject('Object Repository/a_feedbacktopjobslk'))

WebUI.switchToWindowTitle('Feedback')

WebUI.setText(findTestObject('Object Repository/input__txtYourName'), 'nilmini')

WebUI.setText(findTestObject('Object Repository/input__txtYourEmail'), 'nilmini@genesiis.com')

WebUI.setText(findTestObject('Object Repository/input__txtYourPhnNo'), '0773024555')

WebUI.setText(findTestObject('Object Repository/textarea__message'), 'this is automation')

WebUI.click(findTestObject('Object Repository/input__sub'))

WebUI.click(findTestObject('Object Repository/div_Your message was submitted'))

WebUI.switchToWindowTitle('topjobs - Sri Lanka Job Network - jobs/vacancies, careers and employment')

WebUI.click(findTestObject('Object Repository/a_adstopjobslk'))

WebUI.switchToWindowTitle('Feedback')

WebUI.click(findTestObject('Object Repository/h1_topjobs - New Advertisement'))

WebUI.setText(findTestObject('Object Repository/input__txtYourName'), 'nilmini')

WebUI.setText(findTestObject('Object Repository/input__txtYourEmail'), 'nilmini@genesiis.com')

WebUI.setText(findTestObject('Object Repository/input__txtYourPhnNo'), '0773024555')

WebUI.setText(findTestObject('Object Repository/textarea__message'), 'this is automation')

WebUI.click(findTestObject('Object Repository/input__sub'))

WebUI.click(findTestObject('Object Repository/body_topjobs - New AdvertisementAll fields _398388'))

WebUI.switchToWindowTitle('topjobs - Sri Lanka Job Network - jobs/vacancies, careers and employment')

WebUI.click(findTestObject('Object Repository/span_X'))

