package Com.Comporators;

import Com.Commodity;

import java.util.Comparator;

/**
 * Created by SCIP on 13.07.2016.
 */
public class CommodityComparatorByNameAsc implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
