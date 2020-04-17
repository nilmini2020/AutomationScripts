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
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.testobject.TestObjectProperty


WebUI.openBrowser('')

WebUI.navigateToUrl('http://13.232.129.39/brandix/admin')

WebUI.delay(3)

WebUI.navigateToUrl('http://13.232.129.39/employer/agentlogin.jsp')
WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/input_User Name_txtUserName (5)'), 'gencso')
WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Object Repository/input_Password_txtPassword (7)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/input_Password_cmdLogin (7)'))
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/a_Add new Vacancy (5)'))
WebUI.delay(3)

WebUI.switchToWindowTitle('Vacancy Form')

WebUI.setText(findTestObject('Object Repository/input_NoofPositions_txtJobPosition (4)'), 'Accountant')

WebUI.setText(findTestObject('Object Repository/textarea_viewsample_txtJobDescription (1)'), 'Account Test')

WebUI.click(findTestObject('Object Repository/tr_Job Summary  (shown in list) viewsample'))
WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/textarea_viewsample_txtJobDescription (1)'), 'Provides financial information to management by researching and analyzing accounting data; preparing reports.')

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Select thetype AccountingAuditingFin_ffc252 (3)'), 'ACA0000000041', 
    true)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/tr_Where will the job seeker work  Sri Lank_790abd'))
WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/input_Where will the job seeker work_custom_7a5a15'), 'Sri Lanka')

WebUI.setText(findTestObject('Object Repository/input_Where will the job seeker work_custom_7a5a15_1'), 'Colombo')
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/img (10)'))
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/input_From_txtStartDate (3)'))
WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/input_From_txtStartDate (3)'), '18/02/2020')

WebUI.click(findTestObject('Object Repository/td_From (3)'))
WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/input_From_txtStartDate (3)'), '18/02/2020')

WebUI.setText(findTestObject('Object Repository/input_To_txtCloseDate (2)'), '18/02/2020')

WebUI.click(findTestObject('Object Repository/input_To_txtCloseDate (2)'))
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/input_To_txtCloseDate (2)'))
WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/input_To_txtCloseDate (2)'), '20/02/2020')

WebUI.click(findTestObject('Object Repository/input_I want to receive applications_rdApplyType'))
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/input_SMSfacebooktwitterClassifieds_deliveryMethod'))
WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/input_Contact Person Email_txtContactEmail (3)'), 'nilmini@genesiis.com')

WebUI.setText(findTestObject('Object Repository/input__txtApplicationEmail (3)'), 'nilmini@genesiis.com')

WebUI.click(findTestObject('Object Repository/td_Fill allrequired information and save Th_a5886a'))
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/input_YesNo_btnSubmit (3)'))
WebUI.delay(3)

//String refno

//refno= WebUI.click(findTestObject('Object Repository/strong_0000733943'))

TestObject to = ObjectRepository.findTestObject("Object Repository/strong_0000733943")
List<TestObjectProperty> props = to.getProperties()
for(prop in props) {	
	if(prop.getValue()	 == '$0') {	
		//prop.getValue()	
		println prop.getValue()	
		}
	}
//WebUI.getAttribute('Object Repository/strong_0000733943', 'xpath')
//if(WebUI.verifyElementPresent(findTestObject('Object Repository/strong_0000733943'), FailureHandling.OPTIONAL)){

//println refno.valueOf(refno)
//}
//WebUI.verifyElementAttributeValue(findTestObject('Object Repository/strong_0000733943'), 'xpath', '("frmJobSpec")/table[1]/tbody[1]/tr[2]/td[2]/strong[1])')
//WebUI.getAttribute('Object Repository/strong_0000733943', null)
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/td_Required information      Inserted Successfully (1)'))
WebUI.delay(3)

//WebUI.click(findTestObject('Object Repository/html_Rich Text Editor editor1htmlcursortextcursorautoimginputtextareacursordefaultcke_editablecursortextcke_editable imgcke_editable inputcke_editable textareacursordefaultimgcke_flashbackground-image url(http1323212939j'))

//WebUI.click(findTestObject('Object Repository/html_Rich Text Editor editor1htmlcursortextcursorautoimginputtextareacursordefaultcke_editablecursortextcke_editable imgcke_editable inputcke_editable textareacursordefaultimgcke_flashbackground-image url(http1323212939j'))

//WebUI.click(findTestObject('Object Repository/li_Complies with federal state and local fi_6696a7'))

//WebUI.setText(findTestObject('Page_Vacancy Form/body_Accountant General Job DutiesPrepares _3b00d0'), '<div id="katalon" style="top: -48px;"><h2>Accountant General Job Duties:</h2><ul style=""><li style="">Prepares asset, liability, and capital account entries by compiling and analyzing account information.</li><li style="">Documents financial transactions by entering account information.</li><li style="">Recommends financial actions by analyzing accounting options.</li><li style="">Summarizes current financial status by collecting information; preparing balance sheet, profit and loss statement, and other reports.</li><li style="">Substantiates financial transactions by auditing documents.</li><li style="">Maintains accounting controls by preparing and recommending policies and procedures.</li><li style="">Guides accounting clerical staff by coordinating activities and answering questions.</li><li style="">Reconciles financial discrepancies by collecting and analyzing account information.</li><li style="">Secures financial information by completing data base backups.</li><li style="">Maintains financial security by following internal controls.</li><li style="">Prepares payments by verifying documentation, and requesting disbursements.</li><li style="">Answers accounting procedure questions by researching and interpreting accounting policy and regulations.</li><li style="">Complies with federal, state, and local financial legal requirements by studying existing and new legislation, enforcing adherence to requirements, and advising management on needed actions.</li><li style="">Prepares special financial reports by collecting, analyzing, and summarizing account information and trends.</li><li>Maintains customer confidence and protects operations by keeping financial information confidential.</li><li>Maintains professional and technical knowledge by attending educational workshops; reviewing professional publications; establishing personal networks; participating in professional societies.</li><li>Accomplishes the result by performing the duty.</li><li>Contributes to team effort by accomplishing related results as needed.</li></ul><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.click(findTestObject('Object Repository/input_li_UpdateContent'))

WebUI.click(findTestObject('Object Repository/td_Required information  Updated Successfully'))

WebUI.closeBrowser()

