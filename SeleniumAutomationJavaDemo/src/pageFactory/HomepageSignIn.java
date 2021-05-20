package pageFactory;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageSignIn {

	
	//Create An Account Section
		@FindBy(xpath = "//a[@class='login' and @title='Log in to your customer account']")
		  public WebElement SignInLink;
		
		@FindBy(xpath = "//div[@class='columns-container']")
		  public WebElement SignInPageContainer;
		
		@FindBy(xpath = "//a[@title='Return to Home']")
		  public WebElement HomeIcon;
		
		@FindBy(xpath = "//span[@class='navigation_page' and text()='	Authentication']")
		  public WebElement NavigationPage;
		
		@FindBy(xpath = "//h1[@class='page-heading' and text()='Authentication']")
		  public WebElement SignInPageHeading;
		
		@FindBy(xpath = "//form[@id='create-account_form']")
		  public WebElement CreateAccountForm;
		
		@FindBy(xpath = "//h3[@class='page-subheading' and text()='Create an account']")
		  public WebElement CreateAccountSubHeading;
		
		@FindBy(xpath = "//p[text()='Please enter your email address to create an account.']")
		  public WebElement FormContant;
		
		@FindBy(xpath = "//label[@for='email_create' and text()='Email address']")
		  public WebElement EmailAddressLabel;
		
		@FindBy(xpath = "//input[@id='email_create']")
		  public WebElement EmailInputBox;
		
		@FindBy(xpath = "//button[@id='SubmitCreate']")
		  public WebElement CreateAccountButton;
		
		@FindBy(xpath = "//div[@class='alert alert-danger' and @id='create_account_error']")
		  public WebElement CreateAccountErrorAlert;
		
		 //Your Personal Information Form
		@FindBy(xpath = "//form[@id='account-creation_form']")
		  public WebElement AccountCreationForm;
		
		@FindBy(xpath = "//h3[@class='page-subheading' and text()='Your personal information']")
		  public WebElement YourPersionalInfoHeading;
		
		@FindBy(xpath = "//div[@class='clearfix']//label[text()='Title']")
		  public WebElement TitleLabel;
		
		@FindBy(xpath = "//div[@class='radio']//input[@type='radio']")
		  public List<WebElement> GenderRadioButtons;
		
		@FindBy(xpath = "//div[normalize-space()= 'Mr.']")
		  public WebElement MrLabel;
		
		@FindBy(xpath = "//div[normalize-space()= 'Mrs.']")
		  public WebElement MrsLabel;
		
		@FindBy(xpath = "//label[@for='customer_firstname' and text()='First name ']")
		  public WebElement FirstnameLabel;
		
		@FindBy(xpath = "//input[@id='customer_firstname']")
		  public WebElement FirstnameInput;
		
		@FindBy(xpath = "//label[@for='customer_lastname' and text()='Last name ']")
		  public WebElement LastnameLabel;
		
		@FindBy(xpath = "//input[@id='customer_lastname']")
		  public WebElement LastnameInput;
		
		@FindBy(xpath = "//label[@for='email' and text()='Email ']")
		  public WebElement EmailLabel;
		
		@FindBy(xpath = "//input[@id='email']")
		  public WebElement EmailInput;
		
		@FindBy(xpath = "//label[@for='passwd' and text()='Password ']")
		  public WebElement PasswordLabel;
		
		@FindBy(xpath = "//input[@id='passwd']")
		  public WebElement PasswordInput;
		
		@FindBy(xpath = "//span[@class='form_info' and text()='(Five characters minimum)']")
		  public WebElement PasswordFormInfo;
				
		@FindBy(xpath = "//label[text()='Date of Birth']")
		  public WebElement DateOfBirthLabel;
		
		@FindBy(xpath = "//select[@id='days']")
		  public WebElement DaysSelector;
		
		@FindBy(xpath = "//select[@id='months']")
		  public WebElement MonthsSelector;
		
		@FindBy(xpath = "//select[@id='years']")
		  public WebElement YearsSelector;
		
		@FindBy(xpath = "//label[@for='newsletter']")
		  public WebElement NewsLetterLabel;
		
		@FindBy(xpath = "//select[@id='years']//option")
		  public List<WebElement> YearOptions;
		
		@FindBy(xpath = "//select[@id='days']//option")
		  public List<WebElement> DaysOptions;
		
		@FindBy(xpath = "//select[@id='months']//option")
		  public List<WebElement> MonthsOptions;
		
		@FindBy(xpath = "//label[@for='optin']")
		  public WebElement SpecialOfferLabel;
		
		@FindBy(xpath = "//input[@id='newsletter']")
		  public WebElement NewsLetterCheckbox;
		
		@FindBy(xpath = "//input[@id='optin']")
		  public WebElement SpecialOfferCheckbox;
		
		//Your Address Form
		@FindBy(xpath = "//h3[@class='page-subheading' and text()='Your address']")
		  public WebElement YourAddressSubHeading;
		
		@FindBy(xpath = "//label[@for='firstname']")
		  public WebElement FirstNameLabel;
		
		@FindBy(xpath = "//label[@for='lastname']")
		  public WebElement LastNameLabel;
		
		@FindBy(xpath = "//label[@for='company']")
		  public WebElement CompanyLabel;
		
		@FindBy(xpath = "//label[@for='address1']")
		  public WebElement AddressOneLabel;
		
		@FindBy(xpath = "//label[@for='address2']")
		  public WebElement AddressTwoLabel;
		
		@FindBy(xpath = "//label[@for='city']")
		  public WebElement CityLabel;
		
		@FindBy(xpath = "//label[@for='id_state']")
		  public WebElement StateLabel;
		
		@FindBy(xpath = "//label[@for='postcode']")
		  public WebElement PostcodeLabel;
		
		@FindBy(xpath = "//label[@for='id_country']")
		  public WebElement CountryLabel;
		
		@FindBy(xpath = "//label[@for='phone']")
		  public WebElement HomePhoneLabel;
		
		@FindBy(xpath = "//label[@for='phone_mobile']")
		  public WebElement MobilePhoneLabel;
		
		@FindBy(xpath = "//label[@for='other")
		  public WebElement AdditionalInfoLabel;
		
		@FindBy(xpath = "//label[@for='alias']")
		  public WebElement AddressAliasLabel;
		
		@FindBy(xpath = "//input[@id='firstname']")
		  public WebElement FirstNameInputBox;
		
		@FindBy(xpath = "//input[@id='lastname']")
		  public WebElement LastNameInputBox;
		
		@FindBy(xpath = "//input[@id='company']")
		  public WebElement CompanyInputBox;
		
		@FindBy(xpath = "//input[@id='address1']")
		  public WebElement AddressOneInputBox;
		
		@FindBy(xpath = "//input[@id='address2']")
		  public WebElement AddressTwoInputBox;
		
		@FindBy(xpath = "//input[@id='city']")
		  public WebElement CityInputBox;
		
		@FindBy(xpath = "//select[@id = 'id_state']")
		  public WebElement SelectState;
		
		@FindBy(xpath = "//select[@id = 'id_country']")
		  public WebElement SelectCountry;
		
		@FindBy(xpath = "//input[@id='postcode']")
		  public WebElement PostcodeInpuBox;
		
		@FindBy(xpath = "//textarea[@id='other']")
		  public WebElement AdditionalInfoInputBox;
		
		@FindBy(xpath = "//input[@id='phone']")
		  public WebElement HomePhoneInputBox;
		
		@FindBy(xpath = "//input[@id='phone_mobile']")
		  public WebElement MobilePhoneInputBox;
		
		@FindBy(xpath = "//input[@id='alias']")
		  public WebElement AddressAliasInputBox;
		
		@FindBy(xpath = "//select[@id = 'id_state']//following::option[@selected='selected']")
		  public WebElement CountryOptionSelected;
		
		@FindBy(xpath = "//p[@class='inline-infos']")
		  public WebElement InlineInfos;
		
		@FindBy(xpath = "//select[@id = 'id_state']//following::option")
		  public List<WebElement> StateOptions;
		
		@FindBy(xpath = "//span[@class='inline-infos']")
		  public List<WebElement> AddressInlineInfos;
		
		@FindBy(xpath = "//button[@id='submitAccount']")
		  public WebElement RegisterButton;
		
	
}

