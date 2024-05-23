Feature: handling the api
  Scenario: get the price of GBP
  Given Hit the api with get option
  Then print the response
  Then print the price of the GBP