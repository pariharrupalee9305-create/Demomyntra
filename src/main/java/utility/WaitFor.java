package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import keyword.Keyword;

public class WaitFor {
static WebDriverWait wait;
   static{
   wait= new WebDriverWait(Keyword.driver,Duration.ofSeconds(60));
	}
	
   
   public static void ElementToBeVisible(By Element) {
	wait.until(ExpectedConditions.visibilityOfElementLocated(Element));
           }
  
  
  public static void ElementToBeVisible(WebElement Element) {
		wait.until(ExpectedConditions.invisibilityOfAllElements(Element));
	           }
  
  public static void ElementToBeClickAble(By Element) {
	  wait.until(ExpectedConditions.elementToBeClickable(Element));
        }
  
  public static void ElementToBeClickAble(WebElement Element) {
	  wait.until(ExpectedConditions.elementToBeClickable(Element));
        }
  
  
  public static void ElementToBeSelected(By Element) {
	  wait.until(ExpectedConditions.elementToBeSelected(Element));
	
     }
  
  
  public static void ElementToBeSelected(WebElement Element) {
	  wait.until(ExpectedConditions.elementToBeSelected(Element));
	
     }
  
  
  public static void presenceToBeElement(By Element) {
	wait.until(ExpectedConditions.presenceOfElementLocated(Element));
    }
  
  public static void presenceOfAllElement(By Element) {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(Element));
	    }
  
  
  public static void stalnessOfElement(WebElement Element) {
	wait.until(ExpectedConditions.stalenessOf(Element));
}
  
}
