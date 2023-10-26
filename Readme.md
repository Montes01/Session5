**- Lista de tareas para la seccion 5 de wordskills 09 -**
-----------------------------------------------------------

0. *Create database structure* ✅
    You are going to create the database structure with the SQL given


1.  *Importing data into database* 🤔
    You are expected to use the dataset provided in “Session5-Data.xls”. Before submitting your deliverables, please
    make sure that there have not been any changes made to the records in the database. In case you have changed
    any data for any reason, you are expected to restore the original dataset provided.

2.  *Login form* ✅
    This is the initial form when opening the software. The client may login to the system if they have been
    registered in the system previously.

3.  *Addon services menu* 🤔  
    This form is the main screen of this application where the client may view and select a category of the services
    they need and proceed to reserve their desired service. Here is a brief description of the characteristics of this
    form:

    - ✅ A welcome message along with the user’s full name and a short message of “Please choose a category:” are placed on top of the form.

    - The list of categories of services are retrieved from the table “ServiceTypes” and made available as clickable menu options or buttons

        ----------

        - The title of the service type is displayed with an icon provided in the “Resources” folder next to it.
        - By clicking on each option, the client can view and customize all the available services for the selected
            category as documented on section 5.6.

        ----------

    - Place a tab bar at the bottom of the screen with the following three options:

        ----------

        - Services: This tab is linked to the services menu form as documented in section 5.5 and is also focused
            when the client is on the service selection form described in section 5.6.

        - Cart: This tab is associated with the cart form as documented on section 5.7.

        - About: This tab is associated with the about form as documented on section 5.8.

        ----------

    - When the client is currently viewing one of the forms linked to each of the options listed above, the
        associated tab becomes focused and the client may not select it. The other two tabs though are available to
        the client for them to switch between different functionalities based on the associated forms. The “Cart” tab
        needs to display the number of orders currently in the cart for the user.

4. *Service selection form*

    - The name of the category or type of services that has been selected is displayed on the very top of the form.

    - The description of the service category is retrieved from the table “ServiceTypes” and displayed before the list of available services.

    - A selectable list or similar is included in the segment that will display the following fields for each service in the category:

        ----------

        - Place the corresponding service category icon for the service which is located on the “Resources” folder on the left.

        - Place the name or title of the service.

        - Place the price for each booking at the end.

        ----------

    - Once the client selects one of the listed services, the following functionalities are made available:

        ----------

        - The title or name of the chosen service is displayed on the form.

        - The description provided on the database for the chosen service is presented to the client.

        - Place a date combo box input for the client to select their desired date to book their service. The client may not choose any date that are not included in “DayOfWeek” and “DayOfMonth” fields as described in the data structure section of this document.

        - Once a date is chosen, the number of remaining spots is calculated and displayed based on previous bookings for the date and the daily cap defined.

        - Place a numeric input box on the form for the client to enter the number of people the booking is going to be made for. The default value for this is retrieved from the database based on the “FamilyCount” field of the account. It goes without saying that the value of this field cannot be less than 1. 

        - Based on the number of people entered and the booking cap defined for the service, the number of bookings that need to be purchased to accommodate the request is calculated and displayed on the form. For example, if the client is requesting a taxi service for 5 people and the booking cap limit for the service is 3 (each taxi can carry 3 people at one time at no extra charge) then you will need 2 bookings to accommodate.

        - Having completed all the requested fields, the client will be able to view the amount payable for the number of bookings that need to be made with 2 decimal points.

        - Place a button with the caption of “Add to cart” that would move the order to the cart and directs the client back to the services menu as documented on section 5.5 taking into account the following condition:

            ~~
            - Having calculated the number of new bookings required and factoring in previous bookings for the service on the selected date, the daily cap needs to be observed.
            ~~

        ----------

    - Place a tab bar at the bottom of the screen with the following three options:

        ----------

        - Services: This tab is linked to the services menu form as documented in section 5.5 and is also focused when the client is on the service selection form described in section 5.6.

        - Cart: This tab is associated with the cart form as documented on section 5.7.

        - About: This tab is associated with the about form as documented on section 5.8.

        ----------
    
    - When the client is currently viewing one of the forms linked to each of the options listed above, the
        associated tab becomes focused and the client may not select it. The other two tabs though are available to
        the client for them to switch between different functionalities based on the associated forms. The “Cart” tab
        needs to display the number of orders currently in the cart for the user.

5. *Shopping cart form*

    - Place the header of the form on the top to read “Cart Checkout”.

    - A list of the reservations present on the cart is displayed to the user in the following manner:

        ----------

        - Place the corresponding service category icon for the service which is located on the “Resources” folder on the left.

        - Place the name or title of the service.

        - Place the amount payable for the booking next to the title.

        - Place the number of people registered and the start and end date of the service taking into account the duration.

        - Place a recycle bin icon to the right of each item which once clicked will remove the booking from the cart. Any removal should immediately affect all related fields in the form.

        ----------

    - Place the total amount payable for the items on the cart with two decimal points at the bottom of the form taking into account the discounts.

    - Place an input box for discount coupons. Once the user submits a discount code, the amount of discount based on the corresponding provided percentage points (“DiscountPercent” field) is calculated against the total payable amount of the cart to be below the maximum allowable discount for the coupon (“MaximumDiscountAmount” field) and displayed instantly under total amount payable. For example lets try the discount coupon is for 10% with maximum discount of 15 dollars where the total payable amount for the cart is 180 dollars. Since the percentile amount (10% * 180) is 18 dollars which is more than the allowable 15 dollars, then only 15 dollars can be deducted from the total and the total amount payable will be 165 dollars.

    - Place a button with the caption of “Proceed to checkout” which will finalize the purchase and store it onto the database. It goes without saying that once the data is saved to the database, the cart is cleared and the client may start over with a new cart. 

    - Place a tab bar at the bottom of the screen with the following three options:

        ----------

        - Services: This tab is linked to the services menu form as documented in section 5.5 and is also focused when the client is on the service selection form described in section 5.6.

        - Cart: This tab is associated with the cart form as documented on section 5.7.

        - About: This tab is associated with the about form as documented on section 5.8.

        ----------

    - When the client is currently viewing one of the forms linked to each of the options listed above, the associated tab becomes focused and the client may not select it. The other two tabs though are available to the client for them to switch between different functionalities based on the associated forms. The “Cart” tab needs to display the number of orders currently in the cart for the user.

6. *About us form*

    - The header should contain the form title of “About Us”

    - The name of the application and the log along with the version number needs to be placed in the middle.

    - Place a tab bar at the bottom of the screen with the following three options:

        ----------

        - Services: This tab is linked to the services menu form as documented in section 5.5 and is also focused when the client is on the service selection form described in section 5.6.

        - Cart: This tab is associated with the cart form as documented on section 5.7.

        - About: This tab is associated with the about form as documented on section 5.8.

        ----------
    
    - When the client is currently viewing one of the forms linked to each of the options listed above, the associated tab becomes focused and the client may not select it. The other two tabs though are available to the client for them to switch between different functionalities based on the associated forms. The “Cart” tab needs to display the number of orders currently in the cart for the user. 

