import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page jamaica internet-bundles'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/jamaica/internet-bundles')

'step 2: Add visual checkpoint at Page jamaica internet-bundles'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Successful Navigation to Jamaica Internet Bundles Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
