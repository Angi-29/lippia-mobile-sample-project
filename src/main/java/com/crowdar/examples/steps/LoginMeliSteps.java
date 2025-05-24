package com.crowdar.examples.steps;

import com.crowdar.examples.services.LoginMeliService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginMeliSteps {

    @Given("El usuario esta en la pantalla inicial de la app")
    public void elUsuarioEstaEnLaPantallaInicialDeLaApp() {
        LoginMeliService.validarPantallaInicial();
    }

    @When("El usuario presiona el boton {string}")
    public void elUsuarioPresionaElBoton(String btnName) {
        LoginMeliService.clicBtn(btnName);
    }

    @And("Ingresa el email {string} y la contraseña {string}")
    public void ingresaElEmailYLaContraseña(String email, String pss) {
        LoginMeliService.sendEmailLogin(email);
    }
}
