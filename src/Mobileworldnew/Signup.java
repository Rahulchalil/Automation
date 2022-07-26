package Mobileworldnew;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Signup {
	@Test(dataProvider="Data")
	public void Signup1(String firstname, String lastname, String email, String password, String date,String number, String bio ) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rahul.C\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net");
		 driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/nav/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/p/a")).click();
		driver.findElement(By.xpath("//*[@id=\"myName\"]")).sendKeys(firstname);
		driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[1]/div[3]/input")).sendKeys(lastname);
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div[2]/input[1]")).sendKeys(email);
	    driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div[2]/input[2]")).sendKeys(password);
	    driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[2]/input")).sendKeys(date);
	    driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[3]/input")).click();
	    driver.findElement(By.xpath("/html/body/div/div[2]/form/div[4]/div[2]/input")).sendKeys(number);
	    driver.findElement(By.xpath("/html/body/div/div[2]/form/div[5]/div[2]/textarea")).sendKeys(bio);
	    driver.findElement(By.xpath("/html/body/div/div[2]/form/div[6]/div[2]/button")).click();
	    driver.switchTo().alert().accept();
	}
	@DataProvider(name="Data")
	public Object[][] getData()	{
		Object[][] SignUp11 = new Object[2][7];
		SignUp11[0][0]="Rahul";
		SignUp11[0][1]="C";
		SignUp11[0][2]="rahulrameshan885@gmail.com";
		SignUp11[0][3]="Rahul@96";
		SignUp11[0][4]="07/13/2022";
		SignUp11[0][5]="9526018488";
		SignUp11[0][6]="Testing";
		
		SignUp11[1][0]="qwerty";
		SignUp11[1][1]="a";
		SignUp11[1][2]="rahulgmail.com";
		SignUp11[1][3]="bkubkubb";
		SignUp11[1][4]="hagetr";
		SignUp11[1][5]="12ebbbhdj";
		SignUp11[1][6]="bubbiub";
		
		return SignUp11;
		
				

	}

}
