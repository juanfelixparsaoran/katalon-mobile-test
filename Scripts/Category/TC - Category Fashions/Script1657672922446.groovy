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

Mobile.tap(findTestObject('Object Repository/Category/android.widget.ImageView Category'), 0)

Mobile.tap(findTestObject('Object Repository/Category/android.widget.LinearLayout Fashion'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - Dolce and Gabbana Heels'), 0)

Mobile.verifyElementExist(findTestObject('Category/android.widget.ImageView Dolce'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 100 USD'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Category/android.widget.ImageView Gold'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - Gold Titanium Diamond Womens Bracelet'), 
    0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 199 USD'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Category/android.widget.ImageView Sleeve'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - Short Sleeve Mens Batik Shirt OB 445'), 
    0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 25 USD'), 0)

Mobile.verifyElementExist(findTestObject('Category/android.widget.ImageView SKMEI'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - SKMEI Children Sport Rubber LED Watch DG1100 - Black'), 
    0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 75 USD'), 0)

Mobile.scrollToText('29 USD', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Category/android.widget.ImageView Mini'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - Mini Panda Backpack - Pink'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 29 USD'), 0)

Mobile.closeApplication()

