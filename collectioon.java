import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
import java.util.Set;

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


    }
}
