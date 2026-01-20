package _9_strings;

public class Demo16Palindrome {
    public static void main(String[] args) {
        String str = "naman";
        //02. using loop
        StringBuilder sb = new StringBuilder();
        for (int index = str.length() - 1; index >= 0; index--) {
            sb.append(str.charAt(index));
        }
        String reversedString = sb.toString();
        System.out.println(reversedString);

        System.out.println(str == reversedString);//reference check
        System.out.println(str.equals(reversedString));//content check
        System.out.println(str.equals(reversedString) ? "palindrome" : "not palindrome");//content check
    }
}
