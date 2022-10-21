public class Body {
    double weight;
    double height;

    public Body(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public String bodyMassIndex() {
        double i = weight / (height * height);
        String res = " ";
        if (i < 18.5) {
            res = "Underweight";
        }
        if (i >= 18.5 && i < 25) {
            res ="Normal";
        }
        if (i >= 25 && i < 30) {
            res = "Overweight";
        }
        if (i > 30) {
            res = "Obese";
        }
        return res;
    }
}
