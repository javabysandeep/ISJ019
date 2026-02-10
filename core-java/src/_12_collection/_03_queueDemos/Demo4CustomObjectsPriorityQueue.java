package _12_collection._03_queueDemos;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Demo4CustomObjectsPriorityQueue {
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
               // return this.id - o.id;
                return (int) (this.price - o.price);
            }
        }
        Product product1 = new Product(1, "laptop", 50000);
        Product product2 = new Product(2, "mobile", 30000);
        Product product3 = new Product(3, "camera", 20000);
        Product product4 = new Product(4, "projector", 50000);

        Queue<Product> productQueue = new PriorityQueue<>();
        productQueue.add(product1);
        productQueue.add(product2);
        productQueue.add(product3);
        productQueue.add(product4);


        //IQ : ConcurrentModificationException --> what, why
        /*for (Product product : products) {
            System.out.println(products.remove());
        }*/
        System.out.println(productQueue.remove());
        System.out.println(productQueue.remove());
        System.out.println(productQueue.remove());
        System.out.println(productQueue.remove());

    }
}
