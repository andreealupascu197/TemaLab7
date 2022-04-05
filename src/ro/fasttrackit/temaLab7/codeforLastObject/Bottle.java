package ro.fasttrackit.temaLab7.codeforLastObject;

public class Bottle {
    private int capacity;
    private int availableLiquid;
    private boolean open;

    Bottle(int capacity, int availableLiquid, boolean open) {
        this.capacity = capacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public boolean hasMoreLiquid(int quantity) {
        if(availableLiquid > quantity) {
            System.out.println("Bottle has more liquid");
            return true;
        } else {
            System.out.println("Bottle has less liquid");
            return false;
        }
    }

    public int getAvailableLiquid() {
        System.out.println("Available liquid is: " + availableLiquid);
        return availableLiquid;
    }

    public int emptyCapacity() {
        int emptyCapacity = capacity - availableLiquid;
        System.out.println("The remaining liquid is " + emptyCapacity + " Liters");
        return emptyCapacity;
    }

    public boolean open() {
        if (!this.open) {
            System.out.println("Bottle is open now");
            return true;
        } else {
            System.out.println("Bottle already opened.");
            return false;
        }
    }

    public boolean close() {
        if (this.open) {
            System.out.println("Bottle is closed now");
            return true;
        } else {
            System.out.println("Bottle is already closed.");
            return false;
        }
    }

    public void drinkFromBottle(){
        int toDrink = 1;
        if(!this.open) {
            System.out.println("Bootle is closed at the moment. Please open");
        } else if (availableLiquid < toDrink) {
            System.out.println("Not enought liquid available");
        } else {
            System.out.println("You have drank " + toDrink + " liters. You have now left " + (availableLiquid - toDrink));
        }
    }

}
