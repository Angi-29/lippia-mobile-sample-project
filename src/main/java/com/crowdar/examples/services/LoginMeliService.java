package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginMeliConstants;
import com.crowdar.examples.utils.user;


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

    public static void sendEmailLogin(String email, String pas) {
        String auxEmail ="TESTUSER450396697";// user.variableEntorno(email);
        String auxPass = "QZb9VY6okr";// user.variableEntorno(pas);

        MobileActionManager.waitClickable(LoginMeliConstants.TXT_EMAIL_LOGIN);
        MobileActionManager.setInput(LoginMeliConstants.TXT_EMAIL_LOGIN, auxEmail);

        MobileActionManager.waitVisibility(LoginMeliConstants.BTN_SIGUIENTE).click();
        //Parte manual para desactivar los captcha de meli
        user.sleepcaptcha(10);
        MobileActionManager.waitClickable(LoginMeliConstants.TXT_PASSW_LOGIN);
        MobileActionManager.setInput(LoginMeliConstants.TXT_PASS_LOGIN, auxPass);

        MobileActionManager.waitVisibility(LoginMeliConstants.BOTON_LOGIN).click();

    }

    public static void validarUbicacionHome() {
        MobileActionManager.waitVisibility(LoginMeliConstants.VALIDAR_UBICACION);
    }
}
