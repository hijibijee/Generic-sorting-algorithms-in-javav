package BubbleSort;

import SortInterfaces.MyCmp;
import SortInterfaces.Sort;

import java.util.List;

public class BubbleSort <T extends List<U>, U extends Comparable<U>> implements Sort<T,U> {

    @Override
    public void sortIt(T a, MyCmp<U> cmp) {
        int swapCount = 0;
        for(int i = 1; i < a.size(); i++){
            if(!cmp.isLessOrEqual(a.get(i - 1), a.get(i))){
                swap(a, i, i - 1);
                swapCount++;
            }
        }

        if(swapCount == 0) return;

        sortIt(a, cmp);
    }
}
