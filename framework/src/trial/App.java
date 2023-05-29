package trial;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class App {
		public static void main(String[] args) throws Exception
		{
				System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				WebElement ele = driver.findElement(By.id("pass"));
				Thread.sleep(2000);
				int h = ele.getSize().getHeight();
				System.out.println(h);
			   int w = ele.getSize().getWidth();
				System.out.println(w);
		}

			   

	}


