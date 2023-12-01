import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page jamaica internet-bundles'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/jamaica/internet-bundles')

'step 2: Add visual checkpoint at Page jamaica internet-bundles'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify successful navigation to Jamaica Internet Bundles page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
