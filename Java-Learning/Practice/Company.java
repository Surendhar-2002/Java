package Practice;

 class Employee {
    private String name;
    private int salary;

    public Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getSalary() {
//        return salary;
//    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String  getDetails(){
        return "Name: "+name+" Salary: "+salary;
    }
 
}

class Manager extends Employee{
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public String getDetails(){
        return super.getDetails()+" Department: "+department;
    }
    

}

class Developer extends Employee{
    private String language;

     public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Developer(String name, int salary,String language) {
        super(name,salary);
        this.language = language;
    }

    @Override
    public String getDetails(){
        return super.getDetails()+" Language: "+language;
    }

    
}

public class Company{
    public static void main(String[] args) {

        Manager m=new Manager("Suri", 1000, "HR");
        Developer d = new Developer("rohit",2000,"Java");

        System.out.println(m.getDetails());
        System.out.println(d.getDetails());
        System.out.println(d.getName());

    }
}
