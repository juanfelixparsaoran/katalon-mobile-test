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

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.Button - ADD TO CART (2)'), 0)

Mobile.setText(findTestObject('Object Repository/order and checkout/android.widget.EditText (2)'), '3', 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.Button - ADD (2)'), 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.TextView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.Button - CHECKOUT (2)'), 0)

Mobile.setText(findTestObject('Object Repository/order and checkout/android.widget.EditText - Your Name (2)'), 'Juan', 0)

Mobile.setText(findTestObject('Object Repository/order and checkout/android.widget.EditText - your.emailgmail.com (2)'), 
    'juan@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/order and checkout/android.widget.EditText - 628123456789 (2)'), '089384229390', 
    0)

Mobile.setText(findTestObject('Object Repository/order and checkout/android.widget.EditText - Your Address (2)'), 'Medan', 
    0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.TextView - TNT Express (2)'), 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.CheckedTextView - FedEx'), 0)

Mobile.setText(findTestObject('Object Repository/order and checkout/android.widget.EditText - Comment (3)'), 'amanin', 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.Button - PROCESS CHECKOUT (2)'), 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.Button - YES (2)'), 0)

Mobile.waitForElementPresent(findTestObject('order and checkout/android.widget.Button - OK (2)'), 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.Button - OK (2)'), 0)

Mobile.closeApplication()

