# Factory Design Pattern

The Factory Design Pattern is a creational design pattern used when creating objects without exposing the instantiation logic to the client. 
It is particularly useful when dealing with complex object creation, providing flexibility and encapsulation.

## Use case
1.  Database Connection Factory
    - Suppose an application needs to connect to different databases (PostgreSQL, MySQL, MongoDB) based on configuration.
    -   A Factory Pattern can return the appropriate database connection object without exposing the instantiation logic.
2. Logging Framework
3. Cloud Storage Service Selection
   - A system uploads files to S3, FSx, or Azure Blob Storage based on user configuration.
   - A Factory can create an instance of the required cloud storage handler dynamically.
4. Payment Processing System
   - Different payment gateways (PayPal, Stripe, Razorpay) require different APIs.
   - A factory can return the appropriate PaymentProcessor based on the payment method selected by the user.
