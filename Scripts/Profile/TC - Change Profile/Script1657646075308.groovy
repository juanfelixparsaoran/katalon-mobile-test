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

Mobile.tap(findTestObject('Object Repository/Change Profile/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Change Profile/android.widget.TextView - EDIT'), 0)

Mobile.tap(findTestObject('Object Repository/Change Profile/android.widget.RelativeLayout'), 0)

Mobile.setText(findTestObject('Object Repository/Change Profile/android.widget.EditText - Your Name'), 'Juan', 0)

Mobile.tap(findTestObject('Object Repository/Change Profile/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Change Profile/android.widget.RelativeLayout (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Change Profile/android.widget.EditText - your.emailgmail.com'), 'juan@gmail.com', 
    0)

Mobile.tap(findTestObject('Change Profile/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Change Profile/android.widget.TextView - 628123456789'), 0)

Mobile.setText(findTestObject('Object Repository/Change Profile/android.widget.EditText - 628123456789'), '085263742839', 
    0)

Mobile.tap(findTestObject('Change Profile/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Change Profile/android.widget.TextView - Your Address'), 0)

Mobile.setText(findTestObject('Object Repository/Change Profile/android.widget.EditText - Your Address'), 'Medan', 0)

Mobile.tap(findTestObject('Change Profile/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Change Profile/android.widget.ImageButton'), 0)

Mobile.getText(findTestObject('Object Repository/Change Profile/android.widget.TextView - Juan'), 0)

Mobile.getText(findTestObject('Object Repository/Change Profile/android.widget.TextView - juangmail.com'), 0)

Mobile.getText(findTestObject('Object Repository/Change Profile/android.widget.TextView - 085263742839'), 0)

Mobile.getText(findTestObject('Object Repository/Change Profile/android.widget.TextView - Medan'), 0)

Mobile.closeApplication()

