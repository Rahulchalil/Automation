package Mobileworldnew;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Allmobiles {
@Test(dataProvider="Data")
	public void Latest(String firstname, String lastname, String mail, String password , String number , String address1, String address2, String city, String zipcode) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rahul.C\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")).click();
		Thread.sleep(1000);
	
		
	
		driver.findElement(By.id("myInput")).sendKeys("Apple");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[7]/td[5]/a")).click();
		
		Set<String> currentHandle= driver.getWindowHandles();
		Iterator<String> it=currentHandle.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		 
		
	 	 
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("RAHUL");
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div[2]/input")).sendKeys("C");
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rahulrameshan885@gmail.com");
		 driver.findElement(By.name("flexRadioDefault")).click();
		 driver.findElement(By.id("inputPassword")).sendKeys("Rahul@1996");
		 driver.findElement(By.xpath("//input[@type='number']")).sendKeys("95260193734");
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[4]/div[1]/input")).sendKeys("tdtdtytfu");
		 driver.findElement(By.xpath("//*[@id='address2']")).sendKeys("tdytdfyufv");
		 driver.findElement(By.id("inputCity")).sendKeys("fff");
		 driver.findElement(By.id("inputZip")).sendKeys("234567");
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
public Object[][] getData(){
	Object[][] T11=new Object[2][9];
	T11[0][0]="Rahul";
	T11[0][1]="C";
	T11[0][2]="rahulrameshan885@gmail.com";
	T11[0][3]="Rahul@96";
	T11[0][4]="9526018488";
	T11[0][5]="taliparamba";
	T11[0][6]="kannur";
	T11[0][7]="kannur";
	T11[0][8]="670142";
	
	T11[1][0]="RahHJVJHV@ul";
	T11[1][1]="45";
	T11[1][2]="rahulrameshan885gmail.com";
	T11[1][3]="Rahul@96";
	T11[1][4]="9526018UGKUGV488";
	T11[1][5]="talipJYHVJYCaramba";
	T11[1][6]="k@@nnur";
	T11[1][7]="kannur";
	T11[1][8]="6701TVJ2";
	return T11;
	
	
}
}