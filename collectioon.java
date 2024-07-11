import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
import java.util.Set;
import java.util.Queue;
import java.util.Deque;
import java.util.PriorityQueue;



public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(2,25);
       
        System.out.println(list);

        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(200);
        list2.add("kuch bhi ");

        System.out.println(list2);

        LinkedList<String> list3= new LinkedList<String>();

        list3.add("qwerty");
        list3.add("asdfgh");
        list3.add("zxcvb");
        list3.remove(0);

        System.out.println(list3);

        Vector<String> vector = new Vector<String>();

        vector.add("mnbvc");
        vector.add("lkjh");
        vector.add("poiuy");

        System.out.println(vector);

        Stack<Integer> st = new Stack<Integer>();

        st.push(11);
        st.push(12);
        st.push(14);
        
        System.out.println("stack = " +  st);

        st.pop();

        System.out.println(st.peek());

        Set<Integer> set = new HashSet<Integer>();

        set.add(4);
        set.add(19);
        set.add(29);
        set.add(7);
        set.add(19);

        System.out.println(set);

        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(12);
        queue.offer(8);
        queue.offer(18);//we use offer in queue
        queue.add(10);

        System.out.println("queue = "+queue);
        System.out.println("removed queue = " + queue.remove());
        System.out.println("queue = " + queue);
        System.out.println("queue" + queue.poll());


        Deque<Integer> deq = new ArrayDeque<Integer>();
        deq.offer(17);
        deq.offer(1);
        deq.offerLast(11);
        deq.offerFirst(46);

        System.out.println("Deque" + deq);
        System.out.println(deq.peek());

        PriorityQueue<Integer> PQ = new PriorityQueue<>();

        PQ.add(45);
        PQ.offer(10);
        PQ.offer(20);
        PQ.add(6);

        System.out.println(PQ);
    }
}
