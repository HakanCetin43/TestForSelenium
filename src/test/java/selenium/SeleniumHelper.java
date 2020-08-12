package selenium;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static selenium.LocatorMethods.*;

public class SeleniumHelper {
//public static WebElement element=null;

    public static void userNavigatesHelper(String url){
        driver.navigate().to(url);
    }

    public static void userEntersHelper(String input, String element) {

        locateElements(element).sendKeys(input);
    }

    public static void userClicksHelper(String element){
        locateElements(element).click();
    }

    public static void userViewsHelper(String element) {
        boolean displayed = locateElements(element).isDisplayed();
        Assert.assertEquals(true, displayed);
    }

    public static void userViewsErrorMessageHelper(String element) throws InterruptedException {
        Thread.sleep(2000);
        String text = locateElements(element).getText();
        System.out.println("element = " + text);

//
//        boolean displayed=locateElements(element).isDisplayed();
//       Assert.assertEquals(true, displayed);

    }
//    public static void viewsErrorMessage(WebDriverWait wait, String expectedErrorMessage) {
//
//        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.
//                xpath("//*[contains(@class, 'notificationText notificationText')]")));
//        String actualMessage = element.getText();
//
//        Assert.assertTrue(actualMessage.contains(expectedErrorMessage));
//
//
//    }



}
