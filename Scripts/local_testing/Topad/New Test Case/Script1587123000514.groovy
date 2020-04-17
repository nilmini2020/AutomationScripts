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

WebUI.navigateToUrl('http://13.232.129.39/employer/agentlogin.jsp')

WebUI.setText(findTestObject('Page_topjobs - OrganisationLogin/input_User Name_txtUserName (2)'), 'kalpani')

WebUI.setEncryptedText(findTestObject('Page_topjobs - OrganisationLogin/input_Password_txtPassword (4)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_topjobs - OrganisationLogin/input_Password_cmdLogin (4)'))

WebUI.click(findTestObject('Page_topjobs - Organisation Main Menu/a_Add new Vacancy (2)'))

WebUI.switchToWindowTitle('Vacancy Form')

WebUI.click(findTestObject('Object Repository/input_From_txtStartDate'))

WebUI.click(findTestObject('Object Repository/td_From'))

WebUI.setText(findTestObject('Page_Vacancy Form/input_From_txtStartDate'), '18/02/2020')

WebUI.click(findTestObject('Page_Vacancy Form/input_To_txtCloseDate (1)'))

WebUI.setText(findTestObject('Page_Vacancy Form/input_To_txtCloseDate'), '28/02/2020')

WebUI.click(findTestObject('Page_Vacancy Form/img_To_calenImg (1)'))

WebUI.switchToWindowTitle('Select Date, Please.')

WebUI.click(findTestObject('Object Repository/font_22'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://13.232.129.39/employer/agentlogin.jsp')

WebUI.setText(findTestObject('Page_topjobs - OrganisationLogin/input_User Name_txtUserName (2)'), 'kalpani')

WebUI.setEncryptedText(findTestObject('Page_topjobs - OrganisationLogin/input_Password_txtPassword (4)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_topjobs - OrganisationLogin/input_Password_cmdLogin (4)'))

WebUI.click(findTestObject('Page_topjobs - Organisation Main Menu/a_Add new Vacancy (2)'))

WebUI.switchToWindowTitle('Vacancy Form')

WebUI.click(findTestObject('Object Repository/input_From_txtStartDate (2)'))

WebUI.click(findTestObject('Object Repository/td_From (2)'))

WebUI.setText(findTestObject('Page_Vacancy Form/input_From_txtStartDate'), '18/02/2020')

WebUI.click(findTestObject('Page_Vacancy Form/input_To_txtCloseDate (1)'))

WebUI.setText(findTestObject('Page_Vacancy Form/input_To_txtCloseDate'), '28/02/2020')

WebUI.click(findTestObject('Page_Vacancy Form/img_To_calenImg (1)'))

WebUI.switchToWindowTitle('Select Date, Please.')

WebUI.click(findTestObject('Object Repository/font_22 (2)'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://13.232.129.39/employer/agentlogin.jsp')

WebUI.setText(findTestObject('Page_topjobs - OrganisationLogin/input_User Name_txtUserName (4)'), 'kalpani')

WebUI.setEncryptedText(findTestObject('Page_topjobs - OrganisationLogin/input_Password_txtPassword (6)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_topjobs - OrganisationLogin/input_Password_cmdLogin (6)'))

WebUI.click(findTestObject('Page_topjobs - Organisation Main Menu/a_Add new Vacancy (4)'))

WebUI.switchToWindowTitle('Vacancy Form')

WebUI.setText(findTestObject('Page_Vacancy Form/input_NoofPositions_txtJobPosition (3)'), 'accounts assistant')

WebUI.setText(findTestObject('Page_Vacancy Form/input__txtCompany (2)'), 'dialo')

WebUI.click(findTestObject('Page_Vacancy Form/div_Dialog (1)'))

WebUI.selectOptionByValue(findTestObject('Page_Vacancy Form/select_Select Industry                     _9a5252 (2)'), 'BANDEFZZZ', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Vacancy Form/select_Select thetype AccountingAuditingFin_ffc252 (2)'), 'APCDEFZZZ', 
    true)

WebUI.click(findTestObject('Page_Vacancy Form/img_To_calenImg (3)'))

WebUI.switchToWindowTitle('Select Date, Please.')

WebUI.click(findTestObject('Object Repository/td_1'))

WebUI.click(findTestObject('Object Repository/td_20'))

WebUI.click(findTestObject('Object Repository/font_20'))

WebUI.switchToWindowTitle('Vacancy Form')

WebUI.click(findTestObject('Page_Vacancy Form/a__ui-button ui-widget ui-state-default ui-_2aa8c2 (1)'))

WebUI.click(findTestObject('Page_Vacancy Form/li_Achchamulai (1)'))

WebUI.setText(findTestObject('Page_Vacancy Form/input_Contact Person Email_txtContactEmail (2)'), 'nilmini@genesiis.com')

WebUI.setText(findTestObject('Page_Vacancy Form/input__txtApplicationEmail (2)'), 'nilmini@genesiis.com')

WebUI.click(findTestObject('Page_Vacancy Form/input_YesNo_btnSubmit (2)'))

WebUI.click(findTestObject('Page_Vacancy Form/input_YesNo_btnSubmit (2)'))

WebUI.click(findTestObject('Page_Vacancy Form/a_AdvertisementTemplate NoneGrey TemplateGe_a29412 (1)'))

WebUI.setText(findTestObject('Page_Vacancy Form/body_Project accountants work closely with _88258d'), '<div id="katalon" style="top: 0px;">​<span style="font-family:helvetica neue,helvetica,arial,sans-serif; font-size:14px">Project accountants work closely with project managers to devise the budget, facilitate the billing process and perform cost assessments for a particular project or portfolio. They usually take part in the executive decision-making process, often providing financial analyses on which management may base decisions about product development and other matters.</span><div id="katalon-rec_elementInfoDiv" style="display: block;">/html[1]</div></div>')

WebUI.click(findTestObject('Page_Vacancy Form/html_Rich Text Editor editor1htmlcursortext_cb8dbf'))

WebUI.setText(findTestObject('Page_Vacancy Form/body_Project accountants work closely with _88258d_1'), '<div id="katalon" style="top: 0px;"><span style="font-family:helvetica neue,helvetica,arial,sans-serif; font-size:14px">Project accountants work closely with project managers to devise the budget, facilitate the billing process and perform cost assessments for a particular project or portfolio. They usually take part in the executive decision-making process, often providing financial analyses on which management may base decisions about product development and other matters.</span><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.click(findTestObject('Object Repository/a_AdvertisementTemplate NoneGrey TemplateGe_a29412_1'))

WebUI.click(findTestObject('Object Repository/input_div_UpdateContent'))

