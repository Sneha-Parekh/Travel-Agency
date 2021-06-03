Feature: Validate details on Confirmation Page


Background:
Given User launches URL
Then User clicks on find flights
Then User Chooses flight
Then User purchases flight


@Smoke
Scenario: Validate Confirmation ID
Then User validates confirmation ID is generated

#Scenario: Validate Status

#Scenario: Validate Amount

#Scenario: Validate Expiration 

#Scenario: Validate Date

#Scenario: Validate User is able to navigate to travel the world link 