package info.efom.Gyakuhiki;

/**
 * Created by jn on 2014/05/26.
 */
public class Study014 {
    public static void numCal() {
        // intとlongの計算結果はlongになる
        long a = 1 + 2L;
        // intとdoubleの計算結果はdoubleになる
        double b = 10 + 1.1d;

        System.out.println(a);
        System.out.println(b);

        int i = 1;
        System.out.println(i++); // 1
        System.out.println(i); // 2

        int j = i++; // 加算してから代入
        System.out.println(j); // 2

        int c = ++i;
        System.out.println(c); // 4

        int k = 1;
        k += 10;
        System.out.println(k); // 11
        k -= 5;
        System.out.println(k); // 6
    }
}
