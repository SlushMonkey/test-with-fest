Lifecycle:
Before:
Given a working frameFixture
After:
Given clean up


Scenario: Celsius conversion
Given a Celsius temperature of 0
When I convert to Fahrenheit
Then I get a temperature of 32 Fahrenheit