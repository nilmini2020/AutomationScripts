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

WebUI.navigateToUrl('https://cimamyjobs-web.madgexjbtest.com/')

WebUI.click(findTestObject('Object Repository/input_Keywords_Keywords'))

WebUI.setText(findTestObject('Object Repository/input_Location_radialtown'), 'sri la')

WebUI.click(findTestObject('Object Repository/strong_Sri La'))

WebUI.click(findTestObject('Object Repository/input_Within_width-full'))

WebUI.click(findTestObject('Object Repository/a_View details'))

WebUI.click(findTestObject('Object Repository/a_Apply'))

WebUI.click(findTestObject('Object Repository/a_No thanks and continue to apply'))

WebUI.switchToWindowTitle('ADVIEW')

WebUI.click(findTestObject('Object Repository/a_Apply now'))

WebUI.switchToWindowTitle('Finance Manager job with Brandix Lanka Ltd | 298020')

WebUI.click(findTestObject('Object Repository/a_Home (2)'))

WebUI.click(findTestObject('Object Repository/a_Sector (1)'))

WebUI.click(findTestObject('Object Repository/a_Manufacturing (1)'))

WebUI.click(findTestObject('Object Repository/a_Asia (1)'))

WebUI.click(findTestObject('Object Repository/a_Sri Lanka'))

WebUI.click(findTestObject('Object Repository/a_Accountant'))

WebUI.click(findTestObject('Object Repository/i_Accountant_icon-after'))

WebUI.click(findTestObject('Object Repository/a_Accounts Assistant'))

WebUI.click(findTestObject('Object Repository/i_Accounts Assistant_icon-after'))

WebUI.click(findTestObject('Object Repository/a_Finance Manager'))

WebUI.click(findTestObject('Object Repository/a_Remove selection'))

WebUI.click(findTestObject('Object Repository/a_Credit Control'))

WebUI.click(findTestObject('Object Repository/i_Credit Control_icon-after'))

WebUI.click(findTestObject('Object Repository/a_Business Analyst'))

WebUI.click(findTestObject('Object Repository/a_Remove selection (1)'))

WebUI.click(findTestObject('Object Repository/a_More'))

WebUI.click(findTestObject('Object Repository/a_Home (3)'))

WebUI.click(findTestObject('Object Repository/a_Sector (1)'))

WebUI.click(findTestObject('Object Repository/a_Location (1)'))

WebUI.click(findTestObject('Object Repository/a_Asia'))

WebUI.click(findTestObject('Object Repository/a_Sri Lanka (1)'))

WebUI.closeBrowser()

