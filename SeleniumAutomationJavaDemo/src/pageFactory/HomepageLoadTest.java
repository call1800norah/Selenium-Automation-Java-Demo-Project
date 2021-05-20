package pageFactory;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageLoadTest{


	 @FindBy(xpath = "//div[@id='page']")
	  public WebElement Wholepage;
		
	 @FindBy(xpath = "//div[@class='banner']")
     public WebElement Banner;
		
	 @FindBy(xpath = "//span[@class='shop-phone' and text()='Call us now: ']")
	 public WebElement CallUsNow;
		
	 @FindBy(xpath = "//input[@id='search_query_top' and @name='search_query']")
	 public WebElement SearchBox;
		
	 @FindBy(xpath = "//div[@id='contact-link']//a[@title='Contact Us']")
     public WebElement ContactUs;
				
	 @FindBy(xpath = "//div[@class='header_user_info']//a[@title='Log in to your customer account']")
	 public WebElement SignIn;
		
	 @FindBy(xpath = "//img[@class='logo img-responsive' and @alt='My Store']")
	 public WebElement StoreLogo;
		
	 @FindBy(xpath = "//div[@class='shopping_cart']//following::a[@title='View my shopping cart']")
	 public WebElement ShoppingCart;
		
	 @FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']")
	 public WebElement MenuContant;
		
	 @FindBy(xpath = "//div[@id='homepage-slider']")
	 public WebElement HomepageSlicer;
		
	 @FindBy(xpath = "//div[@id='facebook_block']")
	 public WebElement FacebookBlock;
		
	 @FindBy(xpath = "//div[@id='editorial_block_center']")
	 public WebElement EditorialBlock;
		
	 @FindBy(xpath = "//div[@class='footer-container']")
	 public WebElement FooterContainer;
		
	 @FindBy(xpath = "//div[@id='htmlcontent_top']//following::li[contains(@class, 'htmlcontent')]")
	 public List<WebElement> ContentItemCards;
		
	 @FindBy(xpath = "//div[@id='htmlcontent_top']//following::li[contains(@class, 'htmlcontent')]")
	 public List<WebElement> HomepageTabs;

	 @FindBy(xpath = "//div[@id='htmlcontent_top']//following::li[contains(@class, 'htmlcontent')]")
	 public List<WebElement> ProductImageLinks;

	 @FindBy(xpath = "//div[@id='htmlcontent_top']//following::li[contains(@class, 'htmlcontent')]")
	 public List<WebElement> CustomInfoBlocks;

	 @FindBy(xpath = "//div[@id='htmlcontent_top']//following::li[contains(@class, 'htmlcontent')]")
	 public List<WebElement> CustomInfoEachBlocks;


	
    //Method to verify homepage is loading
	public void VerifyHomepageLoadTest() {
    	
			WebElement[] arrayList = {Wholepage,
					Banner, ContactUs,  CallUsNow, SignIn,
					StoreLogo, SearchBox, ShoppingCart, MenuContant,
					HomepageSlicer, FacebookBlock, EditorialBlock, FooterContainer };
			List<WebElement> elements = new ArrayList<>();
			for(WebElement element : arrayList) {
				elements.add(element);
				assertTrue("element is not displayed",element.isDisplayed());
		    }			
        }      	
}
