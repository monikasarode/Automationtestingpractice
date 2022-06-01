package Com.Automationtestingpractice.TestCases;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class VolunteerSignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Logger log=Logger.getLogger(VolunteerSignUp.class);
		PropertyConfigurator.configure("log4j.properties");
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.switchTo().frame("frame-one1434677811");
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Monika");
		log.info("Enter The First Name");
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Sarode");
		log.info("Enter The Last NAme");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("1245675475");
		log.info("Enter The Phone Number");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("India");
		log.info("Enter The Country Name");
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Nagpur");
		log.info("Enter The City Name");
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("monikasarode222@gamil.com");
		log.info("Enter The Email Address");
		
		WebElement rdofemale=driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_1']"));
		rdofemale.click();
		log.info("Female is selected");
		Thread.sleep(2000);
		
		WebElement availabledaysinweek=driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_0']"));
		availabledaysinweek.click();
		log.info("Click On Sunday");
	Thread.sleep(2000);
	
	Select droptimetocontact=new Select(driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']")));
	droptimetocontact.selectByIndex(1);
	log.info(" Time is selected");
	Thread.sleep(2000);
	
	
	WebElement btnupload=driver.findElement(By.xpath("//label[@for='RESULT_FileUpload-10']"));
	btnupload.click();
	log.info(" Click On Upload CTA");
	Thread.sleep(2000);
	
	WebElement txtuploadpic=driver.findElement(By.xpath("//input[@id='RESULT_FileUpload-10']"));
	txtuploadpic.sendKeys("C:\\Users\\LENOVO\\Downloads\\IMG-20220302-WA0001 (1).jpg");
	log.info(" Profile Pic Uploaded");
	Thread.sleep(2000);
	
	driver.switchTo().defaultContent();
	
	
	WebElement txtheadingnewwin=driver.findElement(By.xpath("//div[@id='Wikipedia1']//h2"));
	String newheading=txtheadingnewwin.getText();
	log.info(newheading);
	Thread.sleep(2000);
	
		
		
		
		WebElement clickme=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[2]/div[1]/aside[1]/div[1]/div[2]/div[1]/button[1]"));
		clickme.click();
		driver.switchTo().alert().accept();
		clickme.click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		
		
		//drop down commands
		Select speed=new Select(driver.findElement(By.xpath("//select[@id='speed']")));
		speed.selectByIndex(2);
		log.info("Select The Speed");
		Thread.sleep(2000);
		
		Select file=new Select(driver.findElement(By.xpath("//select[@id='files']")));
		file.selectByIndex(3);
		log.info(" File Is Selected");
		Thread.sleep(2000);
		
		Select num=new Select(driver.findElement(By.xpath("//select[@id='number']")));
		num.selectByIndex(2);
		System.out.println(" Number Is Selected");
		Thread.sleep(2000);
		
		Select product=new Select(driver.findElement(By.xpath("//select[@id='products']")));
		product.selectByIndex(2);
		System.out.println(" Product Is Selected ");
		Thread.sleep(2000);
		
		Select animal=new Select(driver.findElement(By.xpath("//select[@id='animals']")));
		animal.selectByIndex(3);
		System.out.println(" Animal is Selected");
		Thread.sleep(2000);
				
		WebElement txtlabels=driver.findElement(By.xpath("//div[@id='Text1']"));
		String TextLabel=txtlabels.getText();
		System.out.println(TextLabel);
		Thread.sleep(2000);
		
		WebElement Xpathaxes=driver.findElement(By.xpath("//div[@id='HTML14']"));
		String XPathAxex=Xpathaxes.getText();
		System.out.println(XPathAxex);
		Thread.sleep(2000);
       
       WebElement txthtmllabel=driver.findElement(By.xpath("//div[@id='HTML1']"));
       String TextHtmllabels=txthtmllabel.getText();
       System.out.println(TextHtmllabels);
       Thread.sleep(2000);
       
       WebElement txttooltips=driver.findElement(By.xpath("//div[@id='HTML8']"));
       String TextToolTips=txttooltips.getText();
       System.out.println(TextToolTips);
       Thread.sleep(2000);
       
       //mouse move commands
       
       System.out.println(" Code For Double Click");
       
       Actions act=new Actions( driver);
       WebElement doublelick=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
       act.doubleClick(doublelick).build().perform();
       Thread.sleep(2000);
       
       WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
       WebElement dragdown=driver.findElement(By.xpath("//div[@id='droppable']"));
       act.dragAndDrop(drag, dragdown).build().perform();
     
       WebElement john=driver.findElement(By.xpath("//img[@alt='the peaks of high tatras']"));
       WebElement merry=driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
       WebElement trash=driver.findElement(By.xpath("//div[@id='trash']"));
       act.dragAndDrop(john, trash).build().perform();
       act.dragAndDrop(merry, trash).build().perform();
       
       //command for slider
       WebElement slider=driver.findElement(By.xpath("//span[@id='ui-slider-handle ui-corner-all ui-state-default']")); 
       act.moveToElement(slider).clickAndHold().moveByOffset(0, 40).build() .perform();  
       Thread.sleep(2000);
       
	}

}
