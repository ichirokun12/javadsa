package playground;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashAndHeep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();
        }

        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();

        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int val : arr1) {
            if (hashMap.containsValue(val)) {
                int of = hashMap.get(val);
                int nf = of + 1;
                hashMap.put(val, nf);
            } else {
                hashMap.put(val, 1);
            }
        }
        for (int val : arr2) {
            if (hashMap.containsValue(val) && hashMap.get(val) > 0) {
                System.out.println(val);
                int of = hashMap.get(val);
                int nf = of - 1;
                hashMap.put(val, nf);
            }
        }
    }
}
