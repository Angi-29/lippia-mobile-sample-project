Feature: Busqueda de un producto
  Background:
    Given El usuario inicio sesion correctamente en la app

@Demo @BusquedaDeProducto
Scenario: Busqueda exitosa de TV Samsung 50 pulgadas
When busca el producto "tv samsung de 50 pulgadas"
Then se muestran resultados relacionados con "tv samsung de 50 pulgadas"