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

'Step 3: At Page home, click on svg object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/svg_object'))

'Step 4: At Page home, click on hyperlink place an order > navigate to Page cart'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_place_an_order'))

'Step 5: At Page cart, click on button'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button'))

'Step 6: At Page cart, click on button proceed to checkout > navigate to Page checkout info'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceed_to_checkout'))

'Step 7: At Page checkout info, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_object'))

'Step 8: At Page checkout info, click on input email'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

'Step 9: At Page checkout info, input on input email'

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email)

'Step 10: At Page checkout info, click on input receive marketing info'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_receive_marketing_info'))

'Step 11: At Page checkout info, click on button continue to shipping > navigate to Page checkout shipping-address'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continue_to_shipping'))

'Step 12: At Page checkout shipping-address, click on input delivery id'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping-address/input_delivery_id'))

'Step 13: At Page checkout shipping-address, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping-address/div_object'))

'Step 14: At Page checkout shipping-address, click on input shipping address first name'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_first_name'))

'Step 15: At Page checkout shipping-address, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping-address/div_object_1'))

'Step 16: At Page checkout shipping-address, input on input shipping address first name'

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_first_name'), input_shipping_address_first_name)

'Step 17: At Page checkout shipping-address, click on input shipping address last name'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_last_name'))

'Step 18: At Page checkout shipping-address, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping-address/div_object_2'))

'Step 19: At Page checkout shipping-address, input on input shipping address last name'

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_last_name'), input_shipping_address_last_name)

'Step 20: At Page checkout shipping-address, click on input shipping address address line 1'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_address_line_1'))

'Step 21: At Page checkout shipping-address, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping-address/div_object_3'))

'Step 22: At Page checkout shipping-address, input on input shipping address address line 1'

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_address_line_1'), input_shipping_address_address_line_1)

'Step 23: At Page checkout shipping-address, click on input shipping address zip'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_zip'))

'Step 24: At Page checkout shipping-address, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping-address/div_object_4'))

'Step 25: At Page checkout shipping-address, input on input shipping address zip'

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_zip'), input_shipping_address_zip)

'Step 26: At Page checkout shipping-address, click on input shipping address city'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_city'))

'Step 27: At Page checkout shipping-address, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping-address/div_object_5'))

'Step 28: At Page checkout shipping-address, input on input shipping address city'

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_city'), input_shipping_address_city)

'Step 29: At Page checkout shipping-address, click on input shipping address state'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_state'))

'Step 30: At Page checkout shipping-address, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping-address/div_object_6'))

'Step 31: At Page checkout shipping-address, input on input shipping address state'

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_state'), input_shipping_address_state)

'Step 32: At Page checkout shipping-address, click on input shipping address phone'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_phone'))

'Step 33: At Page checkout shipping-address, input on input shipping address phone'

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_phone'), input_shipping_address_phone)

'Step 34: At Page checkout shipping-address, click on button continue to payment > navigate to Page checkout payment'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping-address/button_continue_to_payment'))

'Step 35: At Page checkout payment, click on input payment method id'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/input_payment_method_id'))

'Step 36: At Page checkout payment, click on button complete order > navigate to Page thank-you'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_complete_order'))

'Step 37: Add visual checkpoint at Page thank-you'

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Verify Successful Completion of Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
