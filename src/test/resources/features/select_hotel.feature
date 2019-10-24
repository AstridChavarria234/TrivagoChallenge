#Author: astridchavarria253087@correo.itm.edu.co

Feature: Make a hotel reservation
  As a web user
  I want to do reserve a hotel
  to do test using the programming 
  language Cucumber, and Gherkin.
  
  
  Scenario Outline: Successful search for a hotel reservation from the main Trivago website
    Given that Astrid wants to look for a hotel reservation
    When She insert the destination city "<destinationCity>" ,the arrival date "<arrivalDate>" and departure date "<departureDate>"
    And she select type of accommodation
    And she select three hotel service options
    And she print the data cheaper hotel
    Then I verify the see the state of the hotel

Examples:
     |destinationCity|arrivalDate|departureDate|
     |Medellin       |2019-10-28   |2019-10-29 |