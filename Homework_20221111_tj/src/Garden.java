public class Garden {
    public static void main(String[] args) {

       /*
    Садовод-любитель. Выращиваем растения в течение нескольких лет и
    смотрим что будет
    задача: выращиваем деревья и цветы. Каждый из этих видов имеет
    следующие характеристики: displayName,height, age. Каждый из них вырастает за сезон на
    разную высоту, одинаковую для всех деревьев и всех цветов.
    Каждый сезон состоит из 4 времен года, в которые цветы и деревья ведут себя не всегда одиниково.
    Сезон для цветов начинается весной, зимой они не растут, летом они не растут а цветут,
    осенью их срезают.
    Для деревьев: сезон начинается весной, зимой они не растут, летом растут, осенью не растут.
    В классе Garden  создать метод growPlants, в котором подробно отражен процесс роста двух растений
    в течение нескольких лет. Что происходит зимой, летом и весной, их размер в каждый сезон и
    какого они размера и возраста в конце.
    Решить задачу через абстрактные классы
     */

        PlantGrowable plant1 = new Tree("Maple",3);
        PlantGrowable plant2 = new Flower("Tulip");

        System.out.println("------ Spring ------");
        plant1.seasonSpring();
        plant2.seasonSpring();

        System.out.println("------ Summer ------");
        plant1.seasonSummer();
        plant2.seasonSummer();

        System.out.println("------ Autumn ------");
        plant1.seasonAutumn();
        plant2.seasonAutumn();

        System.out.println("------ Winter ------");
        plant1.seasonWinter();
        plant2.seasonWinter();
    }
}