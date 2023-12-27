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

WebUI.navigateToUrl(GlobalVariable.application_domain + '/checkout-complete.html')

'step 2: Login at Page t --> navigate to Page inventory html#code=0 ASsAPh27IWxyhE-TOVG8BZK'

LoginProcess.ssoLoginWithMicrosoft()

'step 3: Navigate to Page inventory html#code=0 ASsAPh27IWxyhE-TOVG8BZK --> navigate to Page checkout-complete html'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/checkout-complete.html')

'step 4: Add visual checkpoint at Page checkout-complete html'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Checkout on page Checkout Complete Html_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
