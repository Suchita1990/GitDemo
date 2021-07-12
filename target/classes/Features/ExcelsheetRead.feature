Feature: This Feature will add two numbers and check whether the result is even or odd
Scenario Outline:It will verify if the data addition is even or not
	Given User has two number from <row>
	When  adds given numbers
	Then Result must be Even Number
	
	Examples:
	|row|
	| 1 |
	| 2 |
	| 3 |
	| 4 |
	| 5 |
	| 6 |   