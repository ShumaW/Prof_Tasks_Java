public class Tree extends PlantGrowable {
    private double height;
    private int age;
    private String displayTreeName;

    public Tree(String displayTreeName, int age) {
        this.displayTreeName = displayTreeName;
        this.age = age;
    }

    public double oneSeasonHeight() {
        this.height += 0.25;
        return height;
    }

    public void seasonSpring() {
        this.height = oneSeasonHeight() * 2 * age + 0.25;
        System.out.println(displayTreeName + " blooms! Height  is " + height + "m., age is " + (age+1) + " year.");
    }

    public void seasonSummer() {
        this.height += 0.25;
        System.out.println(displayTreeName + " height " + height + "m., age is " + (age+1) + " year.");
    }

    public void seasonAutumn(){
        System.out.println("Leaves fall from the " + displayTreeName + ". Height " + displayTreeName + " is " + height + "m., age is " + (age+1) + " year.");
    }

    public void seasonWinter(){
        System.out.println(displayTreeName + " stands without leaves. Height " + displayTreeName + " is " + height + "m., age is " + (age+1) + " year.");
    }
}
