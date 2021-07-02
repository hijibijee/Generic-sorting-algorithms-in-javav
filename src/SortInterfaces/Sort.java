package SortInterfaces;

import java.util.List;

public interface Sort <T extends List<U>, U extends Comparable<U>>{
    public void sortIt(T a);
    public void sortIt(T a, MyCmp<U> cmp);
}
