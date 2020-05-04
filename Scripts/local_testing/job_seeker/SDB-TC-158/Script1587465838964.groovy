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

String cvsize=WebUI.getText(findTestObject('Object Repository/VacancyAdview/lblDisplayCVSize'))
String cvresult
if(cvsize.contains("Max size: 2.0MB"))
{
	cvresult='pass'
}

else{
	cvresult='fail'
}


WebUI.verifyMatch(cvresult, 'pass', false)


System.out.print(cvsize)

WebUI.uploadFile(findTestObject('Object Repository/VacancyAdview/fulUploadCV'), 'C:\\\\Users\\\\User\\\\Downloads\\\\2010catalog.pdf')
WebUI.delay(1)
WebUI.verifyElementVisible(findTestObject('Object Repository/VacancyAdview/lblCVSizeError'))

WebUI.delay(1)
WebUI.uploadFile(findTestObject('Object Repository/VacancyAdview/fulUploadCV'), 'C:\\\\Users\\\\User\\\\Downloads\\\\1.pdf')
WebUI.delay(1)
WebUI.verifyElementNotVisible(findTestObject('Object Repository/VacancyAdview/lblCVSizeError'))
