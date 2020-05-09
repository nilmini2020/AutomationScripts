
/*
 * Copyright genesiis.com
 * This is test case for Verify the  Top Employers link
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

WebUI.navigateToUrl('http://localhost:8080/index.jsp')

WebUI.click(findTestObject('Object Repository/a_Top Employers'))

WebUI.click(findTestObject('Object Repository/input_AllWith Open JobsBy IndustryAlphabeti_49ec9b'))

WebUI.click(findTestObject('Object Repository/input_AllWith Open JobsBy IndustryAlphabeti_49ec9b'))

WebUI.click(findTestObject('Object Repository/input_AllWith Open JobsBy IndustryAlphabeti_49ec9b'))

WebUI.click(findTestObject('Object Repository/img'))

WebUI.click(findTestObject('Object Repository/a_Top Employers'))

WebUI.click(findTestObject('Object Repository/img_AllWith Open JobsBy IndustryAlphabetica_2dbd96_1'))

WebUI.click(findTestObject('Object Repository/img (1)'))

