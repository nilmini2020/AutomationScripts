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

WebUI.click(findTestObject('Page_topjobs - Sri Lanka Job Network - jobs_668f6f/a_IT-SwareDBQAWebGraphicsGIS (3)'))

WebUI.click(findTestObject('Page_wwwtopjobslkJobs Careers Recruitment M_437e04/a_View As List (2)'))

WebUI.click(findTestObject('Object Repository/a_ASSOCIATE BUSINESS ANALYSTS - COLOMBO  (3)'))

WebUI.switchToWindowTitle('ADVIEW')

WebUI.click(findTestObject('Object Repository/a_Go To Classic View'))

WebUI.click(findTestObject('Object Repository/a_Change View_fa fa-linkedinOld'))

WebUI.click(findTestObject('Object Repository/a_Change View_fa fa-facebookOld'))

WebUI.click(findTestObject('Object Repository/a_Change View_fa fa-twitterOld'))

WebUI.click(findTestObject('Page_Vacancy Advertisement/img (8)'))

WebUI.click(findTestObject('Object Repository/td'))

WebUI.click(findTestObject('Object Repository/img_1'))

WebUI.closeBrowser()

