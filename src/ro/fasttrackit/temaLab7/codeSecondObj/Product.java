package ro.fasttrackit.temaLab7.codeSecondObj;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;

    Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStock() {
        if (quantity != 0) {
            System.out.println("The quantity is: " + quantity);
            return true;
        } else {
            System.out.println("The quantity is: 0");
            return false;


        }
    }

    public boolean isCategory(String category) {
        if (this.category.equals(category)) {
            System.out.println("Category is equal to the parameter");
            return true;
        } else {
            System.out.println("Category is not equal to the parameter");
            return false;
        }
    }
}
