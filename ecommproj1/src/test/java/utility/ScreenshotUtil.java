package utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {
	public static void captureScreenshot(
            WebDriver driver,
            String screenshotName) {

        try {

            File src =
                    ((TakesScreenshot) driver)
                            .getScreenshotAs(OutputType.FILE);

            File dest =
                    new File("./Screenshots/"
                            + screenshotName + ".png");

            FileUtils.copyFile(src, dest);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
