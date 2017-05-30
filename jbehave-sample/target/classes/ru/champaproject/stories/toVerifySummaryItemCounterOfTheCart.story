Scenario: to verify summary item counter of the cart

Given Go to PDL
When Choose the item and click the "in cart" button
When Choose the second item and click the "in cart" button
Then Go to in the shopping cart
When  Change item quantity
Then The total number of the items equal to the new amount