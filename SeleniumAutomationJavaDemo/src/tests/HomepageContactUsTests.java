package tests;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import pageFactory.HomepageContactUsTabTest;
import pageFactory.HomepageLoadTest;

public class HomepageContactUsTests extends TestBase
{
	 Random random = new Random();
	 HomepageLoadTest homePage;
	 HomepageContactUsTabTest contactUsTab;
	

	@Test
	public void HomepageLoadTests() {

		homePage =PageFactory.initElements(driver, HomepageLoadTest.class);
		
		if (driver != null) {

		ElementListDisplayed(homePage.ContentItemCards);
		ElementListDisplayed(homePage.HomepageTabs);
		ElementListDisplayed(homePage.ProductImageLinks);
		ElementListDisplayed(homePage.CustomInfoBlocks);
		ElementListDisplayed(homePage.CustomInfoEachBlocks);
		System.out.println("Test Passed!");
		}				
    }
	
	@Test
	public void HomepateContactUsTabTests() {
		homePage =PageFactory.initElements(driver, HomepageLoadTest.class);
		contactUsTab = PageFactory.initElements(driver, HomepageContactUsTabTest.class);
		homePage.ContactUs.click();
	    WaitForDisplayed(contactUsTab.ContactUsContainer);
		
		WebElement[] arrayElements = {contactUsTab.HomeIcon, contactUsTab.NavigationPageContact,
				contactUsTab.CustomerServiceHeader, contactUsTab.SendAMessageHeader};
		
		List<WebElement> elements = new ArrayList<>();
		for(WebElement element : arrayElements) {
			elements.add(element);
			assertTrue("element is not displayed",element.isDisplayed());
		}
		System.out.println("Test Passed!");
	}
	@Test
	 public void SendAMessageSubjectHeadingDropdownTest() {
		homePage =PageFactory.initElements(driver, HomepageLoadTest.class);
		contactUsTab = PageFactory.initElements(driver, HomepageContactUsTabTest.class);
		
		homePage.ContactUs.click();
		WaitForDisplayed(contactUsTab.ContactUsContainer);
		
		ClickWhenAble(contactUsTab.SubjectHeadingOptionDropdown,10);
		ElementListDisplayed(contactUsTab.SubjectHeadingOptions);
		System.out.println("Test Passed!");
		
	 }
	@Test
	public void SendAMessageEmailAddressAndOrderReferenceTest() {
		homePage =PageFactory.initElements(driver, HomepageLoadTest.class);
		contactUsTab = PageFactory.initElements(driver, HomepageContactUsTabTest.class);
		
		homePage.ContactUs.click();
		WaitForDisplayed(contactUsTab.ContactUsContainer);
		
		contactUsTab.SubjectHeadingRandomChoice();
		boolean email = contactUsTab.EmailAddressLabel.isDisplayed() ? contactUsTab.EmailAddressLabel.getText().contains("Email address") : false;
        assertTrue(email);
		
        WaitForDisplayed(contactUsTab.EmailInputBox);
        contactUsTab.EmailInputBox.click();
        
        String[] emailAddressList = { "test@test.com", "test@test", "test.com", "" };
        String[] messageBoxContents = { "message test", "" };
        int randomEmailAddress = random.nextInt(emailAddressList.length);
        contactUsTab.EmailInputBox.sendKeys(emailAddressList[randomEmailAddress]);
        
        boolean orderReference = contactUsTab.OrderReferenceLabel.isDisplayed() ? contactUsTab.OrderReferenceLabel.getText().contains("Order reference") : false;
        assertTrue(orderReference);
        contactUsTab.OrderReferenceInputBox.sendKeys("12345");
        
        boolean messageLabel = contactUsTab.MessageLabel.isDisplayed() ? contactUsTab.MessageLabel.getText().equals("Message") : false;
        assertTrue(messageLabel);

        int randomMessage = random.nextInt(messageBoxContents.length);
        contactUsTab.MessageBox.sendKeys(messageBoxContents[randomMessage]);
        
        String filePath = "C:/Users/norah/Source/Repos/FileUploadTest.txt";
        contactUsTab.InputFilePath.sendKeys(filePath);
        contactUsTab.SendButton.click();
        boolean isValidEmail = false;
        if (emailAddressList[randomEmailAddress].contains("@") && emailAddressList[randomEmailAddress].contains(".com"))
        {
            isValidEmail = true;
        }

        boolean isEmailValid = isValidEmail ? true : false;

        boolean isMessageBoxEmpty = messageBoxContents[randomMessage].isEmpty() ? true : false;

        if (isEmailValid && !isMessageBoxEmpty)
        {
            assertTrue("Alert Success Message was not displayed.", contactUsTab.AlertSuccessMessage.isDisplayed());
           

            contactUsTab.FooterLinksHome.click();
           homePage.VerifyHomepageLoadTest();
        }
        else if (!isEmailValid)
        {
            assertTrue(contactUsTab.ErrorMessage.getText().contains("Invalid email address."));

        }
        else if (isMessageBoxEmpty)
        {
            assertTrue(contactUsTab.ErrorMessage.getText().contains("The message cannot be blank."));
        }

		
		
		
		
		
		
		
		
		
		
		
		
	}
}
