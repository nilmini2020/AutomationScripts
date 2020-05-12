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


String getvacancyname
String displayvacancyname
String vacancynameresult
String username='dilshan991'
String password='#compaq123'

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('http://localhost:8080/index.jsp')


WebUI.click(findTestObject('HomePage/lnkAllVacancies'))
WebUI.delay(2)

WebUI.click(findTestObject('VacancyGridView/lnkViewAsList'))
WebUI.delay(2)
WebUI.click(findTestObject('VacancyListView/lnkPostTest2email'))
WebUI.delay(1)
WebUI.switchToWindowTitle('ADVIEW')
WebUI.delay(1)
getvacancyname=WebUI.getText(findTestObject('Object Repository/VacancyAdview/lblVacancyName'))


WebUI.click(findTestObject('Object Repository/VacancyAdview/btnApplynow'))
WebUI.delay(2)
WebUI.switchToWindowTitle('Applicant Login')

String urltext=WebUI.getUrl()
WebUI.verifyMatch(urltext, 'http://localhost:8080/applicant/login.jsp', false)

WebUI.sendKeys(findTestObject('ApplicantLogin/txtUserName'), username)
WebUI.sendKeys(findTestObject('ApplicantLogin/txtLoginPassword'), password)
WebUI.click(findTestObject('ApplicantLogin/btnLoginSubmit'))
WebUI.delay(2)

WebUI.switchToWindowTitle('Application Status')
urltext=WebUI.getUrl()

String urlresult

if(urltext.contains("http://localhost:8080/employer/jobsapplied.jsp"))
{
	
}

else{
	
	
//This part execute only for new user	
	displayvacancyname=WebUI.getText(findTestObject('Object Repository/ApplicantWorkSpace/lblVacancyDesignation'))
	if(displayvacancyname.contains(getvacancyname))
	{
		vacancynameresult='pass'
	}
	
	else{
		vacancynameresult='fail'
	}
	
	WebUI.verifyMatch(vacancynameresult, 'pass', false)
	
	
	WebUI.click(findTestObject('Object Repository/ApplicantWorkSpace/btnContinue'))
	WebUI.delay(15)
	WebUI.click(findTestObject('Object Repository/ApplicantDetailsConfirmPage/btnApplyNow'))
	WebUI.delay(15)
	
	
			
}


String Confrimsg

WebUI.verifyElementVisible(findTestObject('Object Repository/ApplicationStatusPage/lblApplicationStatusDisplay'))
Confrimsg=WebUI.getText(findTestObject('Object Repository/ApplicationStatusPage/lblApplicationStatusDisplay'))


if(Confrimsg.contains("Your profile has been forwarded to the selected vacancy"))
{
	urlresult='pass'
}

else{
	urlresult='fail'
}


WebUI.verifyMatch(urlresult, 'pass', false)





