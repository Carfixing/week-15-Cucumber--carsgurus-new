Feature: Search functionality
  As I User I should able to use search functionality

  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Search Cars’ link
    Then I navigate to "new and used car search" page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make          | model       | location            | price       |
      | BMW           | 125i        | NSW - South Coast   | $60,000     |
      | Mercedes-Benz | A250        | NSW - New England   | $70,000     |
      | Audi          | A5          | NSW - Newcastle     | $50,000     |
      | Kia           | Optima      | NSW - All           | $45,000     |
      | Bentley       | Continental | Any Location        | Price (max) |
      | Kia           | Optima      | NSW - All           | $45,000     |
      | Jaguar        | XE          | NSW - Central Coast | $90,000     |
  @smoke
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click 'Used' link
    Then I navigate to "used cars for sale" page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results

    Examples:
      | make       | model     | location     | price   |
      | Suzuki     | Carry     | Any Location | $35,000 |
      | Jeep       | Commander | Any Location | $45,000 |
      | Kia        | Cerato    | Any Location | $45,000 |
      | Mitsubishi | D50       | Any Location | $60,000 |
      | Hyundai    | Coupe     | Any Location | $25,000 |


