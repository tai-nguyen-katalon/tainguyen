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

'Step 4: At Page category accessories, click on hyperlink by price'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_accessories/hyperlink_by_price'))

'Step 5: At Page category accessories, click on hyperlink by price'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_accessories/hyperlink_by_price'))

'Step 6: At Page category accessories, click on svg object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_accessories/svg_object'))

'Step 7: Add visual checkpoint at Page category accessories'

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Verify Accessories Category Display_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
