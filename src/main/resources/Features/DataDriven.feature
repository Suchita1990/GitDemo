Feature: This feature will add two numbers and check whether the result is even or odd
Scenario Outline:I will verify if the data addition is even or not
	Given User has <num1> and <num2>
	When user adds both numbers
	Then addition result must be even

	Examples:
	|num1|num2|
	| 12 | 13 |
	| 22 | 54 |
	| 34 | 53 |
	| 84 | 65 |
	| 72 | 84 |