

  Feature: saker
    Scenario: hämta personer
      Given the application is running
      When I send request to "/persons"
      Then the response should be a list
