package info.efom.Gyakuhiki;

import static java.lang.Math.round;
import static java.lang.Math.PI;

// import static java.lang.Math.*;

/**
 * Created by jn on 2014/05/26.
 */
public class Study011 {
    public static void staticMemberImport() {
        double d = 1.2;
        long value = round(d);
        System.out.println(value);

        double r = 2;
        double area = r * r * PI; // long?
        System.out.println(area);

    }
}
