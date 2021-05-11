package edgeSelenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class NopCommerce {

    public static void main(String[] args) {

        String baseUrl = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);

        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        driver.close();
    }
}

