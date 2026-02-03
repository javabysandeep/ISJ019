package _12_collection;

public class Demo1 {
    public static void main(String[] args) {
        //01. shortage of space
        //02. heterogeneous data
        class DynamicArray {
            private Object[] values;
            private int initialCapacity = 10;
            private int size = 0;

            DynamicArray() {
                values = new Object[initialCapacity];
            }

            DynamicArray(int capacity) {
                if (capacity > 0) {
                    this.initialCapacity = capacity;
                }
                values = new Object[initialCapacity];
            }

            public void add(Object item) {
                if (initialCapacity == size) {
                    //resize and copy the elements to the new array
                    this.initialCapacity = (int) (this.initialCapacity * 1.5 + 1);
                    Object[] newArray = new Object[initialCapacity];
                    for (int index = 0; index < values.length; index++) {
                        newArray[index] = values[index];
                    }
                    values = newArray;
                }
                values[size++] = item;
            }

            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                for (int index = 0; index < size; index++) {
                    sb.append(values[index]);
                    sb.append(",");
                }
                sb.append("]");
                return sb.toString();
            }
        }

        DynamicArray container = new DynamicArray();
        container.add(100);
        container.add(100);
        container.add("abc");
        container.add(10.5f);
        container.add(true);
        System.out.println(container);

    }
}
