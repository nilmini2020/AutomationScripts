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

WebUI.navigateToUrl('http://123.231.114.194:8285/index.jsp')

WebUI.click(findTestObject('img (2)', [('img_rss_hdrbar') : true]))

WebUI.doubleClick(findTestObject('Object Repository/span_RSS'))

WebUI.click(findTestObject('Object Repository/a_Feed Reader'))

WebUI.click(findTestObject('Object Repository/a_Active Web Reader'))

WebUI.click(findTestObject('Object Repository/a_Google Reader'))

WebUI.click(findTestObject('Object Repository/a_wwwrss-specificationscomrss-directoryhtm'))

WebUI.click(findTestObject('Object Repository/a_http100100100199rssit_sware_db_qa_web_gra_a11063'))

WebUI.closeBrowser()

