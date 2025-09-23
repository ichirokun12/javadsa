package playground;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashAndHeep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> hashMap = new HashMap<>();
        String str = input.nextLine();
        input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if(hashMap.containsValue(character)) {
                int of = hashMap.get(character);
                int nf = of + 1;
                hashMap.put(character, nf);
            } else {
                hashMap.put(character, 1);
            }
        }
        char mfc = str.charAt(0);
        for (Character key : hashMap.keySet()) {
            if(hashMap.get(key) > hashMap.get(mfc)) {
                mfc = key;
            }
        }
        System.out.println(mfc);
    }
}
