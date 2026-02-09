package _12_collection._02_setDemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class Demo11CustomObjects {
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
                return "Product{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", price=" + price +
                        '}';
            }
        }
        Product product1 = new Product(1, "laptop", 50000);
        Product product2 = new Product(2, "mobile", 30000);
        Product product3 = new Product(3, "camera", 20000);
        Product product4 = new Product(4, "projector", 50000);

        Set<Product> products = new HashSet<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);


        //02. enhanced for loop
        for (Product product : products) {
            System.out.println(product);
        }

        //03. iterator
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //04. java 8 foreach method
        System.out.println("04. java 8 foreach method");
        //Consumer<Product> consumer =   x-> System.out.println(x);
        Consumer<Product> consumer = System.out::println;
        // products.forEach(consumer);
        products.forEach(System.out::println);
    }
}
