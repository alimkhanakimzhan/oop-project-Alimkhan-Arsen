# oop-project-Alimkhan-Arsen
Creators of the Banking Management System are the students of CS-2006 group, Alimkhan Akimzhan and Abdullin Arsen.
When the program starts, the user selects the login method. If the user logs in as a client, they will have to register by filling in all the columns of the table that will be written to the database. If the user decides to log in as an employee, they will have to enter the login and password of the administrators account (login: admin, password: admin). The client has functions such as checking the balance, performing transactions (credit, deposit, payment) and viewing the transaction history. The employee can view the table of all bank customers and the sum of all customers' balances.\n

Classes: 12 (1 interface)\n
DBConnection: connecting database\n
Application: menu and methods\n
Registration: customer registration\n
Customer: customer, subclass of Person\n
Employee: employee, subclass of Person\n
Person: superclass\n
Credit: make transaction - credit, subclass of Transation\n
Deposit: make transaction - deposit, subclass of Transation\n
Payment: make transaction - payment, subclass of Transation\n
Transation: superclass\n
IntTransaction: interface for transactions classes\n
Test: class with the main method\n
