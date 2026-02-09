package _12_collection._01_listDemos._06_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo3 {
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

        System.out.println("before sorting");
        productList.forEach(System.out::println);


        Comparator<Product> comparatorId = (p1, p2) -> p1.id - p2.id;//sort based on id
        Comparator<Product> comparatorPrice = (p1, p2) -> (int) (p1.price - p2.price);//sort based on price
        Comparator<Product> comparatorName = (p1,p2)-> p1.name.compareTo(p2.name);//sort based on name
        Comparator<Product> comparatorName1 = Comparator.comparing(p -> p.name);//sort based on name
        Collections.sort(productList, comparatorName);


        System.out.println("after sorting");
        productList.forEach(System.out::println);
    }
}
