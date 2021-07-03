package InsertionSort;

import SortInterfaces.MyCmp;
import SortInterfaces.Sort;

import java.util.List;

public class InsertionSort <T extends List<U>, U extends Comparable<U>> implements Sort<T, U> {

    @Override
    public void sortIt(T a, MyCmp<U> cmp) {
        int n = a.size();
        for(int i = 1; i < n; i++){
            for(int j = i-1; j >= 0 && cmp.isLessOrEqual(a.get(j + 1), a.get(j)); j--){
                swap(a,j + 1, j);
            }
        }
    }
}
