import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumStart {
    WebDriver wd;


    @BeforeMethod
    public void preCondition() {
        System.out.println("Opening web-site");
        wd = new ChromeDriver();
        //    wd.get("https://telranedu.web.app/home");
        // wd.navigate().to("https://telranedu.web.app/home");
        wd.navigate().to("https://telranedu.web.app/login");
        //wd.navigate().forward();
        //  wd.navigate().back();


    }

    @Test
    public void testLogin() {
        System.out.println("Test is over");
        WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());
//HOME WORK 5
        //HOME WORK 6 Locator By.cssSelector
        // HOME WORK 7 Переписать все стратегии из прошлого Д/З на xPath
        // (записать новый результат под старым), сделать для каждого элемента по несколько вариантов

        //Locator By.tagName

        wd.findElement(By.tagName("form"));
        //Locator By.xPath
        wd.findElement(By.xpath("//form"));
        wd.findElement(By.xpath("//div[@class='login_login__3EHKB']/form"));


        //Locator By.cssSelector
        wd.findElement(By.cssSelector("form"));
        //Locator By.xPath
        wd.findElement(By.xpath("//form"));


        //Locator By.className
        wd.findElement(By.className("active"));
        wd.findElement(By.className("navbar-component_nav__1X_4m"));
        wd.findElement(By.className("container"));


        //Locator By.cssSelector
        wd.findElement(By.cssSelector(".active"));
        wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        wd.findElement(By.cssSelector(".container"));

        //Locator By.xPath
        wd.findElement(By.xpath("//*[@class = 'navbar-component_nav__1X_4m']"));
        wd.findElement(By.xpath("//*[@class = 'container']"));


        //Locator By.id
        wd.findElement(By.id("root"));

        //Locator By.cssSelector
        wd.findElement(By.cssSelector("#root"));


        //Locator By.linkText
        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.linkText("ABOUT"));
        wd.findElement(By.linkText("LOGIN"));

        //Locator By.cssSelector
        wd.findElement(By.cssSelector("[href='/home']"));
        wd.findElement(By.cssSelector("[href='/about']"));
        wd.findElement(By.cssSelector("[href='/login']"));

        //Locator By.partialLinkText
        wd.findElement(By.partialLinkText("H"));
        wd.findElement(By.partialLinkText("AB"));
        wd.findElement(By.partialLinkText("IN"));

        //Locator By.cssSelector
        wd.findElement(By.cssSelector("[href*='home']"));
        wd.findElement(By.cssSelector("[href^='/a']"));
        wd.findElement(By.cssSelector("[href$='in']"));
        //Locator By.xPath
        wd.findElement(By.xpath("//*[starts-with(text(),'HO')]"));


        //Locator By.name

        wd.findElement(By.name("password"));
        wd.findElement(By.name("email"));
        wd.findElement(By.name("login"));


    }

    @AfterMethod
    public void postCondition() {
//wd.close();
        wd.quit();

    }
}
