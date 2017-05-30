Scenario: to verify adding item from PDL to the cart by non-registrated user

Given Check items quantity in the cart
And Go to PDL
When Choose the item and click the "in cart" button
Then The screen displays the item in the cart