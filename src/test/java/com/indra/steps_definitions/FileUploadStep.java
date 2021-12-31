package com.indra.steps_definitions;

import com.indra.actions.FileUploadActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class FileUploadStep {
    @Managed
    WebDriver driver;
    FileUploadActions fileUploadActions = new FileUploadActions(driver);

    @Given("^el usuario esta en la pagina de inicio$")
    public void elusuarioestaenlapaginadeinicio() {
        fileUploadActions.open();
    }

    @When("^el sistema carga un archivo$")
    public void elsistemacargaunarchivo() {
        fileUploadActions.SubirArchivos();
        fileUploadActions.BtnEnviarAchivos();
    }

    @Then("^el sistema deberia alertar con un mensaje de confirmacion si quiere cargar el archivo$")
    public void elsistemadeberiaalertarconunmensajedeconfirmacionsiquierecargarelarchivo() {
    }
}
