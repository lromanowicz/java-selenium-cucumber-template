Feature: Example Feature
  Scenario: Example scenario
     Given I search for "Super" word

  Scenario Outline: Example scenario with parameters
    Given I search for "<word>" word

    Examples:
      | word     |
      | old word |
      | new word |