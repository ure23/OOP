
class Staff extends Person{
    private String School;
    private double Salary;

    public Staff(String Name, String Address, String School, double Salary){
        this.Name = Name;
        this.Address = Address;
        this.School = School;
        this.Salary	= Salary;
    }
    public void setSchool(String School){
        this.School = School;
    }
    public void setSalary(double Salary){
        this.Salary = Salary;
    }
    public String getSchool(){
        return School;
    }
    public double getSalary(){
        return Salary;
    }
    public String toString(){
        return "Hello I am " + Name + " and " + "I lived in " + Address + ". I am working at " + School + " with a salary of "+ String.format("%.2f", Salary) + ".";
}}