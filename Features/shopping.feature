Feature: Valid user can purchase the men jacket from eCommarce website


Description: "Online user can register luma eCommerce website to purchase"
             "return,deliver,exchange,clearence, sale etc"
   
@Sanity   
 Scenario Outline: User can login the application wtth valid credential and purchase the specific mens jacket


 Given user already login the application and verify the login info in the landing page
 When user should be able to <specific> jacket from men module
 And user verify the jacket name on the <specific> list
 And user should be able to select the <size> and <color> and <quantity> and click on the add to cart
 And user able to click on the cart and checkout
 And user able to enter the shopping details and click on the next
 And user able to verify the shippinig address and place the order
 Then user should be able to verify the order number and get text on the screen "Thank you for your purchase !" 

Examples:  
   
                   | specific  | size | color | quantity |  
   |Jupiter All-Weather Trainer|   M  | Blue  |     1    |