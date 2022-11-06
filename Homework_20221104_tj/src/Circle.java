public class Circle implements GetArea,GetPerimetr{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double areaOfFigures() {
        double area = Math.PI * radius*radius;
        return area;
    }

    @Override
    public double perimetrOfFigures() {
        double perimetr = 2*Math.PI * radius;
        return perimetr;
    }
}
