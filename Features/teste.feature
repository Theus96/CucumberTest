@smokeTest
Feature: To test my cucumber test is running
I want to run a sample feature file.

Scenario Outline: cucumber setup
Given sample feature file is ready
When I run the feature file
Then run should be <pesquisa> successful

Examples:                      		
| pesquisa|	
| "bom"   |
| "sua mamae"|