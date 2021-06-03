Feature: Login Page Validations

Background:
Given User launches URL

Scenario: User able to launch url

Then Travel website is launched


@Functional
Scenario Outline: User enters depature city

Then User enters departure city as <depcity>

Examples:
|depcity|
|Paris|
|Philadelphia|
|Boston|
|Portland|
|San Diego|
|Mexico City|
|São Paolo|



@Functional
Scenario Outline: User enters destination city

Then User enters departure city as <descity>

Examples:
|descity|
|Buenos Aires|
|Rome|
|London|
|Berlin|
|New York|
|Dublin|
|Cairo|



@Smoke
Scenario: User clicks on find flights button

Then User clicks on find flights


