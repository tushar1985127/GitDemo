package pack1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoonaPix1 {
	public static WebDriver driver;
	  public static String url;
	

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		url="http://www.loonapix.com/framer/1282-photo_frame_with_princess_rapunzel/";
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Browserexe\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		
		//driver.findElement(By.xpath(".//*[@id='upload_file']")).sendKeys("D:\\Images\\c.jpg");
		//As the Browser button is disable after click so manually click the browser button and then try to upload the file
		

		//Process process=new ProcessBuilder("C:\\Users\\hp\\workspace\\UploadFile\\src\\test\\java\\AutoIT.au3.exe","D:\\Images\\c.jpg","Open").start();
		
		Process process=new ProcessBuilder("C:\\Users\\hp\\workspace\\UploadFile\\src\\test\\java\\AutoIT.au3.exe","D:\\Images\\c.jpg","File Upload").start();

	}

}
