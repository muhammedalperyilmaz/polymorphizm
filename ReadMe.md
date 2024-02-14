# House Hierarchy
* This project illustrates a simple hierarchy of house types, including Apartment, Detached House, and Villa, all inheriting from the base class House. Each type of house has specific characteristics such as rent, square meters, facade, and house type.

## Classes
### 1. House
  *  The base class House serves as a template for specific house types. It contains methods that can be overridden by the derived classes.
### 2. Apartment
* The Apartment class is a specific type of house that extends the House class. It overrides methods to provide specific details for apartments.
###  3. Detached House
* The DetachedHouse class is another specific type of house extending the House class. It provides details specific to detached houses.
###  4. Villa
*  The Villa class is another specific type of house extending the House class, providing details specific to villas.
###  5. Main
* The Main class demonstrates the usage of the house hierarchy by creating instances of different house types and iterating through them.

 ## Output
* The output of the Main class will display the details of each house type, including house type, rent, facade, and square meters.