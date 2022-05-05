package HomeWork.day01_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver test = new ChromeDriver();
        test.get("https://www.google.com");
    }
}
