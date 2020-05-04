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

WebUI.click(findTestObject('Page_topjobs - Organisation Main Menu/span_MANAGE BANNERS'))

WebUI.click(findTestObject('Page_Add New Banner/a_New Banner Ad'))

WebUI.switchToWindowTitle('Banner Advertisement')

WebUI.click(findTestObject('Object Repository/Page_Banner Advertisement/td_Featured                                _99d8cb'))

WebUI.click(findTestObject('Object Repository/Page_Banner Advertisement/input_FeaturedExternal_agentType'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Banner Advertisement/select_ACCA Sri Lanka                      _41628a'), 
    'EXT0000000011', true)

WebUI.selectOptionByValue(findTestObject('Page_Banner Advertisement/select_Top-Right                           _09698b'), 
    'topright', true)

WebUI.selectOptionByValue(findTestObject('Page_Banner Advertisement/select_Select                              _507bd1'), 
    'ACA', true)

WebUI.setText(findTestObject('Page_Banner Advertisement/input_seconds_duration'), '20')

WebUI.click(findTestObject('Page_Banner Advertisement/input_YesNo_enableBanner'))

WebUI.setText(findTestObject('Object Repository/Page_Banner Advertisement/input_(ddmmyyyy)_startDate'), '22/04/2020')

WebUI.setText(findTestObject('Object Repository/Page_Banner Advertisement/input_(ddmmyyyy)_endDate'), '24/04/2020')

WebUI.setText(findTestObject('Page_Banner Advertisement/input_WebAttachment_bannerURL'), 'www.topjobs.lk')

WebUI.selectOptionByValue(findTestObject('Page_Banner Advertisement/select_New Window                          _694aea'), 
    'SAME', true)

WebUI.click(findTestObject('Page_Banner Advertisement/input_(Use only GIF JPG JPEG or PNG)_btnSave'))

WebUI.click(findTestObject('Page_Banner Advertisement/input_WebAttachment_bannerURL'))

WebUI.click(findTestObject('Page_Banner Advertisement/input_(Use only GIF JPG JPEG or PNG)_btnSave'))

