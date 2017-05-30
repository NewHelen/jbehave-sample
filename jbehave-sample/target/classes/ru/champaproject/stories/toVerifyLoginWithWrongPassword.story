Scenario: to verify login with wrong password

Given Click the "autorization" button in MainPage
And Enter the valid email in the "mail" field
When Enter the wrong password in the "passwordl" field
When Click the "sign in" button
Then The screen displays error password