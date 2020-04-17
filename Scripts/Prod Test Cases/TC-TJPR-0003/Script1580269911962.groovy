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

WebUI.navigateToUrl('http://topjobs.lk/index.jsp')

WebUI.click(findTestObject('Object Repository/a_Post Your Vacancy'))

WebUI.click(findTestObject('Object Repository/a_TopAd Rate Sheet (PDF)'))

WebUI.click(findTestObject('Object Repository/a_Banner Rate Sheet (PDF)'))

WebUI.click(findTestObject('Object Repository/span_'))

WebUI.click(findTestObject('Object Repository/strong_radio interview'))

WebUI.click(findTestObject('Object Repository/span_ (1)'))

WebUI.click(findTestObject('Object Repository/a_by a public sector employer'))

WebUI.click(findTestObject('Object Repository/a_by a leading private sector employer'))

WebUI.click(findTestObject('Object Repository/a_jobposttopjobslk'))

WebUI.click(findTestObject('Object Repository/a_top-ad'))

WebUI.click(findTestObject('Object Repository/a_become a registered employer'))

WebUI.click(findTestObject('Object Repository/a_banner Posting'))

WebUI.click(findTestObject('Object Repository/a_about topjobs'))

WebUI.click(findTestObject('Object Repository/a_Top'))

