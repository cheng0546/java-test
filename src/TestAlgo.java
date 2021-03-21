import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.Tree;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;

public class TestAlgo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 4;
        ints[2] = 3;
        for (int i : ints) {
            System.out.println(i);
        }

        String str = "HELLO";
        System.out.println(str.toLowerCase());
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);

//        ArrayList排序，自带比较器升序降序排序
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(7);
        array.add(3);
        array.add(6);
        array.sort(Comparator.naturalOrder());
        System.out.println(array);
        array.sort(Comparator.reverseOrder());
        System.out.println(array);

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        LinkedList<Integer> linkedList = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        Set s = map.entrySet();


        String str2 = "[1, 2][1][1, 3]";
        String replace = str2.replaceAll("(\\]\\[)|(\\[)|(\\])|(, )", " ").trim();
        System.out.println(replace);
    }
}
