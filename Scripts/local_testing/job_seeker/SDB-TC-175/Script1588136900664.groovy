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

String username='dilshan1744'
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



String lname='Herath'
String oname='dilshan'
String initial='H.M'
String Add1='Rajagiriya'
String telphone='0112970900'
String salary='50000'
String birthyear='1991'
WebUI.selectOptionByIndex(findTestObject('Object Repository/ApplicantCommonProfile/ddlSelectTitle'),2)
WebUI.sendKeys(findTestObject('Object Repository/ApplicantCommonProfile/txtLastName'),lname)
WebUI.sendKeys(findTestObject('Object Repository/ApplicantCommonProfile/txtOtherName'),oname)
WebUI.sendKeys(findTestObject('Object Repository/ApplicantCommonProfile/txtInitials') ,initial)
WebUI.check(findTestObject('Object Repository/ApplicantCommonProfile/rdbSelectGenderM'))
WebUI.selectOptionByIndex(findTestObject('Object Repository/ApplicantCommonProfile/ddlSelectBirthDate'),2)
WebUI.selectOptionByIndex(findTestObject('Object Repository/ApplicantCommonProfile/ddlSelectBirthMonth'),2)
WebUI.sendKeys(findTestObject('Object Repository/ApplicantCommonProfile/txtSelectBirthYear'),birthyear)
WebUI.scrollToElement(findTestObject('Object Repository/ApplicantCommonProfile/txtAddress1'),3)
WebUI.sendKeys(findTestObject('Object Repository/ApplicantCommonProfile/txtAddress1'),Add1)
WebUI.selectOptionByValue(findTestObject('Object Repository/ApplicantCommonProfile/ddlSelectCountry'),'LK',false)
WebUI.selectOptionByIndex(findTestObject('Object Repository/ApplicantCommonProfile/ddlSelectDistrict'),2)
WebUI.selectOptionByIndex(findTestObject('Object Repository/ApplicantCommonProfile/ddlSelectDivision'),2)
WebUI.sendKeys(findTestObject('Object Repository/ApplicantCommonProfile/txtPhoneNo'),telphone)
WebUI.sendKeys(findTestObject('Object Repository/ApplicantCommonProfile/txtExpectedSalary'),salary)
WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/btnNextPersonalDetails'))
WebUI.delay(2)


String organization='genesiis'
String designation='QA Engineer'
WebUI.selectOptionByIndex(findTestObject('Object Repository/ApplicantCommonProfile/ddlSelectIndustry'),2)
WebUI.sendKeys(findTestObject('Object Repository/ApplicantCommonProfile/txtOrganisation'),organization)
WebUI.sendKeys(findTestObject('Object Repository/ApplicantCommonProfile/txtDesignation'),designation)
WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/btnAddToListProfessionlExperience'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/btnNextProfessionalExperience'))
WebUI.delay(2)



String HighEduDesc="test higher EDU Description"
WebUI.selectOptionByIndex(findTestObject('Object Repository/ApplicantCommonProfile/ddlSelectAward'),2)
WebUI.selectOptionByIndex(findTestObject('Object Repository/ApplicantCommonProfile/ddlSelectTitle'),2)
WebUI.selectOptionByIndex(findTestObject('Object Repository/ApplicantCommonProfile/ddlAreaStudy'),2)
WebUI.sendKeys(findTestObject('Object Repository/ApplicantCommonProfile/txtQualiDescription'),HighEduDesc)
WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/btnAddQualification'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/btnNextHigherEducation'))
WebUI.delay(2)






WebUI.selectOptionByIndex(findTestObject('Object Repository/ApplicantCommonProfile/ddlSchoolEducation'),2)
WebUI.selectOptionByIndex(findTestObject('Object Repository/ApplicantCommonProfile/ddlSelectSubject'),2)
WebUI.selectOptionByIndex(findTestObject('Object Repository/ApplicantCommonProfile/ddlSelectGrade'),2)
WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/lnkAddSubject'))
WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/btnAddToListSchoolEducation'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/btnNextSchoolEducation'))
WebUI.delay(2)







WebUI.selectOptionByIndex(findTestObject('Object Repository/ApplicantCommonProfile/ddlSelectMembership'),2)
WebUI.scrollToElement(findTestObject('Object Repository/ApplicantCommonProfile/ddlSelectCountry'))
WebUI.selectOptionByValue(findTestObject('Object Repository/ApplicantCommonProfile/ddlMemberCountry'),'LK',false)
WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/btnMemberAdd'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/btnNextMembership'))
WebUI.delay(2)



WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/btnNextLanguage'))
WebUI.delay(2)







String researchdesc='text for research desc'
WebUI.selectOptionByIndex(findTestObject('Object Repository/ApplicantCommonProfile/ddlResearchArea'),2)
WebUI.sendKeys(findTestObject('Object Repository/ApplicantCommonProfile/txtResearchDescription'),researchdesc)
WebUI.scrollToElement(findTestObject('Object Repository/ApplicantCommonProfile/btnAddToListResearch'))
WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/btnAddToListResearch'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/btnNextResearch'))
WebUI.delay(2)





WebUI.scrollToElement(findTestObject('Object Repository/ApplicantCommonProfile/btnNextAchievment'))
WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/btnNextAchievment'))
WebUI.delay(2)





String rname='Channa'
String relation='Friend'
String refdesignation='QA lead'
String phone='0715738301'
WebUI.scrollToElement(findTestObject('Object Repository/ApplicantCommonProfile/txtRefName'))
WebUI.sendKeys(findTestObject('Object Repository/ApplicantCommonProfile/txtRefName'),rname)
WebUI.sendKeys(findTestObject('Object Repository/ApplicantCommonProfile/txtRelationship'),relation)
WebUI.sendKeys(findTestObject('Object Repository/ApplicantCommonProfile/txtRefDesignation'),refdesignation)
WebUI.sendKeys(findTestObject('Object Repository/ApplicantCommonProfile/txtRefPhone'),phone)
WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/btnAddToListReferees'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/btnNextReference'))
WebUI.delay(2)







String famname='Somasiri'
String famrelation='Father'
String famdesignation='Manager'
WebUI.scrollToElement(findTestObject('Object Repository/ApplicantCommonProfile/txtFamilyName'))
WebUI.sendKeys(findTestObject('Object Repository/ApplicantCommonProfile/txtFamilyName'),famname)
WebUI.sendKeys(findTestObject('Object Repository/ApplicantCommonProfile/txtFamilyRelationship'),famrelation)
WebUI.sendKeys(findTestObject('Object Repository/ApplicantCommonProfile/txtFamilyDesignation'),famdesignation)
WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/btnAddToListFamilyInfo'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/btnNextFamily'))
WebUI.delay(2)








WebUI.selectOptionByIndex(findTestObject('Object Repository/ApplicantCommonProfile/ddlJobCategory'),2)
WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/btnAddToListJobPref'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/btnNextJobPref'))
WebUI.delay(2)





//WebUI.click()
//WebUI.sendKeys(,oname)
//WebUI.selectOptionByIndex(,2)
//WebUI.scrollToElement()



WebUI.scrollToElement(findTestObject('Object Repository/ApplicantCommonProfile/chkSelectSrilnka'))
WebUI.check(findTestObject('Object Repository/ApplicantCommonProfile/chkSelectSrilnka'))
WebUI.scrollToElement(findTestObject('Object Repository/ApplicantCommonProfile/btnAddToListPreferred'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/ApplicantCommonProfile/btnNextPreference'))
WebUI.delay(2)


