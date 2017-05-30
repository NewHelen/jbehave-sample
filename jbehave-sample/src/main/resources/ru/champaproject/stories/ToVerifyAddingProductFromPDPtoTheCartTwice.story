Scenario: to verify adding product from PDP to the cart twice


Given Go to PDP
Check current item quantity in the cart
And Click 'Add to cart' button
When Click 'Add to cart' button again
Then Check current item quantity was updated
//Then Mini cart was updated with one item more