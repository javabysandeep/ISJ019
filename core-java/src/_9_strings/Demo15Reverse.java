package _9_strings;

public class Demo15Reverse {
    public static void main(String[] args) {
        String str = "hello";
        //01. using stringBuilder reverse
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        String reversedString = stringBuilder.toString();
        System.out.println(reversedString);

        //02. using loop
        StringBuilder sb = new StringBuilder();
        for (int index = str.length() - 1; index >= 0; index--) {
            sb.append(str.charAt(index));
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
