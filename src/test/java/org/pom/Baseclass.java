package org.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
public static WebDriver driver;
public static void configBrowser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\MavenFrameWork\\MavenSample\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
}
public static void launchUrl(String url) {
driver.get(url);
}
public static void maximize()
{
driver.manage().window().maximize();
}
public static void type(WebElement element,String data) {
element.sendKeys(data);
}
public static void click(WebElement element)
{
element.click();
}
public static void selectByIndex(WebElement element,int value)
{
	new Select(element).selectByIndex(value);
}

public static void selectByValue(WebElement element,String data) {
new Select(element).selectByValue(data);
}

public static String text(WebElement element) {
String attribute = element.getAttribute("value");
	return  attribute;
}

public static void Browser() {
driver.quit();
}


public static void takeScreenshot(String path) throws IOException {
TakesScreenshot s=(TakesScreenshot) driver;
s.getScreenshotAs(OutputType.FILE);
System.out.println(s);
File source = s.getScreenshotAs(OutputType.FILE);
File destination = new File(System.getProperty("user.dir")+"\\Screenshot\\"+path+".png");
FileUtils.copyFile(source, destination);
}

public static void getAllSelectedOptionsSelectByIndex(WebElement element) {
List<WebElement> allSelectedOptions = new Select(element).getAllSelectedOptions();
for (WebElement all : allSelectedOptions) {
	String name = all.getText();
	System.out.println(name);
	
}
}

public static void getAllSelectedOptionsSelectedByValue(WebElement element) {
	List<WebElement> allSelectedOptions = new Select(element).getAllSelectedOptions();
	for (WebElement all : allSelectedOptions) {
		String name = all.getText();
		System.out.println(name);
		
	}
	}

public static void getAllSelectedOptionsSelectByVisibleText(WebElement element) {
	List<WebElement> allSelectedOptions = new Select(element).getAllSelectedOptions();
	for (WebElement all : allSelectedOptions) {
		String text = all.getText();
		System.out.println(text);
		
	}
	}

public static void getFirstSelectedOptions(WebElement element) {
WebElement firstSelectedOption = new Select(element).getFirstSelectedOption();
String name = firstSelectedOption.getText();
System.out.println(name);
}
	
	
public static void dragAndDrop(WebElement element) {
	new Actions(driver).dragAndDrop(element, element).perform();;
}
public static void clickHoldAndRelease(WebElement element) {
new Actions(driver).clickAndHold(element).moveToElement(element).release().perform();
}

public static void keyDown(WebElement element,CharSequence keys) {
	new Actions(driver).keyDown(element, keys).perform();

}

public static void keyUp(WebElement element,CharSequence keys) {
new Actions(driver).keyUp(element, keys);
}

public static void copyValue(WebElement element) throws AWTException {
new Robot().keyPress(KeyEvent.VK_CONTROL);
new Robot().keyPress(KeyEvent.VK_A);
new Robot().keyRelease(KeyEvent.VK_A);
new Robot().keyPress(KeyEvent.VK_C);
new Robot().keyRelease(KeyEvent.VK_C);
new Robot().keyRelease(KeyEvent.VK_CONTROL);
}



public static void confirmAlertNotOk() {
Alert al= driver.switchTo().alert();
}

public static void conirmAlertOk() {
Alert al=driver.switchTo().alert();
}

public static void promtAlertInsertValues(String data) {
Alert al=driver.switchTo().alert();
al.sendKeys(data);
al.accept();

}
public static void promptAlertGetValues() {
Alert alert=driver.switchTo().alert();
String text = alert.getText();
System.out.println(text);
alert.accept();
}


public static void fileValueAddition(String pathname,String SheetName,int rowno,int cellno,String value) throws IOException {
	File file=new File(pathname);
	FileInputStream stream=new FileInputStream(file);
	Workbook workbook=new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet(SheetName);
	Row row = sheet.getRow(rowno);
	Cell cell = row.getCell(cellno);
	cell.setCellValue(value);
	FileOutputStream output=new FileOutputStream(file);
    workbook.write(output);
}
	
	
}

  
