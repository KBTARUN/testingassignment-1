package flipkartpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class testflipkart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kbta3001\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		
		
		String actualTitle=driver.getTitle();
		String expectedtitle ="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	
		Assert.assertEquals(actualTitle, expectedtitle,"Title did not match");
		System.out.println("Title 1 validated");	
		WebElement mobileno=driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]"));
		mobileno.sendKeys("7567324521");
		Thread.sleep(1000);
		WebElement exitbutton=driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]"));
		exitbutton.click();
		WebElement searchbar=driver.findElement(By.xpath("//input[@class=\"_3704LK\"]"));
		searchbar.sendKeys("Iphone");


		


		WebElement searchbutton=driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]"));
		searchbutton.click();
		
		String expected_url = "https://www.flipkart.com/search?q=Iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off";
		String current_url = driver.getCurrentUrl();		 
		Assert.assertTrue(expected_url.equals(current_url), "URL does not match\n");
		
//		Actions act = new Actions(driver);
//		act.moveToElement(xpath).click().build().perform();
		
		System.out.println("Title 2 validated");	
		
		Thread.sleep(1000);

		
		driver.navigate().to("https://www.flipkart.com/apple-iphone-11-white-128-gb/p/itme32df47ea6742?pid=MOBFWQ6B7KKRXDDS&lid=LSTMOBFWQ6B7KKRXDDSULUZ0N&marketplace=FLIPKART&q=Iphone&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=3b7c09c4-744a-4236-8253-d18ab5852497.MOBFWQ6B7KKRXDDS.SEARCH&ppt=sp&ppn=sp&ssid=m4s3xmqg3k0000001677760995539&qH=29e0a89b3149a9af");
		
//		WebElement w=driver.findElement(By.xpath("//a[starts-with(@class,'_1fGeJ5')]"));
//		System.out.println(w.getText());
		
		String s1="64 GB";
		String s2="128 GB";
		
		
		WebElement w1=driver.findElement(By.xpath("//a[starts-with(@class,'_1fGeJ5')]"));
		Assert.assertEquals(w1.getText(), s1, "64GB is present");
		
		WebElement w2=driver.findElement(By.xpath("//a[starts-with(@class,'_1fGeJ5 PP89tw')]"));
		Assert.assertEquals(w2.getText(), s2, "128GB is present");		
		
		System.out.println("Storage validated");
		
		List <WebElement> listofItems = driver.findElements(By.xpath("//li[starts-with(@class,'_3V2wfe')]"));
		for (int i=1; i<=listofItems.size(); i++)
		{ 
		   
		    listofItems = driver.findElements(By.xpath("//li[starts-with(@class,'_3V2wfe')]"));

		    Thread.sleep(1000);

		    listofItems.get(i-1).click();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    System.out.print("COLOUR "+i+ "\t--");
		    System.out.println("pass");
		    driver.navigate().back(); 
		}
		
		
		System.out.println("Colours validated");
		Thread.sleep(1000);
		WebElement onecolour=driver.findElement(By.xpath("//li[@id=\"swatch-2-color\"]"));
		onecolour.click();
		
		if(driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]"))!= null){
			System.out.println("Addtocart is Present");
			}else{
			System.out.println("Addtocart is Absent");
			}

		WebElement addtocart=driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]"));
		addtocart.click();
		
		if(driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA ihZ75k _3AWRsL\"]"))!= null){
			System.out.println("Buy Now is Present");
			}else{
			System.out.println("Buy Now is Absent");
			}	
		

		
	
		
		
		

		
		
	}

}
