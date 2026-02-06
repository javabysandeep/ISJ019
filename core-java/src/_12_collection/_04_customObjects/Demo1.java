package _12_collection._04_customObjects;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Demo1 {
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

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        //01. traditional for loop
        for (int index = 0; index < productList.size(); index++) {
            System.out.println(productList.get(index));
        }

        //02. enhanced for loop
        for (Product product : productList) {
            System.out.println(product);
        }

        //03. iterator
        Iterator<Product> iterator = productList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //04. java 8 foreach method
        System.out.println("04. java 8 foreach method");
        //Consumer<Product> consumer =   x-> System.out.println(x);
        Consumer<Product> consumer = System.out::println;
        // productList.forEach(consumer);
        productList.forEach(System.out::println);
    }
}
