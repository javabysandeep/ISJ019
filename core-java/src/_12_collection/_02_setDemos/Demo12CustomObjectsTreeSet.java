package _12_collection._02_setDemos;

import java.util.Set;
import java.util.TreeSet;

public class Demo12CustomObjectsTreeSet {
    public static void main(String[] args) {
        class Product implements Comparable<Product> {
            int id;
            String name;
            double price;

            public Product(int id, String name, double price) {
                this.id = id;
                this.name = name;
                this.price = price;
            }

            public Product() {
            }

            @Override
            public String toString() {
                return "Product{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + '}';
            }

            @Override
            public int compareTo(Product o) {
                return this.id - o.id;
            }
        }
        Product product1 = new Product(1, "laptop", 50000);
        Product product2 = new Product(2, "mobile", 30000);
        Product product3 = new Product(3, "camera", 20000);
        Product product4 = new Product(4, "projector", 50000);

        Set<Product> products = new TreeSet<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product4);
        products.add(product4);

        for (Product product : products) {
            System.out.println(product);
        }

    }
}
