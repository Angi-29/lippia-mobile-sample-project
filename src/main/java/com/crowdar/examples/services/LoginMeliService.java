package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginMeliConstants;
import org.openqa.selenium.By;


public class LoginMeliService {
    public static void validarPantallaInicial() {

        MobileActionManager.waitVisibility(LoginMeliConstants.BTN_INICIAR_SESION);
    }

    public static void clicBtn(String btnName) {
        switch (btnName) {
            case "Iniciar sesion":
                MobileActionManager.click(LoginMeliConstants.BTN_INICIAR_SESION);
                break;
            case "op2":
                // secuencia de sentencias.
                break;
            case "op3":
                // secuencia de sentencias.
                break;
            default:
                // Default secuencia de sentencias.
        }
    }

    public static void sendEmailLogin(String email) {

        MobileActionManager.waitClickable(LoginMeliConstants.TXT_EMAIL_LOGIN);
        MobileActionManager.setInput(LoginMeliConstants.TXT_EMAIL_LOGIN,email);
    }
}
