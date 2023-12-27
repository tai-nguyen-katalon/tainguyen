import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.katalon.truetest.authentication.LoginProcess as LoginProcess

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page home --> navigate to Page t'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/cart.html')

'step 2: Login at Page t --> navigate to Page inventory html#code=0 ASsAPh27IWxyhE-TOVG8BZK'

LoginProcess.ssoLoginWithMicrosoft()

'step 3: Navigate to Page inventory html#code=0 ASsAPh27IWxyhE-TOVG8BZK --> navigate to Page cart html'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/cart.html')

'step 4: Add visual checkpoint at Page cart html'

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Verify Correct Display of page Cart Html_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
