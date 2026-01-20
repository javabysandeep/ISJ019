package _9_strings;

import java.util.HashMap;

public class Demo18 {
    public static void main(String[] args) {
        //find the occurrence of each character
        String str = "hello";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int index = 0; index < str.length(); index++) {
            char character = str.charAt(index);
            if (!hm.containsKey(character)) {
                hm.put(character, 1);
            } else {
                hm.put(character, hm.get(character) + 1);
            }
        }
        System.out.println(hm);

    }
}
