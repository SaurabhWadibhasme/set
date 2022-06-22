package RoughWork.RoughWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
		String a= driver.getTitle();
		System.out.println(a);
		WebElement all=driver.findElement(By.id("searchDropdownBox"));
		all.click();
		Select s= new Select(all);
		List<WebElement> list=s.getOptions();
		int b=list.size();
		System.out.println(b);
		for(int i=1;i<=b;i+=1) {
			s.selectByIndex(i);
			Thread.sleep(2000);
		}
				
		
		
	}}
