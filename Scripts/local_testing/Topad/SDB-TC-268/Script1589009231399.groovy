/*
 * Copyright genesiis.com
 * This is test case for Verify the add new vacacny
 * Modification History:
 * Date         Version     Modified By     Description
 * 2020-02-10   1.0         Nilmini Ariyawansa            Initial creation
 */

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

WebUI.navigateToUrl('http://localhost:8080/advertisement/admin')

WebUI.navigateToUrl('http://localhost:8080/employer/agentlogin.jsp')

WebUI.delay(3)

//WebUI.click(findTestObject('Page_topjobs - OrganisationLogin/input_User Name_txtUserName'))
//WebUI.delay(3)
WebUI.setText(findTestObject('UserName_txtUserName'), 'kalpani')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Password_txtPassword'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/input_Password_cmdLogin'))

WebUI.click(findTestObject('Object Repository/a_Add new Vacancy'))

WebUI.switchToWindowTitle('Vacancy Form')

WebUI.setText(findTestObject('Object Repository/input_NoofPositions_txtJobPosition'), 'Accounts Assistant')

WebUI.setText(findTestObject('Object Repository/input__txtCompany'), 'Sampath Bank')

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Select Industry                     _9a5252'), 'BANDEFZZZ', 
    true)

WebUI.setText(findTestObject('Object Repository/textarea_viewsample_txtJobDescription'), 'Accounting assistants work closely with one or multiple accountants. Their responsibilities depend on the needs of their employer, but duties typically include maintaining ledgers, assisting customers, preparing and distributing checks, handling cash and invoices, making phone calls, and basic bookkeeping')

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Select thetype AccountingAuditingFin_ffc252'), 'ACADEFZZZ', 
    true)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/input__custom-combobox-input ui-widget ui-w_2bd589'), 'Sri Lanka')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/input__custom-combobox-input ui-widget ui-w_2bd589_1'), 'Akurana')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/input_From_txtStartDate'), '10/03/2020')

//WebUI.click(findTestObject('Object Repository/font_18'))
WebUI.delay(3)

//WebUI.switchToWindowTitle('Vacancy Form')
WebUI.setText(findTestObject('Object Repository/input_To_txtCloseDate'), '28/03/2020')

//WebUI.click(findTestObject('Object Repository/img_To_calenImg'))
WebUI.delay(3)

//WebUI.switchToWindowTitle('Select Date, Please.')
//WebUI.click(findTestObject('Object Repository/img'))
//WebUI.delay(3)
//WebUI.click(findTestObject('Object Repository/img_1'))
//WebUI.delay(3)
//WebUI.click(findTestObject('Object Repository/font_12'))
//WebUI.delay(3)
//WebUI.switchToWindowTitle('Vacancy Form')
//WebUI.rightClick(findTestObject('Object Repository/input_To_txtCloseDate'))
WebUI.setText(findTestObject('Object Repository/input_Contact Person Email_txtContactEmail'), 'nilmini@genesiis.com')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/input__txtApplicationEmail'), 'nilmini@genesiis.com')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/input_NoofPositions_txtNoOfPositions'), '10')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/input_YesNo_btnSubmit'))

WebUI.comment('Then inserted successfully')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/input_div_UpdateContent'))

WebUI.comment('Then updated successfully')

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Jobrefno'), 1, FailureHandling.OPTIONAL)) {
    WebUI.comment('Then updated successfully')

    println('Object Repository/Jobrefno') //WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/Jobrefno'),
    //	‘value’), “xxxx”, false)
}

WebUI.delay(3)

