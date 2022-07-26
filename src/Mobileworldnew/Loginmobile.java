package Mobileworldnew;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Loginmobile {
	
	
	@Test(dataProvider="data")
	public void Login1(String user,String pass) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rahul.C\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net");
		 driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/nav/div/button")).click();
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[4]/a")).click();
		driver.quit();
		
		}
	
	@DataProvider(name="data")
	public Object[][] getdata() {
		Object[][] login11 = new Object[2][2];
		login11[0][0]= "rahul";
		login11[0][1]="Rahul@96";
		
		
		login11[1][0]="praveen";
		login11[1][1]="Praveen@97";
				
		return login11;
		
	}
}
