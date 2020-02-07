/* FullTimeStaffHire class inherits StaffHire class*/
class FullTimeStaffHire extends StaffHire {
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    
    /* The constructor accepts five parameters, three of which are inherited from StaffHire class*/
    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, int salary, int workingHour) {
        /* Variables vacancyNumber, designation and jobType are inherited from StaffHire class*/
        super(vacancyNumber, designation, jobType);
        /* Setting values for two of FullTimeStaffHire's own variables within the parameterized constructor */
        this.salary = salary;
        this.workingHour = workingHour;
        /* Assigning values to other instance variables of the class */
        staffName = "";
        joiningDate = "";
        qualification = "";
        appointedBy = "";
        joined = false;
    }   
    
    /* Accessor methods for each attribute */
    /* This method also allows to set salary for vacant job and if the job is not vacant then displays
         * a message that the staff has already joined. */
    public int setSalary(int salary) {        
        this.salary = salary;
        if (joined==false){
            this.salary = salary;
            joined = true;
        }
        else{
            System.out.println(this.staffName + " is" +" already appointed.");
            System.out.println();
        }
        return salary;
    }
       
    public int getSalary() {
        return salary;
    }    
    
    /* This method is used to assign new working hour and displays a message if a staff has 
     * already been appointed. */ 
    public int setWorkingHour(int workingHour) {
        if (joined==false){
            this.workingHour = workingHour;
        }else {
            System.out.println(this.staffName + " is" +" already appointed.");
            System.out.println();
        }
        return workingHour;
    }
    
    public int getWorkingHour() {
        return workingHour;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffName() {
        return staffName;
    }
    
    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }
    
    public String getJoiningDate() {
        return joiningDate;
    }   

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    public String getQualification() {
        return qualification;
    }  

    public void setAppointedBy(String appointedBy) {
        this.appointedBy = appointedBy;
    }

    public String getAppointedBy() {
        return appointedBy;
    }

    public void setJoined(boolean joined) {
        this.joined = joined;
    }   
    
    public boolean getJoined() {
        return joined;
    }
    
    
    /* This is the method to hire full time staff for the organization. The method accepts
     * staff name, joining date, qualification and appointed by. If the Staff is already
     * appointed, an appropriate message including the staff name and join date aredisplayed. If 
     * the staff has not joined, the staff name, join date, qualification,appointed by are required
     * to update by the parameter values input to the method and the joining status of the staff is 
     * changed to true. */    
    public void hireFullTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
        if (joined == false){
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
        } else {
            System.out.println(this.getStaffName() + " is " + "already appointed.");
            System.out.println();
        }
    }

    /* This is the method to display the details of the staffs hired full time by the company.
     * It has same signature as the display method in StaffHire. It first calls the method in 
     * StaffHire to display its three attributes: vacancyNumber, designation and jobType. In 
     * addition its own attributes are also displayed if the staff has joined. */
    public void display(){
        if (joined==true){
        /* Calls display() from StaffHire class */
        super.display();
        /* displays its own attributes adding to the ones inherited from StaffHire */
        System.out.println("Staff Name: " + this.getStaffName());
        System.out.println("Salary: " + this.getSalary());
        System.out.println("Working Hour: " + this.getWorkingHour());
        System.out.println("Joining Date: " + this.getJoiningDate());
        System.out.println("Qualification: " + this.getQualification());
        System.out.println("Appointed By: " + this.getAppointedBy());
        System.out.println();
        }
    }
}
