package info.efom.Gyakuhiki;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jn on 2014/05/27.
 */
public class Study021 {
    public static void rapperClass() {
        int i = 1;
        Integer obj = new Integer(i);

        List<Integer> list = new ArrayList<>();
        list.add(obj);

        int i2 = obj.intValue();

        // オートボクシング
        List<Integer> list2 = new ArrayList<>();
        int i1 = 0;
        list2.add(i1);
        int i3 = list2.get(0);
    }
}
