@calc1 
Feature: Calculator
  As a user
  I want to use a calculator to add numbers
  So that I don't need to add myself
 
  Scenario Outline: Add two numbers <num1> & <num2>
    Given I have a calculator
    When I add <num1> and <num2>
    Then the result should be <total>
 
  Examples: 
    | num1 	| num2 	| total	|
    | -2	| 3 	| 1L	|
    | 10.0 	| 15 	| 25 	|
    | 99L 	| -99 	| 0 	|
    | -1 	| -10 	| -11 	|