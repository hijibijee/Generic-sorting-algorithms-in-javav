package SortInterfaces;

import java.util.List;

public interface Sort <T extends List<U>, U extends Comparable<U>>{
    public default void sortIt(T a){
        sortIt(a, new MyCmp<U>() {
            @Override
            public boolean isLessOrEqual(U a, U b) {
                int x = a.compareTo(b);

                return (x <= 0);
            }
        });
    }
    public void sortIt(T a, MyCmp<U> cmp);
}
