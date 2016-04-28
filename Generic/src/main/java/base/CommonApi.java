package base;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by a on 4/27/2016.
 */
public class CommonApi {
    public WebDriver driver=null;

    @BeforeMethod
    public void setUp(String url){
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void cleanUp(){
        driver.quit();

    }

    public void clickByCss(String locator){
        
    }


}
