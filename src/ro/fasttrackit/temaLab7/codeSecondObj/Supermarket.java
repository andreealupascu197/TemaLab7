package ro.fasttrackit.temaLab7.codeSecondObj;

public class Supermarket {
    public static void main(String[] args) {
        Product firstProduct = new Product("butter", 30, 100, "aliments");
        Product secondProduct = new Product("bread", 10, 0, "aliments");
        Product thirdProduct = new Product("apples", 5, 300, "fruits");

        printProduct(firstProduct);
        firstProduct.hasStock();
        printProduct(secondProduct);
        secondProduct.hasStock();
        printProduct(thirdProduct);
        thirdProduct.hasStock();
        firstProduct.isCategory("aliments");
        secondProduct.isCategory("legume");

    }

    public static void printProduct(Product product) {
        System.out.println("Product name: " + product.getName() + ", price: " + product.getPrice() + ", quantity: " + product.getQuantity() + ", category: " + product.getCategory());

    }

}




