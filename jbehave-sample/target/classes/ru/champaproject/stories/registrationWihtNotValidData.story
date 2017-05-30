Scenario: to verify registration with not valid data (using spec symbols like !@#$%^&*)

Given Click the "autorization" button in MainPage
And Click the "registration" button in popup
When Enter not valid data in fields
When Click the "registration" button on the RegistrationPage
Then The screen displays error data input