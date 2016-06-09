/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crawling;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 *
 * @author ukoolz
 */
public class SeleniumDemo {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "https://paytm.com/shop/p/lenovo-k3-note-black-MOBLENOVO-K3-NOEURE618956FC31270?tracker=%7C%7C%7C%7C%2Fh%2Felectronics%2Fmobile-accessories%2Fmobiles-Incredible%20Offers%7C4173%7C1";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testDemo() throws Exception {
               
                    driver.get(baseUrl);
					// give x - path of element you want to get  
				   String src="";
                                   String name = driver.findElement(By.xpath("/html/body/div[3]/div[3]/span/div/span/div[1]/div[1]/div[2]/h1")).getText();
                                   String price = driver.findElement(By.xpath("/html/body/div[3]/div[3]/span/div/span/div/div/div[2]/div[6]/button")).getText();
                                   String Description = driver.findElement(By.xpath("/html/body/div[3]/div[3]/span/div/span/div/div[3]/div/span/ul/li")).getText();
                                   String Seller = driver.findElement(By.xpath("/html/body/div[3]/div[3]/span/div/span/div[2]/div/div/div/a/h2")).getText();
                                   String Discount = driver.findElement(By.xpath("/html/body/div[3]/div[3]/span/div/span/div[2]/div/div/div/a/h2")).getText();
                                   String Specification = driver.findElement(By.xpath("/html/body/div[3]/div[3]/span/div/span/div/div[3]/div")).getText();
                                   String img = driver.findElement(By.xpath("/html/body/div[3]/div[3]/span/div/span/div/div/div/ul[2]/li/img")).getAttribute(src);
                                   //String color = driver.findElement(By.xpath("/html/body/div[3]/div[3]/span/div/span/div[2]/div/div/div/a/h2")).getText();
                                   System.out.println("name = "+name+"\n price = "+price+" \n Description = "+ Description);
                                   System.out.println("seller = "+Seller+" \n Specification = "+Specification+" \n image = "+img+" "+src);
                   
                }
 
          

          
          @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(WebDriver driver,By by)  
            {  
               driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);  
               try  
               {  
                    driver.findElement(by);  
                   return true;  
               }  
               catch(NoSuchElementException e)  
               {  
                   return false;  
               }  
              finally  
              {  
                  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
              }  
           }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
          }
}
