package tests.base;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class CustomListens implements ITestListener {
    @Override
    public void onTestFailure(ITestResult iTestResult){
        String methodName = iTestResult.getName().trim();
        ITestContext context = iTestResult.getTestContext();
        WebDriver driver = (WebDriver) context.getAttribute("driver");
        theScreen(methodName, driver);


    }
    public void theScreen (String methodName, WebDriver driver){
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File(methodName + ".jpg"));
        } catch (IOException e){
            e.printStackTrace();
        }


    }

}
