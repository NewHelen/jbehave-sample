Scenario: To verify shopping cart items removal

Given Go to PDL
When Choose the item and click the "in cart" button
Then Go to in the shopping cart
When Remove the item
Then The screen displays emply cart