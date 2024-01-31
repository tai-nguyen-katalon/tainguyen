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

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/li_object'))

'Step 3: At Page home, click on hyperlink accessories > navigate to Page category accessories'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_accessories'))

'Step 4: At Page category accessories, input on input price min'

WebUI.setText(findTestObject('AI-Generated/Page_category_accessories/input_price_min'), input_price_min)

'Step 5: At Page category accessories, input on input price max'

WebUI.setText(findTestObject('AI-Generated/Page_category_accessories/input_price_max'), input_price_max)

'Step 6: At Page category accessories, click on button show 8'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_accessories/button_show_8'))

'Step 7: At Page category accessories, click on hyperlink samsung galaxy z fold4 silicon cover > navigate to Page product'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_accessories/hyperlink_samsung_galaxy_z_fold4_silicon_cover'))

'Step 8: At Page product, click on svg object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/svg_object'))

'Step 9: At Page product, click on button buy'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

'Step 10: Add visual checkpoint at Page product'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Purchase of Samsung Galaxy Z Fold4 Silicon Cover_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
