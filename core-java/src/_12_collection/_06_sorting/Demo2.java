package _12_collection._06_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Demo2 {
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
                return "Product{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", price=" + price +
                        '}';
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

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        System.out.println("before sorting");
        productList.forEach(System.out::println);


        Collections.sort(productList);//CTE ---> products are not of type comparable


        System.out.println("after sorting");
        productList.forEach(System.out::println);
    }
}
