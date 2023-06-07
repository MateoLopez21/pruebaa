Feature: Agregar un nuevo usuario

  Scenario: Agregar un usuario
    Given Un usuario que se encuentran en el apartado recruitment
    When El usuario ingresa credenciales validas
    Then La pagina muestra el usuario agregado en la lista de candidatos
