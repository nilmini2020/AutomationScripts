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

WebUI.navigateToUrl('http://topjobs.lk/')

WebUI.click(findTestObject('Page_topjobs - Sri Lanka Job Network - jobs_668f6f/a_IT-SwareDBQAWebGraphicsGIS (5)'))

WebUI.click(findTestObject('Object Repository/a_Junior Fullstack Developers (Javascript R_acecf5'))

WebUI.switchToWindowTitle('ADVIEW')

WebUI.click(findTestObject('Page_ADVIEW/button_Send to a Friend (1)'))

WebUI.setText(findTestObject('Page_ADVIEW/input__txtFrndEmail (1)'), 'nilmini@genesiis.com')

WebUI.setText(findTestObject('Page_ADVIEW/input__txtSndToFrndYourEmail (1)'), 'nilmini@genesiis.com')

WebUI.setText(findTestObject('Page_ADVIEW/textarea_Comment_txtComment (1)'), 'jobs for you')

WebUI.click(findTestObject('Page_ADVIEW/input_Comment_submit (1)'))

WebUI.click(findTestObject('Page_ADVIEW/div_Email has been sent successfully (1)'))

WebUI.click(findTestObject('Page_ADVIEW/div_Email has been sent successfully (1)'))

WebUI.click(findTestObject('Object Repository/div_Tutopiya                        Colombo_68ddf2'))

WebUI.closeBrowser()

