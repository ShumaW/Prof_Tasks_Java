public class Flower extends PlantGrowable {

    private double height;
    private int age;
    String displayFlowerName;

    public Flower(String displayFlowerName) {
        this.displayFlowerName = displayFlowerName;
    }

    public double oneSeasonHeight() {
        this.height += 0.65;
        return height;
    }

    public void seasonSpring() {
        oneSeasonHeight();
        System.out.println(displayFlowerName + " starts to grow, height is " + height + "m.");
    }

    public void seasonSummer() {
        System.out.println(displayFlowerName + " blooms! " + "Height of flower is " + height + "m.");
    }

    public void seasonAutumn() {
        this.height = 0;
        System.out.println(displayFlowerName + " cut off." + "Height of flower is " + height + "m.");
    }

    public void seasonWinter() {
        System.out.println("In winter, a flower bulb in the ground.");
    }
}
