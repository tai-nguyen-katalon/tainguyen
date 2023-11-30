import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'step 2: At Page home click on hyperlink category phone --> navigate to Page category'

testObj = findTestObject('AI-Generated/Page_home/hyperlink_category_phone')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*//?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page category click on hyperlink'

testObj = findTestObject('AI-Generated/Page_category/hyperlink')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page category click on button object'

testObj = findTestObject('AI-Generated/Page_category/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page category click on hyperlink cart --> navigate to Page cart'

testObj = findTestObject('AI-Generated/Page_category/hyperlink_cart')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page cart click on button object'

testObj = findTestObject('AI-Generated/Page_cart/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/cart/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: At Page cart click on button object --> navigate to Page checkout info'

testObj = findTestObject('AI-Generated/Page_cart/button_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/cart/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: At Page checkout info input on input email'

testObj = findTestObject('AI-Generated/Page_checkout_info/input_email')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/info/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_email)

'step 9: At Page checkout info click on input receive marketing info'

testObj = findTestObject('AI-Generated/Page_checkout_info/input_receive_marketing_info')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/info/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 10: At Page checkout info click on button object --> navigate to Page checkout shipping-address'

testObj = findTestObject('AI-Generated/Page_checkout_info/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/info/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 11: At Page checkout shipping-address input on input shipping address first name'

testObj = findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_first_name')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_2_input_shipping_address_first_name)

'step 12: At Page checkout shipping-address input on input shipping address last name'

testObj = findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_last_name')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_3_input_shipping_address_last_name)

'step 13: At Page checkout shipping-address input on input shipping address address line 1'

testObj = findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_address_line_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_4_input_shipping_address_address_line_1)

'step 14: At Page checkout shipping-address input on input shipping address zip'

testObj = findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_zip')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_5_input_shipping_address_zip)

'step 15: At Page checkout shipping-address input on input shipping address city'

testObj = findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_city')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_6_input_shipping_address_city)

'step 16: At Page checkout shipping-address input on input shipping address state'

testObj = findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_state')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_7_input_shipping_address_state)

'step 17: At Page checkout shipping-address input on input shipping address phone'

testObj = findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_phone')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_8_input_shipping_address_phone)

'step 18: At Page checkout shipping-address click on button object --> navigate to Page checkout payment'

testObj = findTestObject('AI-Generated/Page_checkout_shipping-address/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 19: At Page checkout payment click on input payment method id'

testObj = findTestObject('AI-Generated/Page_checkout_payment/input_payment_method_id')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/payment/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 20: At Page checkout payment click on button object --> navigate to Page thank-youc1ea-95d6-4cf0-ac04-ed828b6a2fb3'

testObj = findTestObject('AI-Generated/Page_checkout_payment/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/payment/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 21: Add visual checkpoint at Page thank-youc1ea-95d6-4cf0-ac04-ed828b6a2fb3'

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Verify successful checkout process from Cart to Thank You page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
