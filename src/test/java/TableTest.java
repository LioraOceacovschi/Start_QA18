import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }
    @Test
    public void tableTestCss(){
        // print amount of table rows
        List<WebElement> rows = wd.findElements(By.cssSelector("#customers tr"));
        System.out.println("Amount of rows = "+rows.size());

        // print amount of table columns
        List<WebElement> columns = wd.findElements(By.cssSelector("#customers th"));
        System.out.println("Amount of columns = "+columns.size());

        // find locator for the row3
        WebElement tr3 = wd.findElement(By.cssSelector("#customers tr:nth-child(3)"));
        System.out.println(tr3.getText());

        // find locator for the last column
        wd.findElement(By.cssSelector("#customers tr th:last-child"));
    }

    @AfterMethod
    public void postCondition(){
        wd.quit();
    }


}
