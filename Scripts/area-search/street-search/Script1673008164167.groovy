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

WebUI.navigateToUrl('https://client-staging.addintel.co.uk/login')

WebUI.setText(findTestObject('Page_Address Intelligence/input_Cookie Consent plugin for the EU cook_f38261'), 'l.naim@addintel.co.uk')

WebUI.setEncryptedText(findTestObject('Page_Address Intelligence/input_Cookie Consent plugin for the EU cook_363d9d'), 'loTGhntZQk0ShkeyhvVEFg==')

WebUI.click(findTestObject('Page_Address Intelligence/button_Login'))

WebUI.setText(findTestObject('Page_Address Intelligence/input_Group 1__AI_ai-omnibox_24_freetext'), 'ballards lane')

WebUI.click(findTestObject('Object Repository/Page_Address Intelligence/li_Ballards Lane N12              street by_0a86e2'))

WebUI.click(findTestObject('Page_Address Intelligence/button_Add'))

WebUI.click(findTestObject('Page_Address Intelligence/button_Show results'))

WebUI.closeBrowser()

