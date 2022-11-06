public class Main {
    public static void main(String[] args) {

       /*
        создать классы,
        содержащие методы для подсчета площади и периметра rectangle and circle,
        используя интерфейсы. Создать несколько обьектов этих типов и вывести  на экран
         их площадь и периметр

        */

        GetArea circle1= new Circle(10);
        System.out.println(circle1.areaOfFigures());
        GetArea rectangle1 = new Rectangle(5,8.6);
        System.out.println(rectangle1.areaOfFigures());
        GetPerimetr rectangle2 = new Rectangle(3.5,6.5);
        System.out.println(rectangle2.perimetrOfFigures());
        GetPerimetr circle2 = new Circle(2.5);
        System.out.println(circle2.perimetrOfFigures());

    }
}