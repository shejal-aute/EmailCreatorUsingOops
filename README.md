# EmailCreatorUsingOops
# Project Description
The "Employee Email Generator" is a Java application designed to streamline the process of creating email accounts for new employees within an organization. 
It embodies fundamental Object-Oriented Programming (OOP) principles, making the code modular, organized, and easy to maintain.
This lightweight command-line tool takes input for an employee's first name and last name and generates a company email address with an associated department code. It provides a convenient way to create standardized email addresses with random passwords for new employees.

# Object-Oriented Programming Properties Present:
Encapsulation: The code uses encapsulation to protect the internal state of the Email class by making its fields private and providing public methods to access and modify these fields. For example, setMailboxCapacity(), setAlternateEmail(), and changePassword() methods allow controlled access to certain properties.

Abstraction: The Email class abstracts the concept of an email account, providing a high-level interface to interact with email-related functionalities. Users of this class don't need to understand the internal implementation details to use it effectively.

Inheritance (Potential Extension): While not currently demonstrated in the provided code, you can extend this project to implement inheritance. For example, you could create subclasses for different types of employees, each with specialized behavior while inheriting common properties and methods from a base Employee class.

Polymorphism (Potential Extension): The project can be extended to implement polymorphism by allowing different methods of handling emails or different ways to generate passwords. This could be achieved by defining interfaces or abstract classes for email handling and password generation and having multiple implementations.

# Features:
Interactive command-line interface for setting up new employee email accounts.
Allows employees to choose their department and generates email addresses accordingly.
Generates strong random passwords for email account security.
Provides options to customize mailbox capacity and set alternate email addresses.
The "Employee Email Generator" exemplifies OOP principles by encapsulating email account details, abstracting email-related functionality, and providing potential for future extensions through inheritance and polymorphism.
