package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Testing Material\\webdriver for chrom\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		//driver.findElement(By.xpath("//input[@value='Milk']")).click();
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if (text.equalsIgnoreCase("Cheese")) {
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}

		int count1 = driver.findElements(By.xpath("//input[@name='group2']")).size();
		for (int j = 0; j < count1; j++) {
			String text2 = driver.findElements(By.xpath("//input[@name='group2']")).get(j).getAttribute("Value");
			if(text2.equalsIgnoreCase("beer"))
			{
				driver.findElements(By.xpath("//input[@name='group2']")).get(j).click();
			}
		}
		
	}

}
