package Mobileworldnew;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Support {
	@Test(dataProvider="Data")
	public void Supportcontact(String name, String mail, String number, String message) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rahul.C\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/a")).click();
		 driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/div/a[2]")).click();
		 Thread.sleep(1000);
		 
		 
		 Set<String> currentHandle= driver.getWindowHandles();
		 Iterator<String> it=currentHandle.iterator();
		 String parentId=it.next();
		 String childId=it.next();
		 driver.switchTo().window(childId);
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.name("name")).sendKeys(name);
		// Thread.sleep(1000);
		 
		 driver.findElement(By.name("phone")).sendKeys(number);
		 driver.findElement(By.name("email")).sendKeys(mail);
		 driver.findElement(By.name("message")).sendKeys(message);
		 driver.findElement(By.xpath("/html/body/div/div/div[2]/form/input")).click();
		 driver.quit();
	
	}
	
	@DataProvider(name="Data")
	public Object[][] getData()	{
		Object[][] R11 = new Object[2][4];
		R11[0][0]="RAHUL";
		R11[0][1]="rahulrameshan885@gmail.com";
		R11[0][2]="9526018488";
		R11[0][3]="deffects";
		
		R11[1][0]="Rjsdbfkjb123";
		R11[1][1]="rahulrameshgmail";
		R11[1][2]="95260184sdjkcn@88";
		R11[1][3]="deffe@@cts";
		
		
		
		return R11;
		
		
	}
}
