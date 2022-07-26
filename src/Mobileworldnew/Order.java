package Mobileworldnew;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Order {
	@Test(dataProvider="Data")
	public void Orderinfo(String firstname, String lastname,String mail, String password, String number, String address1, String address2, String city,String zipcode) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rahul.C\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/a")).click();
		 driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/div/a[1]")).click();
		 Thread.sleep(1000);
		 
		 Set<String> currentHandle= driver.getWindowHandles();
		 Iterator<String> it=currentHandle.iterator();
		 String parentId=it.next();
		 String childId=it.next();
		 driver.switchTo().window(childId);
		 
		 	 
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys(firstname);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div[2]/input")).sendKeys(lastname);
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys(mail);
		 driver.findElement(By.name("flexRadioDefault")).click();
		 driver.findElement(By.id("inputPassword")).sendKeys(password);
		 driver.findElement(By.xpath("//input[@type='number']")).sendKeys(number);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[4]/div[1]/input")).sendKeys(address1);
		 driver.findElement(By.xpath("//*[@id='address2']")).sendKeys(address2);
		 driver.findElement(By.id("inputCity")).sendKeys(city);
		 driver.findElement(By.id("inputZip")).sendKeys(zipcode);
		 driver.findElement(By.xpath("//input[@rel='samsung']")).click();
		 driver.findElement(By.xpath("//input[@rel='apple']")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/fieldset/div/div[3]/div/div[3]/select/option[2]")).click();
		 driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[6]/div[2]/input")).sendKeys("1");
		 
		  
		 
		 WebElement staticDropdown=driver.findElement(By.id("inputState"));
		 Select dropdown=new Select (staticDropdown);
		 dropdown.selectByIndex(2);
		 
		 Select s1 = new Select(driver.findElement(By.id("bought")));
		 s1.selectByVisibleText("No");
		 
		 driver.findElement(By.id("gridCheck1")).click();
		 driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("#exampleModal > div > div > div.modal-footer > a")).click();
		 Thread.sleep(1000);
		 driver.quit();
	 
	}
	@DataProvider(name="Data")
	public Object[][] getData()	{
		Object[][] S11 = new Object[2][9];
		S11[0][0]="Rahul";
		S11[0][1]="C";
		S11[0][2]="rahulrameshan885@gmail.com";
		S11[0][3]="Rahul@96";
		S11[0][4]="9526018488";
		S11[0][5]="taliparamba";
		S11[0][6]="kannur";
		S11[0][7]="kannur";
		S11[0][8]="670142";
		
		S11[1][0]="R@1238";
		S11[1][1]="90";
		S11[1][2]="rahulrameshan885gAIil.com";
		S11[1][3]="Ra";
		S11[1][4]="95260184uiu8";
		S11[1][5]="talipa@ramba";
		S11[1][6]="kan$%nur";
		S11[1][7]="kan234nur";
		S11[1][8]="670u42";
		
		return S11;
		
	}}
