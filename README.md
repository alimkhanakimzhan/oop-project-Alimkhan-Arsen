# oop-project-Alimkhan-Arsen
Creators of the Banking Management System are the students of CS-2006 group, Alimkhan Akimzhan and Abdullin Arsen.

When the program starts, the user selects the login method. If the user logs in as a client, they will have to register by filling in all the columns of the table that will be written to the database. If the user decides to log in as an employee, they will have to enter the login and password of the administrators account (login: admin, password: admin). The client has functions such as checking the balance, performing transactions (credit, deposit, payment) and viewing the transaction history. The employee can view the table of all bank customers and the sum of all customers' balances.

Classes: 12 (1 interface)

DBConnection: connecting database

Application: menu and methods

Registration: customer registration

Customer: customer, subclass of Person

Employee: employee, subclass of Person

Person: superclass

Credit: make transaction - credit, subclass of Transation

Deposit: make transaction - deposit, subclass of Transation

Payment: make transaction - payment, subclass of Transation

Transation: superclass

IntTransaction: interface for transactions classes

Test: class with the main method
