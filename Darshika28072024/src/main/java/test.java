import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.zeptonow.com/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.zeptonow.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
