package edgeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Barclays {

    public static void main(String[] args) {
        String baseUrl = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(title.length());
        System.out.println(title.hashCode());

        driver.close();
    }
}
