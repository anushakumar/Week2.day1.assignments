package week2.day1.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println("title  :  "+title);
        String url =driver.getCurrentUrl();
        System.out.println(url);
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("AnushaTestleaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anusha");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anu");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("IT is the best dept");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anu@gmail.com");
        Select s= new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
        s.selectByVisibleText("New York");
        driver.findElement(By.className("smallSubmit")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.id("updateLeadForm_description")).clear();
        driver.findElement(By.id("updateLeadForm_description")).sendKeys("Fill ImportantNote ");
        driver.findElement(By.xpath("(//input[@class='smallSubmit'] )[1]")).click();
        String title1 = driver.getTitle();
        System.out.println("title  :  "+title1);
        if(title1.contains("View Lead"))
        {System.out.println("Successfully created");}
        else {System.out.println("Failed created");}
        driver.close();

	}

}
