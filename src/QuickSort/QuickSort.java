package QuickSort;

import SortInterfaces.MyCmp;
import SortInterfaces.Sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort <T extends List<U>, U extends Comparable<U>> implements Sort<T,U> {

    @Override
    public void sortIt(T a, MyCmp<U> cmp) {
        ArrayList<U> temp = new ArrayList<>(a);

        partIt(temp, cmp, 0, a.size() - 1);

        for(int i = 0; i < a.size(); i++) a.set(i, temp.get(i));
    }

    void swap(ArrayList<U> a, int i, int j){
        U temp = a.get(j);
        a.set(j, a.get(i));
        a.set(i, temp);
    }

    private void partIt(ArrayList<U> a, MyCmp<U> cmp, int l, int h){
        if(l >= h) return;

        int pivot = l;

        int i = l, j = h;

        while(i < j){
            while( i <= h && cmp.isLessOrEqual(a.get(i), a.get(pivot))) i++;
            while(j > l && !cmp.isLessOrEqual(a.get(j), a.get(pivot))) j--;

            if(i > j) break;

            swap(a, i, j);
        }

        swap(a, pivot, j);

        partIt(a, cmp, l, j - 1);
        partIt(a, cmp, j + 1, h);
    }
}
