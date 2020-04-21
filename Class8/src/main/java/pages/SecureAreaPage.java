package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver webDriver;
    private By successAlert = By.id("flash");

    public SecureAreaPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public String getSuccessAlertMessage(){
        return webDriver.findElement(successAlert).getText();
    }
}
