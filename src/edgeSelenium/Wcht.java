package edgeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Wcht {

    public static void main(String[] args) {
        String baseUrl = "https://www.wcht.org.uk/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get(baseUrl);

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.close();
    }


}
