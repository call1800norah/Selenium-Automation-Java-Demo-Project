package pageFactory;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.*;

public class HomepageContactUsTabTest {
	
	//HomepateContactUsTabTest
	 @FindBy(xpath = "//div[@class='columns-container']")
	  public WebElement ContactUsContainer;
		
	 @FindBy(xpath = "//a[@class='home' and @title = 'Return to Home']")
	 public WebElement HomeIcon;
	 
	 @FindBy(xpath = "//span[@class='navigation_page' and text()='Contact']")
	 public WebElement NavigationPageContact;
	 
	 @FindBy(xpath = "//h1[@class='page-heading bottom-indent']")
	 public WebElement CustomerServiceHeader;
	 
	 @FindBy(xpath = "//h3[@class='page-subheading' and text()='send a message']")
	 public WebElement SendAMessageHeader;
	 
	 @FindBy(xpath = "//label[@for='id_contact' and text()='Subject Heading']")
	 public WebElement SubjectHeading;
	 
	 @FindBy(xpath = "//div[@id='uniform-id_contact']//child::select")
	 public WebElement SubjectHeadingOptionDropdown;
	 
	 @FindBy(xpath = "//select[@id='id_contact']//child::option")
	 public List<WebElement> SubjectHeadingOptions;

	//SendAMessageSubjectHeadingDropdownTest
	 
	 @FindBy(xpath = "//p[normalize-space()='For any question about a product, an order']")
	  public WebElement CustomeServiceOptionComment;
	 
	 @FindBy(xpath = "//p[@id='desc_contact2']//child::i[@class='icon-comment-alt']")
	  public WebElement CommentSymbol;
	 
	 @FindBy(xpath = "//p[normalize-space()='If a technical problem occurs on this website']")
	  public WebElement WebMasterComment;
	 
	 @FindBy(xpath = "//div[@id = 'uniform-id_contact']//span[text()='-- Choose --']")
	  public WebElement OptionChoose;
	 
	 @FindBy(xpath = "//label[text()='Email address']")
	  public WebElement EmailAddressLabel;
	 
	 @FindBy(xpath = "//input[@id='email']")
	  public WebElement EmailInputBox;
	 
	 @FindBy(xpath = "//div[@class='alert alert-danger']")
	  public WebElement ErrorMessage;
	 
	 @FindBy(xpath = "//label[text()='Order reference']")
	  public WebElement OrderReferenceLabel;
	 
	 @FindBy(xpath = "//input[@id='id_order']")
	  public WebElement OrderReferenceInputBox;
	 
	 @FindBy(xpath = "//label[@for='message']")
	  public WebElement MessageLabel;
	 
	 @FindBy(xpath = "//textarea[@id='message']")
	  public WebElement MessageBox;
	 
	 @FindBy(xpath = "//label[@for='fileUpload']")
	  public WebElement AttachFileLabel;
	 
	 @FindBy(xpath = "//span[@class='action' and text()='Choose File']")
	  public WebElement ChooseFileButton;
	 
	 @FindBy(xpath = "//input[@id='fileUpload' and @type='file']")
	  public WebElement InputFilePath;
	 
	 @FindBy(xpath = "//button[@id='submitMessage']")
	  public WebElement SendButton;
	 
	 @FindBy(xpath = "//p[@class='alert alert-success']")
	  public WebElement AlertSuccessMessage;
	 
	 @FindBy(xpath = "//ul[@class='footer_links clearfix']//a[@class='btn btn-default button button-small']")
	  public WebElement FooterLinksHome;
	 
	 //Method for the random choice of the Subject Heading dropdown
	 public void SubjectHeadingRandomChoice() {
		 SubjectHeadingOptionDropdown.click();
		
		 Random random = new Random();
		 int randomChoice = random.nextInt(SubjectHeadingOptions.size());
		
		 SubjectHeadingOptions.get(randomChoice).click();
		 switch (randomChoice)
         {
             case 0:
                 assertTrue(SubjectHeadingOptions.get(randomChoice).getText().contains("-- Choose --"));                   
                 assertTrue(OptionChoose.getText().contains("-- Choose --"));                   
                 break;

             case 1:
                 assertTrue(SubjectHeadingOptions.get(randomChoice).getText().contains("Customer service"));                  
                 assertTrue(CustomeServiceOptionComment.getText().contains("For any question about a product, an order"));
                 break;

             case 2:
                 assertTrue(SubjectHeadingOptions.get(randomChoice).getText().contains("Webmaster"));                    
                 assertTrue(WebMasterComment.getText().contains("If a technical problem occurs on this website"));    
                 break;
         }
         boolean IsChooseSelected = SubjectHeadingOptions.get(randomChoice).getText().equals("-- Choose --");
         if (IsChooseSelected)
         {
             SubjectHeadingOptions.get(1).click();
         }
	 }
	 
	 
	 
	 
	 
	 
}
