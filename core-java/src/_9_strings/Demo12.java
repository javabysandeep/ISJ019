package _9_strings;

public class Demo12 {
    public static void main(String[] args) {
        String s = "programming";
        //reverse the string
        String reverse = "";
        for (int index = s.length() - 1; index >= 0; index--) {
            reverse = reverse + s.charAt(index);
        }
        System.out.println(reverse);
        //gnimmargorp
        //this is the worst approach
        //in this number string object created will be equal to number of characters.
    }
}
