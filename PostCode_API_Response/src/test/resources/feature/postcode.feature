Feature: Query a postocode and receive a 200 response

@postcode1
Scenario: Receive 200 response when using postcode api
When I send a get request to api.postcodes.io./postcodes/SW1P4JA
Then receive 200 response