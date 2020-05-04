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

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('http://localhost:8080/index.jsp')
WebUI.delay(2)
WebUI.click(findTestObject('HomePage/lnkAllVacancies'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyGridView/lnkViewAsList'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyListView/lnkPostTest2email'))
WebUI.delay(2)
WebUI.switchToWindowTitle('ADVIEW')
WebUI.delay(2)
WebUI.click(findTestObject('VacancyAdview/btnApplyViaEmail'))

WebUI.delay(1)
WebUI.verifyElementNotChecked(findTestObject('Object Repository/VacancyAdview/chkReceiveCopy'), 1)



String lblText=WebUI.getText(findTestObject('Object Repository/VacancyAdview/lblReceiveCopyText'))
String lblResult
if(lblText.contains("I want to receive a copy of the application"))
{
	lblResult='pass'
}

else{
	lblResult='fail'
}

WebUI.verifyMatch(lblResult, 'pass', false)