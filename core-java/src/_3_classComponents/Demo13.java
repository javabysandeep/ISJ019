package _3_classComponents;

public class Demo13 {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;

            //zero parameter
            Student(){

            }
            // parameterized constructor
            Student(int i, String n) {
                //assigning local variable value to instance variable
                id = i;
                name = n;
            }
        }
        //3. param constructor
        Student s1 = new Student(1, "Aditya");
        Student s2 = new Student(2, "Bhushan");
        Student s3 = new Student(3, "Sakshi");
        Student s4 = new Student(4, "Vaishnavi");
        Student s5 = new Student(5, "Rushikesh");
        Student s6 = new Student();

        System.out.println("Student 1{" + "id=" + s1.id + ", name='" + s1.name + '\'' + '}');
        System.out.println("Student 2{" + "id=" + s2.id + ", name='" + s2.name + '\'' + '}');
        System.out.println("Student 3{" + "id=" + s3.id + ", name='" + s3.name + '\'' + '}');
        System.out.println("Student 4{" + "id=" + s4.id + ", name='" + s4.name + '\'' + '}');
        System.out.println("Student 5{" + "id=" + s5.id + ", name='" + s5.name + '\'' + '}');
        System.out.println("Student 6{" + "id=" + s6.id + ", name='" + s6.name + '\'' + '}');

    }
}
