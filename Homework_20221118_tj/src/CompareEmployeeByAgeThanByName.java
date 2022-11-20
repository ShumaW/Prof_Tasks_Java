import java.util.Comparator;

public class CompareEmployeeByAgeThanByName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getAge() != o2.getAge()) {
            return o1.getAge() - o2.getAge();
        } else {
            return o1.getName().compareTo(o2.getName());
        }

    }
}
