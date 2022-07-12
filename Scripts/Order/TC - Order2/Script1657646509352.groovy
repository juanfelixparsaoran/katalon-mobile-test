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

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.Button - ADD TO CART (1)'), 0)

Mobile.setText(findTestObject('Object Repository/order and checkout/android.widget.EditText (1)'), '3', 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.Button - ADD (1)'), 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.TextView'), 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.Button - CHECKOUT (1)'), 0)

Mobile.setText(findTestObject('order and checkout/android.widget.EditText - Your Name (1)'), 'Juan', 0)

Mobile.setText(findTestObject('Object Repository/order and checkout/android.widget.EditText - your.emailgmail.com (1)'), 
    'juan@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/order and checkout/android.widget.EditText - 628123456789 (1)'), '082933847291', 
    0)

Mobile.setText(findTestObject('Object Repository/order and checkout/android.widget.EditText - Your Address (1)'), 'Medan', 
    0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.TextView - TNT Express (1)'), 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.CheckedTextView - DHL Express'), 0)

Mobile.setText(findTestObject('Object Repository/order and checkout/android.widget.EditText - Comment (1)'), 'Banyakin', 
    0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.Button - PROCESS CHECKOUT (1)'), 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.Button - YES (1)'), 0)

Mobile.waitForElementPresent(findTestObject('order and checkout/android.widget.Button - OK (1)'), 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.Button - OK (1)'), 0)

