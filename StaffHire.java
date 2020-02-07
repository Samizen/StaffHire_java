class StaffHire{
    private int vacancyNumber;
    private String designation;
    private String jobType;
    
    /* Creation of parameterized constructor Staffhire with three parameters vacancyNumber, designation and jobType*/
    public StaffHire(int vacancyNumber, String designation, String jobType) {
        this.vacancyNumber = vacancyNumber; 
        /*this keyword used  for all variable because we have used same variable name as parameter and instance variables*/
        this.designation = designation;
        this.jobType = jobType;
    }
    
    /*Creation of accessor (setter and getter) methods for all variables*/
    public void setVacancyNumber(int vacancyNumber) {
        this.vacancyNumber = vacancyNumber;
    }
    
    public int getVacancyNumber() {
        return vacancyNumber;
    }

      public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public String getDesignation() {
        return designation;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }
    
    public String getJobType() {
        return jobType;
    }
    
    /* Display method for the StaffHire class variables - this method will be later inherited by FullTimeStaffHire and PartTimeStaffHire classes*/
    public void display(){
        System.out.println("Vacancy Number: "+ this.getVacancyNumber());
        System.out.println("Designation: "+ this.getDesignation());
        System.out.println("Job Type: "+ this.getJobType());
    }
}