package _7_misc;

public class Demo17DeepClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        class Address implements Cloneable {
            String street;
            String city;
            String country;

            public Address(String street, String city, String country) {
                this.street = street;
                this.city = city;
                this.country = country;
            }

            public Address() {
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

            @Override
            public String toString() {
                return "Address{" +
                        "street='" + street + '\'' +
                        ", city='" + city + '\'' +
                        ", country='" + country + '\'' +
                        '}';
            }
        }

        class Student implements Cloneable {
            int id;
            String name;
            Address address;

            public Student(int id, String name, Address address) {
                this.id = id;
                this.name = name;
                this.address = address;
            }

            public Student() {
            }

            @Override
            public Object clone() throws CloneNotSupportedException {
                Student cloned = (Student) super.clone();
                cloned.address = (Address) cloned.address.clone();
                return cloned;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", address=" + address +
                        '}';
            }
        }

        Address address = new Address("baner", "pune", "india");
        Student s1 = new Student(1, "bhushan", address);
        Student s2 = (Student) s1.clone();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("deep copy");
        s2.address.city = "Mumbai";

        System.out.println(s1);
        System.out.println(s2);


    }
}
