public class Employee {
    String firstName;
    String lastName;
    double salary;
    int hoursOfWork;

    public Employee(String firstName, String lastName, double salary, int hoursOfWork){
        this.firstName= firstName;
        this.lastName=lastName;
        this.salary=salary;
        this.hoursOfWork=hoursOfWork;
    }
    public double addSalary(){
        if (salary < 500) {
            salary+=10;
        }
        return salary;
    }

    public double addWork() {
        if (hoursOfWork > 6) {
            salary += 5;
        }
        return salary;
    }
}
