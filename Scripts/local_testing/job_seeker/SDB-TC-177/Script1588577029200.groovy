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

String username='dilshan993'
String password='#compaq123'

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('http://localhost:8080/index.jsp')
WebUI.delay(2)
WebUI.click(findTestObject('HomePage/lnkJobseekerLogin'))
WebUI.delay(2)
WebUI.switchToWindowTitle('Applicant Login')


String urltext=WebUI.getUrl()
String urlresult

if(urltext.contains("http://localhost:8080/applicant/login.jsp"))
{
	urlresult='pass'
}

else{
	urlresult='fail'
}

WebUI.verifyMatch(urlresult, 'pass', false)
WebUI.sendKeys(findTestObject('ApplicantLogin/txtUserName'), username)
WebUI.sendKeys(findTestObject('ApplicantLogin/txtLoginPassword'), password)
WebUI.click(findTestObject('ApplicantLogin/btnLoginSubmit'))
WebUI.delay(2)
WebUI.switchToWindowTitle('Welcome to topjobs')
WebUI.click(findTestObject('Object Repository/WelcomePage/lnkHome'))
WebUI.delay(2)
WebUI.switchToWindowTitle('topjobs - Sri Lanka Job Network - jobs/vacancies, careers and employment')
WebUI.click(findTestObject('Object Repository/HomePage/lnkMyProfile'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/ApplicantProfile/lnkEditCommonProfile'))
WebUI.delay(4)


WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/lnkDownloadProfile'))
WebUI.delay(2)


String lname='herath'
String checkresult


String downloadPath='C:\\\\Users\\\\User\\\\Downloads'

File dir = new File(downloadPath);

File[] dirContents = dir.listFiles();

if (dirContents.length > 0) {
	
	for (int i = 0; i < dirContents.length; i++) {
	
		System.out.print(dirContents[i].getName())
		if(dirContents[i].getName().contains(lname)){
			checkresult='Passed'
			break
		}
		
		else{
			dirContents[i].delete()
			checkresult='Failed'
		}
			
	}
}

else{
	checkresult='Failed'
}



WebUI.verifyMatch(checkresult, 'Passed', false)
