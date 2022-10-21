public class Main {
    public static void main(String[] args) {

        /*
        Создать класс Employee со следующими переменными:
        private int id;
        private String firstName;
        private String lastName;
        private int age;
        private String gender;
        private String position;
        Класс должен содержать конструктор, геттеры, сеттеры ,метод toString
        а также метод  public String getFullName().

        Создать и вывести на экран несколько обьектов этого класса
         */

        Employee [] employees = {
                new Employee(1,"Jack","Nikolson",65,"m","best"),
                new Employee(2, "Nick", "Jackson",50,"m","middle"),
                new Employee(3,"Lara","Fabian",41,"f","best"),
                new Employee(4,"Mickael","Liberman",23,"m","junior")
        };
        for (Employee e:employees){
            System.out.println(e);
        }

        System.out.println("---------------------");

        for (Employee e:employees){
            System.out.println(e.getFullName());
        }
    }
}