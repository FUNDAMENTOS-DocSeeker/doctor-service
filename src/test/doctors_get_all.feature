Feature: Obtener Todos los Perfiles de Doctores

Scenario: El usuario solicita la lista de todos los doctores disponibles
Given el servicio de doctores está disponible
When el usuario hace una solicitud para obtener todos los perfiles de doctores
Then se devuelven todos los perfiles de doctores existentes
And la respuesta tiene el código de estado 200