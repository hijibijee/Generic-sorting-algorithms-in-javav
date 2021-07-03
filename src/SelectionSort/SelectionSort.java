package SelectionSort;

import SortInterfaces.MyCmp;
import SortInterfaces.Sort;

import java.util.List;

public class SelectionSort <T extends List<U>, U extends Comparable<U>> implements Sort<T,U> {
    private void swap(){

    }
    @Override
    public void sortIt(T a, MyCmp<U> cmp) {
        int n = a.size();
        for(int i = 0; i < n; i++){
            int minI = i;
            for(int j = i; j < n; j++){
                if(cmp.isLessOrEqual(a.get(j), a.get(minI))){
                    minI = j;
                }
            }
            swap(a, i, minI);
        }
    }
}
