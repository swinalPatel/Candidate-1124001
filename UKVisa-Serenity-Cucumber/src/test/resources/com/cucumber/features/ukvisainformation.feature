Feature: Confirm whether a visa is required to visit the UK

@JapanStudyVisa
Scenario: UK visa information for Japan Student
Given I provide a nationality of Japan
And I select the reason "Study" 
And I state I am intending to stay for longer than 6 months
When I submit the form
Then I will be informed that "You will need a visa to study in the UK"

@JapanTourismVisa
Scenario: UK visa information for Japan Tourism
Given I provide a nationality of Japan
And I select the reason "Tourism"
When I submit the form
Then I will be informed that "You will not need a visa to come to the UK"
#Then I will be informed that "You will not need a visa to study in the UK"

@RussiaTourismVisa
Scenario: UK visa information for Russia Tourism
Given I provide a nationality of Russia
And I select the reason "Tourism"
And I state No I am not travelling or visiting a partner or family
When I submit the form
Then I will be informed that "You will need a visa to come to the UK"

