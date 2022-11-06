public class Rectangle implements GetArea,GetPerimetr{
    private double hight;
    private double wight;

    public Rectangle(double hight, double wight) {
        this.hight = hight;
        this.wight = wight;
    }

    @Override
    public double areaOfFigures() {
        double area = hight*wight;

        return area;
    }

    @Override
    public double perimetrOfFigures() {
        double perimetr = 2*hight + 2*wight;
        return perimetr;
    }
}
