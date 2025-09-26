package playground;

import java.util.*;

class Heap<T extends Comparable<T>> {

}

public class HashAndHeep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        System.out.println("enter the K");
        int K = input.nextInt();

        System.out.println("enter the size of the array");
        int sizeOfArray = input.nextInt();
        int[] arr = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println("enter the element of index " + i);
            arr[i] = input.nextInt();
        }
        for(int i = 0 ; i < arr.length; i++) {
            if(i < K) {
                priorityQueue.add(arr[i]);
            }
            else {
                if(arr[i] > priorityQueue.peek()) {
                    priorityQueue.remove();
                    priorityQueue.add(arr[i]);
                }
            }
        }
        while (priorityQueue.size() > 0) {
            System.out.println(priorityQueue.remove());
        }
    }
}
