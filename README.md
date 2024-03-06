## D287 – JAVA FRAMEWORKS
## Documentation for Code Changes C to J

#### Part C: 
**mainscreen.html**
* Line 14: Updated Title to "Shop Flower Knows"
* Lines 15 - 21: Added style formatting
  * Line 17: Added front: Courier New, Courier, monospace
  * Line 18: Added font color - #6f5353
  * Line 19: Added background color - #ffebef;
* Line 26: Changed H1 to "Flower Knows Cosmetics"

Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

_Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required._

#### Part D:
* Created a new html template called "about.html" in src > main > resources > templates
* **about.html**
  * Lines 4 - 6: Added Required meta tags
  * Lines 8 - 10: Added Bootstrap CSS
  * Lines 12 - 29: Formatting
    * Line 12: Changed title to "About Flower Knows"
    * Line 15: Added front - Courier New, Courier, monospace
    * Line 16: Added background color - #ffebef
    * Line 17: Added font color - #6f5353 
    * Line 20: Added header background color - #ffd2db 
    * Line 21: Added header padding 1em 
    * Line 22: Added header text alignment - center 
    * Line 25: Added container max width - 800px 
    * Line 26: Added container margin - auto 
    * Line 27: Added container padding - 20px
  * Lines 32 - 42: Company information container 
    * Line 34: Changed H1 to “About Us” 
    * Line 37 - 39: Added company information
    * Line 40: Added Home button 


* Created new controller file named "AboutUsController.java" in src > main > java > com.example.demo > controllers
  * **AboutUsController.java**
    * Line 7: added @Controller 
    * Line 9: added @GetMapping("/about") to specify URL path 
    * Line 11: return template for about page


* **mainscreen.html**
  * Line 27: Added button that takes user to about page

Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

#### Part E:
**BootStrapData.java** (src > main > java > com.example.demo > bootstrap > BootStrapData)
* Line 70: Added if statement to only populate if list is 0
* Line 71 - 115: Added parts with respective company name, part name, inventory, price, and ID
* Line 117 - 127: Added products with respective product name, price, and inventory

Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

_Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part._

#### Part F:

* Created controller filed called **"BuyNowControlller.java"** in src > main > java > com.example.demo > controllers
* Created new HTML file called **"confirmationbuyproduct.html"** in src > main > resources > templates
* Created new HTML file called **"failurebuyproduct.html"** in src > main > resources > templates

**mainscreen.html**
* Line 91: Added "Buy Now" button in front of "Update" & "Delete"

**ProductServiceImpl.java**
* Line 68 - 80: Created & defined a new method function that decrements the inventory every time there is a purchase

**ProductService.java**
* Line 20: Implement the function from ProductServiceImpl.java

**confirmationbuyproduct.html**
* Line 5: Changed title to "Purchase Confirmation"
* Line 8: Added confirmation message
* Line 9 - 10: Link to return back to mainscreen

**failurebuyproduct.html**
* Line 5: Changed title to "Failed Purchase"
* Line 8: Added failed message
* Line 9 - 10: Link to return back to mainscreen

**BuyNowController.java**
* Line 19 - 43: Created code to redirect to the different html pages created 


Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
* The “Buy Now” button must be next to the buttons that update and delete products.
* The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
* Display a message that indicates the success or failure of a purchase.

#### Part G:
Modify the parts to track maximum and minimum inventory by doing the following:
* Add additional fields to the part entity for maximum and minimum inventory.
* Modify the sample inventory to include the maximum and minimum fields.
* Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
* Rename the file the persistent storage is saved to.
* Modify the code to enforce that the inventory is between or at the minimum and maximum value.

#### Part H:
Add validation for between or at the maximum and minimum fields. The validation must include the following:
* Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
* Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
* Display error messages when adding and updating parts if the inventory is greater than the maximum.

#### Part I:
Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

#### Part J:
Remove the class files for any unused validators in order to clean your code.
