import java.util.Comparator;

public class CompareEmployeeBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary() - o2.getSalary();
        //Integer.compare(o1.getSalary(), o2.getSalary());
    }
}
