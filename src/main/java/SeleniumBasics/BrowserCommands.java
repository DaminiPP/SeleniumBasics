package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		
		//Launching the browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Damini\\eclipse-workspace\\SeleniumProjects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		
		//Getting the title
		String Title = driver.getTitle();
		int titleLength = Title.length();
		System.out.println("Title of the Page " + Title);
		System.out.println("Length of the Title " + titleLength);

		//Getting the Title and comparing
		String CurrentURL = driver.getCurrentUrl();
		System.out.println("Printing Current URL " +CurrentURL);
		String ExpectedURL = "https://demoqa.com/";
		if (CurrentURL.equals(ExpectedURL)) {
			System.out.println("URL is matching");
		} else {
			System.out.println("URL is incorrect");
		}
		
		//Getting Page Source
		String PageSource=driver.getPageSource();
		System.out.println("Page Source is "+PageSource);
		System.out.println("Length of the page source is "+PageSource.length());
		
		//closing and quiting the browser

		driver.close();
		driver.quit();
		

       
//		

	}

}
