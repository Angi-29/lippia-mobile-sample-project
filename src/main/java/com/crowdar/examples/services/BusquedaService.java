package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.BusquedaConstants;
import com.crowdar.examples.constants.LoginMeliConstants;
import com.crowdar.examples.utils.user;

public class BusquedaService {
    public static void buscarProducto(String prod) {
        MobileActionManager.getElement(BusquedaConstants.TXT_BUSQUEDA);
        MobileActionManager.waitClickable(BusquedaConstants.INPUT_BUSQUEDA);
        MobileActionManager.setInput(BusquedaConstants.INPUT_BUSQUEDA, prod);

    }
}
