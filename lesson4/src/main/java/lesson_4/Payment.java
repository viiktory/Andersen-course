package lesson_4;

import java.util.Arrays;

public class Payment {
    private Product[] products = new Product[0];

    public void addProduct(String name, double price) {
        Product product = new Product(name, price);
        products = Arrays.copyOf(products, products.length + 1);
        products[products.length-1] = product;
    }

    public void printProductsList() {
        for(Product product : products) {
            System.out.println(product);
        }
    }

    public void printTotalCost() {
        double totalCost = 0;
        for(Product product : products) {
            totalCost += product.price;
        }
        System.out.println("Total cost = " + totalCost);
    }

    private static class Product {
        private final String name;
        private final double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}