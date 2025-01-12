package pages;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.Set;

public class SocialMediaPages {

    private WebDriver driver;
     final String FACEBOOK = "InsightPortal - Home | Facebook";
     final String TWITTER = "InsightPortal (@InsightPortal) | Twitter";
     final String YOUTUBE = "InsightPortal - YouTube";
     final String LINKEDIN = "InsightPortal | LinkedIn";
//     final String INSIGHTPORTAL = "InsightPortal | Dashboard";

    public SocialMediaPages (WebDriver driver){
        this.driver = driver;
    }

    public void checkFacebookPage() throws Exception{
//        driver.getWindowHandle();
//        System.out.println(driver.getCurrentUrl());
//        Assert.assertTrue(driver.getCurrentUrl().contains(FACEBOOK));
//
//        Set<String> allWindowsHandle = driver.getWindowHandles();
////        String lastWindowHandle = "";
//        for (String handle : allWindowsHandle){
//            System.out.println("Switching to window: " + handle);
//            driver.switchTo().window(handle);
////            System.out.println("Getting title from tab " + fbTab);
//            Assert.assertTrue(handle.contains(FACEBOOK));
//        }
//        driver.close();
//        driver.getWindowHandle();

//
//        driver.manage().window().fullscreen();

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains(FACEBOOK));
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        System.out.println(driver.getTitle());

//        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//        Thread.sleep(2000);
//        driver.switchTo().window(tabs2.get(1));
//        Thread.sleep(2000);
//        Assert.assertTrue(driver.getTitle().contains(FACEBOOK));
//        driver.close();
//        Thread.sleep(2000);
//        driver.switchTo().window(tabs2.get(0));
    }

    public void checkTwitterPage() throws Exception{
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains(TWITTER));
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        System.out.println(driver.getTitle());
    }

    public void checkYoutubePage() throws InterruptedException {
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains(YOUTUBE));
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        System.out.println(driver.getTitle());
    }

    public void checkLinkedInPage() throws InterruptedException {
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains(LINKEDIN));
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        System.out.println(driver.getTitle());
    }

}
