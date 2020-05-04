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

WebUI.navigateToUrl('http://123.231.114.194:8285/admin/superadminlogin.jsp')

WebUI.setText(findTestObject('Page_topjobs - Owner Login/input_User Name_txtUserName'), 'SuperAdmin')

WebUI.setEncryptedText(findTestObject('Page_topjobs - Owner Login/input_Password_txtPassword'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_topjobs - Owner Login/input_Password_cmdLogin'))

WebUI.click(findTestObject('Page_topjobs - Organisation Main Menu/span_MASTER DATA'))

WebUI.click(findTestObject('Page_Master Data Maintenance/a_Scheme'))

WebUI.click(findTestObject('Object Repository/Page_Master Data Maintenance/input_Maths_New'))

WebUI.switchToWindowTitle('Scheme')

WebUI.setText(findTestObject('Page_Scheme/input_Scheme Code_insertcode'), '7')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Scheme/select_Select School Education GCE AL GCE OL'), 
    'AL', true)

WebUI.setText(findTestObject('Page_Scheme/input_Description_description'), 'IT Technology ')

WebUI.click(findTestObject('Page_Scheme/input_SuperAdmin_save'))

