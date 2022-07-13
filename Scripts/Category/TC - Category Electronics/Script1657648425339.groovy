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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('APK\\ECommerce -SAMPLE-Android.apk', true)

Mobile.tap(findTestObject('Object Repository/Category/android.widget.ImageView Category'), 0)

Mobile.tap(findTestObject('Object Repository/Category/android.widget.LinearLayout Electronics'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - Samsung Galaxy S10 - Black'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 899 USD'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - U17 USB Portable M3 HUmidifier Air Purifier LED Night Light 200ML'), 
    0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 20 USD'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - Apple watch series 3 GPS 42mm Black'), 
    0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 400 USD'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - Mini Digital Speaker TD-V26 USB FM Radio SD TF Card MP3 - Red'), 
    0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 19 USD'), 0)

Mobile.scrollToText('375 USD', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Category/android.widget.TextView - LED TV 43 Inch Smart TV TCL 43E3 UHD 4K Dolby Sound'), 
    0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 375 USD'), 0)

Mobile.closeApplication()

