import java.util.*;

public class EmployeesMain {
    /*
    Есть класс Employee  с полями  id, name, age, salary.
    Сделать его comparable по id
    сделать дополнительные возможности сортировки по: salary, age, name,
    ageAndThenName если возраст одинаковый
    по имени
    Создать лист таких сотрудников и вывести его на э
    кран отсортированный всеми способами
    Collections.sort
     */
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"John",25,1500));
        employees.add(new Employee(3,"Jack",33,1200));
        employees.add(new Employee(5,"Nick",19,3200));
        employees.add(new Employee(4,"Ann",22,2500));
        employees.add(new Employee(2,"Sem",22,1580));
        System.out.println(employees);
        System.out.println("----------default sort-----------");
        Collections.sort(employees);
        System.out.println(employees);
        System.out.println("----------sort by salary-----------");
        Collections.sort(employees,new CompareEmployeeBySalary());
        System.out.println(employees);
        System.out.println("----------sort by age-----------");
        Collections.sort(employees,new CompareEmployeeByAge());
        System.out.println(employees);
        System.out.println("----------sort by name-----------");
        Collections.sort(employees,new CompareEmployeeByName());
        System.out.println(employees);
        System.out.println("---------- sort by age than by name -----------");
        Collections.sort(employees,new CompareEmployeeByAgeThanByName());
        System.out.println(employees);


    }
}