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

'Step 3: At Page home, click on hyperlink apple > navigate to Page category chekhly-na-iphone'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_apple_1'))

'Step 4: At Page category chekhly-na-iphone, input on input price min'

WebUI.setText(findTestObject('AI-Generated/Page_category_chekhly-na-iphone/input_price_min'), input_price_min)

'Step 5: At Page category chekhly-na-iphone, input on input price max'

WebUI.setText(findTestObject('AI-Generated/Page_category_chekhly-na-iphone/input_price_max'), input_price_max)

'Step 6: At Page category chekhly-na-iphone, click on button show 6'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly-na-iphone/button_show_6'))

'Step 7: At Page category chekhly-na-iphone, click on svg object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly-na-iphone/svg_object'))

'Step 8: At Page category chekhly-na-iphone, click on label object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly-na-iphone/label_object'))

'Step 9: At Page category chekhly-na-iphone, click on button buy'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly-na-iphone/button_buy'))

'Step 10: Add visual checkpoint at Page category chekhly-na-iphone'

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Verify Purchase of Chekhly Na i Phone from Apple Category_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
