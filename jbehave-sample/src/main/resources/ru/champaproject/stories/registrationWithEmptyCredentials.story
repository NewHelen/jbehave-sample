Scenario: to verify registration with empty credentials

Given Click the "autorization" button in MainPage
And Click the "registration" button in popup
When Click the "registration" button on the RegistrationPage
Then The screen displays error no data input
