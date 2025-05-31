Feature: Login en la aplicacion de Mercado Libre

  #@Demo
  Scenario: El usuario inicia sesion correctamente
    Given El usuario esta en la pantalla inicial de la app
    When El usuario presiona el boton "Iniciar sesion"
    And Ingresa el email "MELIUSER" y la contraseña "MELIPASS"
    Then El usuario ve su cuenta activa en la app



