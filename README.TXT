Program 
The program should consist of the following classes (with no additional attributes or
methods).
1. The StaffHire class has three attributes, which correspond to the Vacancy
number, Designation and Job Type (Job Type indicates part time or full time job).
The Designation and Job Type are represented as a string of text and vacancy
number as a number. The vacancy number, designation and Job Type are
initialized in the constructor by being assigned the value of the constructor's
parameters.
Each attribute has a corresponding accessor method(i.e. getter and setter
methods for all attributes).
A display method will output (suitably annotated) the vacancy number,
designation and job type.

2. The FullTimeStaffHire class is a subclass of the StaffHire class and has seven
attributes:
salary - a whole number
workingHour - a whole number
staffName - a string of characters
joiningDate - a string of characters
qualification - a string of characters
appointedBy - a string of characters
joined - either true or false (boolean)
The constructor accepts five parameters, which are the vacancy number,
designation, job type, salary and working hours (hours per day). A call is made to
the superclass constructor with three parameters, the vacancy number,
designation and job type. The salary and working hours attributes are assigned
the corresponding parameter values. Additionally, in the constructor, assign staff
name, joining date, qualification and appointed by as an empty string, joined
status is initialized to false.
Each attribute has a corresponding accessor method.
5
A method is required to set the salary as changes to salary inevitably occur. The
method accepts a new salary as a parameter and, if the staff has not joined yet,
the new value is assigned to the salary attribute. If the staff is already appointed,
then a suitable message is output to the user indicating that it is therefore not
possible to change the salary.
A method is required to set the working hour as changes to new working hour.
The method accepts a new working hour as a parameter and assigns the new
value to the working hour attribute.
There is a method to hire full time staff for the organization. The method accepts
staff name, joining date, qualification and appointed by. If the Staff is already
appointed, an appropriate message including the staff name and join date are
displayed. If the staff has not joined, the staff name, join date, qualification,
appointed by are required to update by the parameter values input to the method
and the joining status of the staff is changed to true.
A method to display the details of the staff is required. It must have the same
signature as the display method in the StaffHire class. It will call the method in
StaffHire class to display the vacancy number, designation and job type. If the
staff has joined then staff name, salary, working hour, joining date, qualification
and appointed by should also be displayed. Each output must be suitably
annotated.

3. The PartTimeStaffHire class is also a subclass of the StaffHire class and it has
nine attributes:
workingHour - a whole number
wagesPerHour -a whole number
staffName - a string of characters
joiningDate - a string of characters
qualification - a string of characters
appointedBy - a string of characters
shifts - a string of characters
joined - either true or false (boolean)
terminated - either true or false (boolean)
The constructor accepts six parameters, which are the vacancy number,
designation, job type, working hours (hours per day), wages per hour and shifts
(morning, day or evening working shifts). A call is made to the superclass
constructor with three parameters, the vacancy number, designation and job
type. The working hours, wages per hour and shifts attributes are assigned the
6
corresponding parameter values. Additionally, in the constructor, assign staff
name, joining date, qualification and appointed by as an empty string, joined and
terminated status is initialized to false.
Each attribute has a corresponding accessor method.
A method is required to set the working shifts as changes to shifts inevitably
occur. The method accepts a new shifts as a parameter and assigns the new
value to the shifts attribute. If the staff is already hire, method does not allow to
set new shifts.
There is a method to hire part time staff for the organization. The method accepts
staff name, joining date, qualification and appointed by. If the Staff is already
appointed, an appropriate message including the staff name and join date are
displayed. If the staff has not joined, the staff name, join date, qualification,
appointed by are required to update by the parameter values input to the method
and the joining status of the staff is changed to true and termination status of the
staff is changed to false.
There is a method to terminate the staff. If the staff is already terminated, a
suitable message is displayed. Else, staff name, join date, qualification,
appointed by are set to an empty string. Similarly, the joined status is set to false
while the terminated status is changed to true.
A method to display the details of the part time staff is required. It must have the
same signature as the display method in the StaffHire class. It will call the
method in StaffHire class to display the vacancy number, designation and job
type. If the staff has joined then staff name, wages per hour, working hour, join
date, qualification, appointed by and income per day should also be displayed.
Income per day is the product of wages per hour and working hour per day. Each
output must be suitably annotated.