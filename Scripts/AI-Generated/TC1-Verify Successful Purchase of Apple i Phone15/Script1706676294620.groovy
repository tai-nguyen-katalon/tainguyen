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

'Step 3: At Page home, click on hyperlink apple > navigate to Page category apple'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_apple'))

'Step 4: At Page category apple, click on hyperlink iphone 15 > navigate to Page product'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_apple/hyperlink_iphone_15'))

'Step 5: At Page product, click on label object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_object'))

'Step 6: At Page product, click on label object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_object_1'))

'Step 7: At Page product, click on svg object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/svg_object_1'))

'Step 8: At Page product, click on button buy'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy_1'))

'Step 9: At Page product, click on hyperlink place an order > navigate to Page cart'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/hyperlink_place_an_order'))

'Step 10: At Page cart, click on button'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button'))

'Step 11: At Page cart, click on button remove'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_remove'))

'Step 12: Add visual checkpoint at Page cart'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Purchase of Apple i Phone15_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
