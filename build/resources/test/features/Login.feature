# encoding: iso-8859-1
Feature: Realizar login aplicacion Acme demo
  Como usuario quiero loguearme en la aplicacion y realizar validaciones

  @LoginConduitExitoso
  Scenario: Validar inicio de sesion Conduit
    Given como "usuario" deseo loguearme
    When las credenciales email "prueba@accenture.com" y password "123456"
    Then valido inicio de sesion correcto

  @SinCredencialesLogin
  Scenario: Validar excepciones sin credenciales de logue
    Given como "usuario" deseo loguearme
    When no se ingresan las credenciales
    Then valido la excepcion del email
    And valido la excepcion del password

  @usuarioNoExistente
  Scenario: Validar datos invalidos de un usuario
    Given como "usuario" deseo loguearme
    When las credenciales email "hervin@accenture.com" y password "689865"
    Then Valido mensaje del sistema cuando el usuario es inexistente