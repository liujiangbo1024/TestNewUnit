/**
 * @Project Name :  testunitnew
 * @Package Name :  selenium.testcase
 * @Description :  TODO
 * @author :  liujiangbo
 * @Creation Date:  2019-11-02 9:20
 * @ModificationHistory Who    When    What
 * --------  ---------  --------------------------
 */
package selenium.testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description  :  TODO
 * @author       :  liujiangbo
 * @Creation Date:  2019-11-02 9:20
 */
public class DefaultSuiteTest {


    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void login() {
        driver.get("https://work.weixin.qq.com/");
        driver.manage().window().setSize(new Dimension(1515, 813));
        driver.findElement(By.linkText("企业登录")).click();
    }
}