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

Mobile.startApplication('C:\\Users\\095085\\Katalon Studio\\katalon-mobile-test\\APK\\ECommerce -SAMPLE-Android.apk', true)

Mobile.tap(findTestObject('Category/android.widget.ImageView Category'), 0)

Mobile.tap(findTestObject('Category/android.widget.RelativeLayout Baby'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.ImageView Hybrid'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - Hybrid Stroller Cabi Sport Rosse Gold'), 
    0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 380 USD'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.ImageView Bib'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - Bib Slabber Waterproof'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 8 USD'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.ImageView Bottle'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - Portable Bottle Heater'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 8 USD (1)'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.ImageView GEA'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - GEA Baby RayQueen Plus JHS-400 UV Sterilizer - Metal White'), 
    0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 220 USD'), 0)

Mobile.scrollToText('10 USD')

Mobile.getText(findTestObject('Object Repository/Category/android.widget.ImageView Animal'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - Animal Jumpsuit for Newborn Baby'), 
    0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 10 USD'), 0)

Mobile.closeApplication()

