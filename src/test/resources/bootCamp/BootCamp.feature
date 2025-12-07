@prueba1
Feature: ingrersar y levantar la aplicacion Yape

  Background:
   Given levantar el app de yape

    Scenario: seleccionar el boton crear una cuenta

      Given verifico que el app este disponible
      When seleccciono el boton "crar  una cuetna"
      Then verifo el formulario para crar una cuetna.