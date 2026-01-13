package _7_misc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo9ObjectClassMethods {
    public static void main(String[] args) {
        class A {

        }
        //A is child class of Object class
        A reference = new A();
        Class referenceToClassTypeObject = reference.getClass();

        String name = referenceToClassTypeObject.getName();

        Field[] fields = referenceToClassTypeObject.getFields();
        Method[] methods = referenceToClassTypeObject.getMethods();
        Constructor[] declaredConstructors = referenceToClassTypeObject.getDeclaredConstructors();

        System.out.println(name);

    }
}
