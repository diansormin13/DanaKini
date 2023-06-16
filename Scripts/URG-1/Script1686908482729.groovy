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

Mobile.startApplication('C:\\Users\\hp\\Downloads\\Danakini_3.11.7_apkcombo.com.apk', false)

'register'
Mobile.tap(findTestObject('Register/android.widget.TextView - Daftar (1)'), 0, FailureHandling.STOP_ON_FAILURE)

'Nama Lengkap'
Mobile.setText(findTestObject('Register/android.widget.EditText - New Name'), 'TESTERs', 0, FailureHandling.STOP_ON_FAILURE)

'No.Ponsel'
Mobile.setText(findTestObject('Register/android.widget.EditText - Phone Number'), '0819555831', 0, FailureHandling.STOP_ON_FAILURE)

'Email'
Mobile.setText(findTestObject('Register/android.widget.EditText - NEW EMAIL'), 'test0000test123+Test2@gmail.com', 0, FailureHandling.STOP_ON_FAILURE)

'password'
Mobile.sendKeys(findTestObject('Register/android.widget.EditText - NEW PASSWORD'), 'ASDasd123')

'conr. password'
Mobile.sendKeys(findTestObject('Register/android.widget.EditText - CONR PASSWORD'), 'ASDasd123')

'Syarat dan Ketentuan'
Mobile.tap(findTestObject('Register/android.widget.TextView - Syarat dan Ketentuan'), 0, FailureHandling.STOP_ON_FAILURE)

'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.5

'Storing the endY value'
int endY = device_Height * 0.9

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

'Setuju'
Mobile.tap(findTestObject('Register/android.widget.Button - Setuju'), 0, FailureHandling.STOP_ON_FAILURE)

'DAFTAR'
Mobile.tap(findTestObject('Register/android.widget.Button - DAFTAR'), 0, FailureHandling.STOP_ON_FAILURE)

'Confirmation wrong email'
Mobile.getText(findTestObject('Register/android.widget.TextView - Masukkan email yang valid (Contoh mailexample.com) Periksa kembali penulisan email Anda'), 
    0, FailureHandling.STOP_ON_FAILURE)

'Take screenshot of current device screen'
Mobile.takeScreenshot("D:\\screenshot1-1.png")

'OK EMAIL'
Mobile.tap(findTestObject('Register/android.widget.Button - OKE EMAIL SALAH'), 0, FailureHandling.STOP_ON_FAILURE)

'Close application on current selected android\'s device'
Mobile.closeApplication()