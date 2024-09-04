@ArturoCalleHome
Feature: TC-001 - Navegar a la sección de camisas en la página web de Arturo Calle

  Background: El usuario está en la página principal de Arturo Calle
    Given El usuario accede al sitio web

  Scenario: SC-001 - Navegar a la sección de camisas desde la lista de botones
    When El usuario selecciona el botón 'Camisas' de la página principal
    Then El usuario debe ser redirigido a la página de camisas
