package exem;

import org.jboss.netty.handler.codec.http.websocketx.WebSocket13FrameDecoder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import javax.jws.WebResult;
import java.util.Set;

/**
 * Created by Kailend on 01.08.2016.
 */
public class Selenium {

    @Test
    public void windowNew() throws InterruptedException {
        WebDriver driver ;
        driver=new ChromeDriver();

        driver.get("https://kismia.com/");
        WebDriverWait wait=new WebDriverWait(driver,10);
        String mainWind=driver.getWindowHandle();
        driver.findElement(By.xpath("//a[@class=\"mailru in_popup\"]")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> windHandl=driver.getWindowHandles();

        for (String window:windHandl){
            if (!window.equals(mainWind))
                driver.switchTo().window(window);
        }

}

}
