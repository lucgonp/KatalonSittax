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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app.sittax.com.br/login')

WebUI.setText(findTestObject('Object Repository/Page_Simples/input_Usurio_usuario'), 'lucas.gontijo@sittax.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Simples/input_Senha_senha'), 'Q+mFkPFOH/RZRQ478vxz1g==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Simples/input_Senha_senha'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Simples/input_text'))

WebUI.click(findTestObject('Object Repository/Page_Simples/div_Selecione uma empresa'))

WebUI.click(findTestObject('Object Repository/Page_Simples/div_31.824.3800001-02 - KARITA DE JESUS S S_41562a'))

WebUI.click(findTestObject('Object Repository/Page_Simples/div_mar2025'))

WebUI.click(findTestObject('Object Repository/Page_Simples/span_Fevereiro'))

