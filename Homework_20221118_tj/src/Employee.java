public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int age;
    private int salary;

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee " + id +", name - " + name + ", age - " + age + ", salary - " + salary + System.lineSeparator() ;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getId() - o.getId();
    }
}
