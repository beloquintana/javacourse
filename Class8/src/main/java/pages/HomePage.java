package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver webDriver;
    private By dynamicLoadingLink = By.linkText("Dynamic Loading");
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By addAndRemoveElementsLink = By.linkText("Add/Remove Elements");
    private By checkboxesLink = By.linkText("Checkboxes");

    public HomePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public DynamicLoadingPage clickOnDynamicLoadingLink(){
        webDriver.findElement(dynamicLoadingLink).click();
        return new DynamicLoadingPage(webDriver);
    }

    public LoginPage clickOnFormAuthenticationLink(){
        webDriver.findElement(formAuthenticationLink).click();
        return new LoginPage(webDriver);
    }

    public AddAndRemoveElementsPage clickOnAddAndRemoveElementsLink(){
        webDriver.findElement(addAndRemoveElementsLink).click();
        return new AddAndRemoveElementsPage(webDriver);
    }

    public CheckboxesPage clickOnCheckboxesLink(){
        webDriver.findElement(checkboxesLink).click();
        return new CheckboxesPage(webDriver);
    }

}
