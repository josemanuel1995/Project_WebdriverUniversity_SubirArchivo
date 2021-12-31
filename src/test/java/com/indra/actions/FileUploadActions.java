package com.indra.actions;

import com.indra.pages.FileUploadPage;
import net.thucydides.core.annotations.DefaultUrl;
import org.assertj.core.matcher.AssertionMatcher;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://webdriveruniversity.com/")
public class FileUploadActions extends FileUploadPage {

    public FileUploadActions (WebDriver driver) {
        super(driver);
    }

    public void BtnEnviarAchivos(){
        getBtnEnviarAchivos().click();
        Assert.assertEquals("",getAlert().getText(),"Your file has now been uploaded!");
    }

    public void SubirArchivos(){
        getSubirArchivos().sendKeys("C:\\Users\\SoporteTI\\Documents\\imagen.jpg");
    }

}
