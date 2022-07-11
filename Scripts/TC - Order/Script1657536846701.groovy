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

Mobile.tap(findTestObject('order and checkout/android.widget.ImageView'), 15)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.Button - ADD TO CART'), 0)

Mobile.setText(findTestObject('Object Repository/order and checkout/android.widget.EditText'), '2', 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.Button - Add'), 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.ImageButton (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/order and checkout/android.widget.TextView - 899 USD x 2'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/order and checkout/android.widget.TextView - Tax  10'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/order and checkout/android.widget.TextView - Total  1.978 USD'), 
    0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.Button - Checkout'), 0)

Mobile.setText(findTestObject('Object Repository/order and checkout/android.widget.EditText - Your Name'), 'Juan', 0)

Mobile.setText(findTestObject('Object Repository/order and checkout/android.widget.EditText - your.emailgmail.com'), 'juan@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/order and checkout/android.widget.EditText - 628123456789'), '+6285161512981', 
    0)

Mobile.setText(findTestObject('Object Repository/order and checkout/android.widget.EditText - Your Address'), 'Jalan Mawar Nomor 1', 
    0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.TextView - TNT Express'), 0)

Mobile.tap(findTestObject('order and checkout/android.widget.CheckedTextView - COD (Cash On Delivery)'), 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.Button - PROCESS CHECKOUT'), 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.Button - Yes'), 30)

Mobile.waitForElementPresent(findTestObject('order and checkout/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('order and checkout/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.iconprofile'), 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.TextView - Order History'), 0)

Mobile.tap(findTestObject('Object Repository/order and checkout/android.widget.RelativeLayout'), 0)

Mobile.verifyElementExist(findTestObject('order and checkout/android.widget.TextView - 2 Samsung Galaxy S10 - Black 1.798 USD,Order  1.798 USDTax  10   180 USDTotal  1.978 USD'), 
    0)

Mobile.closeApplication()

