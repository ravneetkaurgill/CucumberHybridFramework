package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class RegisterPage {
WebDriver driver;
private ElementUtils elementUtils;
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtils=new ElementUtils(driver);
	}
	
	@FindBy(id="input-firstname")
	private WebElement firstNameField;
	
	@FindBy(id="input-lastname")
	private WebElement lastNameField;
	
	@FindBy(id="input-email")
	private WebElement emailField;
	
	@FindBy(id="input-telephone")
	private WebElement telephoneField;
	
	@FindBy(id="input-password")
	private WebElement passwordField;
	
	@FindBy(id="input-confirm")
	private WebElement confirmPasswordField;
	
	
	@FindBy(name="agree")
	private WebElement privacyPolicyOption;
	
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath="//input[@name='newsletter'][@value='1']")
	private WebElement yesNewsletterOption;
	
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	private WebElement warningMessage;
	
	public void enterFirstNameText(String firstNameText) {
		elementUtils.typeTextIntoElement(firstNameField, firstNameText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void enterLastNameText(String lastNameText) {
		elementUtils.typeTextIntoElement(lastNameField, lastNameText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void enterEmailAddress(String emailText) {
		elementUtils.typeTextIntoElement(emailField, emailText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void enterTelephoneNumber(String telephoneText) {
		elementUtils.typeTextIntoElement(telephoneField, telephoneText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void enterPasswordText(String passwordText) {
		elementUtils.typeTextIntoElement(passwordField, passwordText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void enterConfirmPasswordText(String passwordText) {
		elementUtils.typeTextIntoElement(confirmPasswordField, passwordText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void selectPrivacyPolicy() {
		elementUtils.clickOnElement(privacyPolicyOption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public  AccountSuccessPage clickOnContinueButton() {
		elementUtils.clickOnElement(continueButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new AccountSuccessPage(driver);
	}
	
	public void selectYesNewsletterOption() {
		elementUtils.clickOnElement(yesNewsletterOption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public String getWarningMessageText() {
		return elementUtils.getTextFromElement(warningMessage,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
}
