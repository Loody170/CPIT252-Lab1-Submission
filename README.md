# CPIT252-Lab1-Submission
Deliverables for lab 1 

Q1: How would you fix this code to print the correct total quanitity, 3?
A1: By adding the key word "static" to the quantity variable in the Product class. 
                          "private static int quantity;"
This makes the variable as a class variable and makes it shared between all class objects.

Q2: Complete the following unit test for the preveious problem to ensure that the code always returns the correct quantity.
A2: tested with a pass result and screenshot is in repository. 

Q3: The Product class should not be instantiated directed as in the first line in the main method above. Change the Product class, so only concrete classes should be instantiated. What changes would you make?
A3: Change the Product class to abstract, this makes it unable to make any objects from this class.

Q4: Change the main class to utilize the use of Polymorphism and iterate through an array of Products using the enhanced for statement (a.k.a For-Each Loop)?
A4: Done and changed in the attached code.

Q5: Question: What would you do to prevent subclasses from overriding the addToShoppingCart() method of the Product class without changing its visibility?
A5: add the word "final" to the method header like this " public final void addToShoppingCart()" so this way no class can override it.

Q6: Why is this considered bad? How would you fix it?
A6: because this makes the Product class do too much work and outside of its purpose, the orderId and orderStatus are not related to the product and should be in its own class.

Q7: Why is this considered bad? How would you fix it?
A7: Because the puplic visibility leaks the data and makes it accessable to everyone, what we should do is change it to protected so only the children classes can access them.






