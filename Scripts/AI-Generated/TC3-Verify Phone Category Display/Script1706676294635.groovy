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

'Step 3: At Page home, click on hyperlink phone > navigate to Page category phone'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_phone'))

'Step 4: At Page category phone, click on hyperlink by title'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_phone/hyperlink_by_title'))

'Step 5: At Page category phone, click on hyperlink by title'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_phone/hyperlink_by_title'))

'Step 6: At Page category phone, click on svg object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_phone/svg_object'))

'Step 7: Add visual checkpoint at Page category phone'

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Phone Category Display_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
