Scenario: to verify checkout with not-filled order details

Given Go to PDL
When Choose the item and click the "in cart" button
Then Go to in the shopping cart
When Click "Continue" button
Then The screen displays errors for mandatory fields