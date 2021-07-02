import MergeSort.MergeSort;

import java.util.*;
import Comparator.MyCmp;

public class Sorting <T extends List>{
    public static void main(String[] args) {
        List<Integer> a = new LinkedList<>();
        a.add(5);
        a.add(3);
        a.add(4);
        a.add(2);
        a.add(1);

        MergeSort m = new MergeSort();

        m.sortIt(a);

        for(int i = 0; i < a.size(); i++) System.out.println(a.get(i));
    }
}
