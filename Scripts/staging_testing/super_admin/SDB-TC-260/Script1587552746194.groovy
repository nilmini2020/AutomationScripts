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

WebUI.click(findTestObject('Page_topjobs - Owner Login/input_User Name_txtUserName'))

WebUI.setText(findTestObject('Page_topjobs - Owner Login/input_User Name_txtUserName'), 'SuperAdmin')

WebUI.setEncryptedText(findTestObject('Page_topjobs - Owner Login/input_Password_txtPassword'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_topjobs - Owner Login/input_Password_cmdLogin'))

WebUI.click(findTestObject('Object Repository/Page_topjobs - Organisation Main Menu/span_COMPANY'))

WebUI.click(findTestObject('Object Repository/Page_Organisation Search/a_Add New Organisation'))

WebUI.switchToWindowTitle('topjobs - Organisation Registration')

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input__txtDescription'), 'Mas Holding')

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input__txtShortName'), 'MAS')

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input_Company Group_txtCompanyGroup'), 
    'MAS Manu')

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input_Registration No_txtRegistrationNo'), 
    '2345')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_topjobs - Organisation Registration/select_Select Industry                     _8cedba'), 
    'INF', true)

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input_Year of Incorporation_txtYearOfInc'), 
    '2010')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_topjobs - Organisation Registration/select_Other                               _42bbfb'), 
    'Public', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_topjobs - Organisation Registration/select_Select Size                         _9a2410'), 
    '1 - 20', true)

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/textarea__txtCoreBusiness'), 'IT')

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input__txtAddress1'), 'add 1')

WebUI.click(findTestObject('Object Repository/Page_topjobs - Organisation Registration/td'))

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input_Address 2_txtAddress2'), 
    'add 2')

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input__txtAddress3'), 'add 3')

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input_Zip  Postal Code_txtZipCode'), 
    '20000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_topjobs - Organisation Registration/select_Select State                        _5194b6'), 
    'kan', true)

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input__txtPhone'), '077302888')

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input_Fax_txtFax'), '077344444')

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input__txtEmail'), 'nilmini@genesiis.com')

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input__txtContactPerson_1'), 'Manj')

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input__txtDesignation_1'), 'sse')

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input__txtContactPhone_1'), '0773024554')

WebUI.click(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input__txtContactPhone_1'))

WebUI.doubleClick(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input__txtContactPhone_1'))

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input__txtContactPhone_1'), '0773024554')

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input_Mobile_txtContactMobile_1'), 
    '0773024554')

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input_Fax_txtContactFax_1'), '0773024554')

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input__txtContactEmail_1'), 'nilmini@genesiis.com')

WebUI.click(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input_Web Site_txtWebSite'))

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input_httpwwwtopjobslk_txtUrl'), 
    'www.topjobs.lk')

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input__txtUserCount'), '23')

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input__txtUserName'), 'test123')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input__txtPassword'), 
    '5xx1bkCcAlw=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input__txtRePassword'), 
    '5xx1bkCcAlw=')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_topjobs - Organisation Registration/select_Select Secret                       _f59865'), 
    'FRIEND', true)

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input__txtSecretAnswer'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input_Enter                                _34f032'), 
    'cytiv')

WebUI.click(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input_Enter                                _a5d810'))

WebUI.click(findTestObject('Object Repository/Page_topjobs - Organisation Registration/input_Enter                                _34f032'))

