@test
Feature: Adjuntar un Archivo

  Yo como usuario
  Quiero adjuntar un archivo

@Scenario:
Scenario:  Cargar cualquier archivo adjunto
Given el usuario esta en la pagina de inicio
When el sistema carga un archivo
  Then el sistema deberia alertar con un mensaje de confirmacion si quiere cargar el archivo