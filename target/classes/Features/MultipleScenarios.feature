Feature: I am first feature of this fileBackground
Background: 
	Given Open "Chrome" browser
Scenario: scenario from first feature
	Given user is inside first feature
	Then print user name
@smoke @sanity
Scenario: Second feature from this file
	Given user is inside next feature
	Then print user name
@sanity	
Scenario: Third from this feature
	Given user is inside third scenario
	Then print user name