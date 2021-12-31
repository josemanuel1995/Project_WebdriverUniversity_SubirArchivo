package com.indra.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/File-Upload")
public class FileUploadPage extends PageObject {

    public FileUploadPage (WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "myFile")
    private WebElementFacade subirArchivos;

    @FindBy(id = "submit-button")
    private WebElementFacade btnEnviarAchivos;

/****************************************************************************************/

    public WebElementFacade getBtnEnviarAchivos() {
        return btnEnviarAchivos;
    }

    public WebElementFacade getSubirArchivos(){
        return subirArchivos;
    }
}
