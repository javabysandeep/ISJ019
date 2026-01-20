package _9_strings;

public class Demo17VowelsCount {
    public static void main(String[] args) {
        int vowelsCount = 0;
        int consonantCount = 0;
        String str = "hello";//v=2,c=3
        for (int index = 0; index < str.length(); index++) {
            switch (str.charAt(index)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelsCount++;
                    break;
                default:
                    consonantCount++;
            }
        }
        System.out.println("vowels = " + vowelsCount);
        System.out.println("consonants = " + consonantCount);
    }
}
