import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: At Page home, hover on li object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/li_object_1'))

'Step 3: At Page home, click on hyperlink samsung > navigate to Page category samsung'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_samsung'))

'Step 4: At Page category samsung, click on hyperlink by title'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/hyperlink_by_title'))

'Step 5: At Page category samsung, click on svg object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/svg_object'))

'Step 6: At Page category samsung, click on label object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/label_object'))

'Step 7: At Page category samsung, click on label object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/label_object_1'))

'Step 8: At Page category samsung, click on button buy'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/button_buy'))

'Step 9: Add visual checkpoint at Page category samsung'

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Samsung Category Display_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
