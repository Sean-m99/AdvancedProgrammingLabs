Exercise 1b: Designing classes
Write a new Java file with a class to represent an employee. This class is to be used for staff managament purposes (e.g. payroll). The class needs to:
• Be called Employee
• Have 4 instance variables: name, ID, salary, department
• Have a constructor that takes 3 parameters to match the instance variables except ID • Have a method (called editName) to modify the employee’s name
Make sure that you use approriate variable types and visibility modifiers.

Exercise 1c: Static
Create a static variable within the Employee class to hold the value of the number of employees created. Each time an Employee instance is created, ID is set according to the value of this variable which is then incremented.
1
Next, create a static method getIDcount() that returns the number of unique IDs that have been assigned to employees.

Exercise 1d: Inheritance
Design a Manager class that inherits Employee. The subclass needs to have an additional instance variable to hold the value of a bonus (surplus to salary). The subclass also needs to have a method (called calcTotalEarnings) to return the total earnings of the manager as the sum of the salary and the bonus. Implement a new constructor that initialises new instances of Manager using the constructor of the superclass. Satisfy yourself that you have edited the approriate methods.

Exercise 1e: Abstract classes
Design an abstract class Person for defining a person with a name. Go back and edit your Employee class to inherit the Person abstract class, and adjust its data members accordingly.

Exercise 1f: Interfaces
Design a new class Invoice to represent an invoice, with instance variables to hold the numerical value of the invoice and a textual description.
Now create an interface Payable that defines a method calcPaymentAmount which returns the value to be paid for a given class the implements the new interface. Make both the Employee and Invoice classes implement this interface, returning the appropriate values (salary and value, respectively).
