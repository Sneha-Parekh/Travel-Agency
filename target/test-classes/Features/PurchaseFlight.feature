Feature: Validate user is able to enter required details and purchase flight

Background:
Given User launches URL
Then User clicks on find flights
Then User Chooses flight


@Functional
Scenario Outline: User enters required information

Then User Enters <Name><Address><City><State><Zipcode><CardType><CredNum><Month><Year><CardName>

Examples:
|Name|Address|City|State|Zipcode|CardType|CredNum|Month|Year|CardName|
|Sneha P|Abc123|Pune|Mah|1234|Visa|453765876|07|2021|SnehP|

@Smoke
Scenario: User clicks on Purchase filght

Then User purchases flight