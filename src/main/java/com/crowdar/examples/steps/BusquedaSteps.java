package com.crowdar.examples.steps;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.BusquedaConstants;
import com.crowdar.examples.constants.LoginMeliConstants;
import com.crowdar.examples.services.BusquedaService;
import com.crowdar.examples.services.LoginMeliService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BusquedaSteps {
    @Given("El usuario inicio sesion correctamente en la app")
    public void elUsuarioInicioSesionCorrectamente() {
        LoginMeliService.validarPantallaInicial();
        LoginMeliService.clicBtn("Iniciar sesion");
        LoginMeliService.sendEmailLogin("MELIUSER", "MELIPASS");
        LoginMeliService.validarUbicacionHome();
    }


    @When("busca el producto {string}")
    public void buscaElProducto(String prod) {
        BusquedaService.buscarProducto(prod);
    }
}
