package ro.fasttrackit.temaLab7.codeforLastObject;

public class Refrigerator {
    public static void main(String[] args) {
        Bottle cola = new Bottle(2, 1, false);
        Bottle water = new Bottle(5, 0, true);
        Bottle beer = new Bottle(1, 1, true);
        Bottle milk = new Bottle(2, 0, false);

        cola.hasMoreLiquid(2);
        water.hasMoreLiquid(1);
        beer.hasMoreLiquid(0);
        milk.hasMoreLiquid(0);

        cola.getAvailableLiquid();
        water.getAvailableLiquid();
        beer.getAvailableLiquid();
        milk.getAvailableLiquid();

        cola.emptyCapacity();
        water.emptyCapacity();
        beer.emptyCapacity();
        milk.emptyCapacity();

        cola.open();
        water.open();
        beer.open();
        milk.open();

        cola.close();
        water.close();
        beer.close();
        milk.close();

        cola.drinkFromBottle();
        water.drinkFromBottle();
        beer.drinkFromBottle();
        milk.drinkFromBottle();


    }
}
