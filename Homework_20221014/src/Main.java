public class Main {
    public static void main(String[] args) {

        // Создать класс "Employee", имеющий:
        // - конструктор, который принимает переменные salary, number of  employee's working hours в качестве параметров
        // - следующие методы: addSalary() , который добавляет 10 евро к зврплате сотрудника если она меньше 500
        // и addWork() , добавляющий 5 евро к зарплате сотрудника если количество часов  больше 6.
        // Создать несколько сотрудников и применить к ним методы


        System.out.println("--------------------Level 1 ------------------------------");
        Employee p1 = new Employee("Ivan", "Ivanov", 499.5,7);
        Employee p2 = new Employee("Petr","Petrov", 510,5);
        System.out.println(p1.firstName + " " + p1.lastName + " salary is " + p1.addSalary() + " and, else hours of work bigest than 6 hours., salary is " + p1.addWork());
        System.out.println(p2.firstName + " " + p2.lastName + " salary is " + p2.addSalary() + " and, else hours of work bigest than 6 hours, salary is " + p2.addWork());

        // Создать метод, вычисляющий индекс массы тела (BMI)  и  печатающий результат:
        // Метод использует вес в килограммах и рост в метрах.  .
        // Метод должен быть в классе Body и выодить следующее сообщение:
        //"Underweight" если BMI  меньше 18.5
        // "Normal" if 18.5<=BMI<25
        // "Overweight" 25<=BMI<30
        // Obese  BMI>=30
        // формула для расчета BMI = weight/height*height

        //вес и рост передаются через конструктор

        System.out.println("");
        System.out.println("--------------------Level 2 ------------------------------");
        Body b1 = new Body(120,1.805);
        Body b2 = new Body(90,1.74);
        Body b3 = new Body(50,1.82);
        Body b4 =new Body(70,1.70);

        System.out.println(b1.bodyMassIndex());
        System.out.println(b2.bodyMassIndex());
        System.out.println(b3.bodyMassIndex());
        System.out.println(b4.bodyMassIndex());

    }
}