package practise;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSeachList {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		WebElement txtsearch ;
		txtsearch = driver.findElement(By.xpath("//input[@title='Search']"));
		txtsearch.sendKeys("java");	
		/*  Google Search Using Itorator */
		WebElement googlesearch = driver.findElement(By.xpath("//div[@class='UUbT9']"));// take Xpath of Table 
		Thread.sleep(2000);
		List<WebElement> SearchResultList = googlesearch.findElements(By.tagName("span"));// Find xpath of span Tag
		Iterator<WebElement> itr = SearchResultList.iterator();
		while(itr.hasNext())
		{
			WebElement SearchList = itr.next();
			System.out.println(  SearchList.getText());
		}
		
		/* Without Using Iterator */
		
	/*	WebElement googlesearch = driver.findElement(By.xpath("//div[@class='UUbT9']"));
		Thread.sleep(2000);
		List<WebElement> SearchResultList = googlesearch.findElements(By.tagName("span"));
		
		//System.out.println("size of List is "+ SearchResultList.size());
		
		for(WebElement i: SearchResultList)
		{
			System.out.println( i.getText());
			
			
		}*/
		
		//Thread.sleep(8000);
		//driver.close();*/
	

	}

}
