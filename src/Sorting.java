import MergeSort.MergeSort;
import QuickSort.QuickSort;
import BubbleSort.BubbleSort;
import InsertionSort.InsertionSort;
import SelectionSort.SelectionSort;
import SortInterfaces.Sort;

import java.util.*;

public class Sorting <T extends List>{
    public static void main(String[] args) {
        List<Integer> a = new LinkedList<>();
        a.add(5);
        a.add(3);
        a.add(4);
        a.add(2);
        a.add(1);

        Sort<List<Integer>, Integer> m = new InsertionSort<List<Integer>, Integer>();

        m.sortIt(a);

        for(int i = 0; i < a.size(); i++) System.out.println(a.get(i));
    }
}
