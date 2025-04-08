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

WebUI.setText(findTestObject('Object Repository/Page_Simples/input_Usurio_usuario (1)'), 'lucas.gontijo@sittax.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Simples/input_Senha_senha (1)'), 'Q+mFkPFOH/RZRQ478vxz1g==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Simples/input_Senha_senha (1)'), Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Simples/input_Senha_senha (1)'), 'Q+mFkPFOH/RZRQ478vxz1g==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Simples/input_Senha_senha (1)'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Simples/input_Usurio_usuario (1)'), 'lucas.gontijo@sittax.com.br')

WebUI.sendKeys(findTestObject('Object Repository/Page_Simples/input_Usurio_usuario (1)'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Simples/input_Selecione uma empresa_selectHeaderEmp_72c3ac (1)'), 'a. f c')

WebUI.sendKeys(findTestObject('Object Repository/Page_Simples/input_Selecione uma empresa_selectHeaderEmp_72c3ac (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Simples/div_mar2025 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Simples/span_Janeiro'))

WebUI.click(findTestObject('Object Repository/Page_Simples/img_Fechar_p-0 rounded-circle'))

WebUI.click(findTestObject('Object Repository/Page_Simples/span_Apurao'))

WebUI.click(findTestObject('Object Repository/Page_Simples/span_Gerar apurao'))

WebUI.click(findTestObject('Object Repository/Page_Simples/button_OK'))

