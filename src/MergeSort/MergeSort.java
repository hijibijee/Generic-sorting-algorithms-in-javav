package MergeSort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort <T extends List<U>, U> {

    public void sortIt(T a, MyCmp<U> cmp){
        ArrayList<U> temp = new ArrayList<>();

        a.forEach( u -> temp.add(u));

        mergeIt(temp, cmp);

        for(int i = 0; i < a.size(); i++) a.set(i, temp.get(i));
    }

    ArrayList<U> mergeIt(ArrayList<U> a, MyCmp<U> cmp){
        int n = a.size();

        if(n == 1) return a;

        ArrayList<U> a1 = new ArrayList<>(a.subList(0, n / 2)), a2 = new ArrayList<>(a.subList(n / 2, n));

        mergeIt(a1, cmp);
        mergeIt(a2, cmp);

        int i = 0, j = 0;

        for(int k = 0; k < n; k++){
            if(i < a1.size() && j < a2.size()){
                if(cmp.isLessOrEqual(a1.get(i), a2.get(j))){
                    a.set(k, a1.get(i));
                    i++;
                }
                else{
                    a.set(k, a2.get(j));
                    j++;
                }
            }
            else if(i < a1.size()){
                a.set(k, a1.get(i));
                i++;
            }
            else{
                a.set(k, a2.get(j));
                j++;
            }
        }

        return a;
    }
}
