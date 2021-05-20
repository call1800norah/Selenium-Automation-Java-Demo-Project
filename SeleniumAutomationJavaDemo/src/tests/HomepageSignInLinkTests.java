package tests;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertNotNull;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pageFactory.HomepageSignIn;

public class HomepageSignInLinkTests extends TestBase{
	HomepageSignIn signInLink;
	 private String firstname = "Tester";
     private String lastName = "Test";
     Random random = new Random();
     
     // Validate homepage loading and fill out 'Create an Account' form in Sign In Page. 
	 @Test
	 public void CreateAnAccountTest() {
		signInLink =PageFactory.initElements(driver, HomepageSignIn.class);
			
		signInLink.SignInLink.click();		
		assertNotNull(signInLink.SignInPageContainer);
		WaitForDisplayed(signInLink.SignInPageContainer);
		
		WebElement[] validateSignInPage = { signInLink.SignInPageHeading,
					 signInLink.HomeIcon, signInLink.NavigationPage, signInLink.CreateAccountForm,
					 signInLink.CreateAccountButton, signInLink.CreateAccountSubHeading, signInLink.FormContant,
					 signInLink.EmailAddressLabel, signInLink.EmailInputBox};
			 
		ElementArrayDisplayed(validateSignInPage);
			 
		String invalidEmail = "test1234@test.com";
		signInLink.EmailInputBox.sendKeys(invalidEmail);
		signInLink.CreateAccountButton.click();
		WaitForDisplayed(signInLink.CreateAccountErrorAlert);
	         
		String alertMessage = "An account using this email address has already been registered. "
	         		+ "Please enter a valid password or request a new one.";
		assertTrue(signInLink.CreateAccountErrorAlert.getText().contains(alertMessage));
		String validEmail = "call1800norah@test.com";
		signInLink.EmailInputBox.clear();
		signInLink.EmailInputBox.sendKeys(validEmail);
		signInLink.CreateAccountButton.click();
		try {
			    Thread.sleep(5000);
			}
		catch (InterruptedException e) {
				e.printStackTrace();
			}		 		
		}
	 
	 //Validate inside the Sign in page, 'Your Personal Information' section form is successfully loaded and filled out.
	 @Test
	 public void SignInPageYourPersonalInfoForm() {
		 signInLink =PageFactory.initElements(driver, HomepageSignIn.class);
		 
		 signInLink.SignInLink.click();		
		 assertNotNull(signInLink.SignInPageContainer);
		 WaitForDisplayed(signInLink.SignInPageContainer);
		 
		 String validEmail = "call1800norah@test.com";
			signInLink.EmailInputBox.clear();
			signInLink.EmailInputBox.sendKeys(validEmail);
			signInLink.CreateAccountButton.click();
			try {
				    Thread.sleep(5000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}		 		
			
		 WaitForDisplayed(signInLink.AccountCreationForm);
		 assertNotNull(signInLink.AccountCreationForm);
		 assertTrue(signInLink.AccountCreationForm.isDisplayed());
		 
		 WebElement[] createAccountFormElements = { signInLink.TitleLabel,
				 signInLink.MrLabel, signInLink.MrsLabel, signInLink.FirstnameLabel, signInLink.LastnameLabel,
				 signInLink.EmailLabel, signInLink.PasswordLabel, signInLink.DateOfBirthLabel};
		 
		 ElementArrayDisplayed(createAccountFormElements);
		 	
		 WebElement genderClick = signInLink.GenderRadioButtons.get(0);
		 genderClick.click();
		 signInLink.FirstnameInput.sendKeys(firstname);
         signInLink.LastnameInput.sendKeys(lastName);
         String validPassword = "12345";
         String invalidPassword = "1234";
         signInLink.PasswordInput.sendKeys(invalidPassword);
         assertTrue(signInLink.PasswordFormInfo.getText().contains("(Five characters minimum)"));
         signInLink.PasswordInput.clear();
         signInLink.PasswordInput.sendKeys(validPassword);

         signInLink.DaysSelector.click();
		 
	 }
	 
	 //Validate inside the Sign in page, Your Address section is loaded and filled out successfully.
	 @Test
	 public void SignInPageYourAddressForm() {
         signInLink =PageFactory.initElements(driver, HomepageSignIn.class);
		 
		 signInLink.SignInLink.click();		
		 assertNotNull(signInLink.SignInPageContainer);
		 WaitForDisplayed(signInLink.SignInPageContainer);
		 
		 String validEmail = "call1800norah@test.com";
			signInLink.EmailInputBox.clear();
			signInLink.EmailInputBox.sendKeys(validEmail);
			signInLink.CreateAccountButton.click();
			try {
				    Thread.sleep(5000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}		 		
			
		 WaitForDisplayed(signInLink.AccountCreationForm);
		 assertNotNull(signInLink.AccountCreationForm);
		 assertTrue(signInLink.AccountCreationForm.isDisplayed());

		 WaitForDisplayed(signInLink.YourAddressSubHeading);
		 
		 WebElement[] addressInfoList = { signInLink.YourAddressSubHeading, signInLink.FirstNameLabel, signInLink.LastNameLabel,
				 signInLink.CompanyLabel, signInLink.AddressOneLabel, signInLink.AddressTwoLabel,signInLink.CityLabel,
				 signInLink.CountryLabel,  signInLink.InlineInfos, signInLink.HomePhoneLabel,
				 signInLink.MobilePhoneLabel, signInLink.AddressAliasLabel};
		 ElementArrayDisplayed(addressInfoList);
		 
		 signInLink.FirstNameInputBox.sendKeys(firstname);
		 signInLink.LastNameInputBox.sendKeys(lastName);
		 signInLink.CompanyInputBox.sendKeys("Samsung");
		 signInLink.AddressOneInputBox.sendKeys("100 BlueStar Street");
		 signInLink.AddressTwoInputBox.sendKeys("Second Floor");
		 signInLink.CityInputBox.sendKeys("St.Louis");
		 

		 signInLink.SelectState.click();
		 List<WebElement> stateOption = new ArrayList<WebElement>();
		 for(WebElement state:signInLink.StateOptions) {
			
			 stateOption.add(state);
		 }
		 int states = stateOption.size(); 		 
	     int randomdaysOption = random.nextInt(states);
		 String stateSelected = signInLink.StateOptions.get(randomdaysOption).getText();
		 
		 signInLink.SelectState.sendKeys(stateSelected);			 
         signInLink.PostcodeInpuBox.sendKeys("66999");
         signInLink.SelectCountry.click();
         signInLink.CountryOptionSelected.click();
         signInLink.HomePhoneInputBox.sendKeys("1234566789");
         signInLink.MobilePhoneInputBox.sendKeys("987654321");
         signInLink.AddressAliasInputBox.sendKeys("");
         signInLink.RegisterButton.click();
		 
	 }		 	
		 
}
