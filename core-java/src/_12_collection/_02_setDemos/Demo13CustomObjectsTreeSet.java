package _12_collection._02_setDemos;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Demo13CustomObjectsTreeSet {
    public static void main(String[] args) {
        class Product {
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


        }
        Product product1 = new Product(11, "laptop", 50000);
        Product product2 = new Product(2, "mobile", 30000);
        Product product3 = new Product(32, "camera", 20000);
        Product product4 = new Product(4, "projector", 50000);

        Comparator<Product> comparator = (p1, p2) -> p1.id - p2.id;
        Set<Product> products = new TreeSet<>(comparator);
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
