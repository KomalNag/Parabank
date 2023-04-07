package Error;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public void TakeScreenShot(WebDriver driver,String TCID) throws IOException {
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desc=new File("C:\\Users\\Shree\\eclipse-workspace\\MavenDecParabank\\ScreenShot");
		FileHandler.copy(src,desc);
	}

}
