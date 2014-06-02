package info.efom.Gyakuhiki;

/**
 * Created by jn on 2014/05/27.
 */
public class Study015 {
    public static void bit() {
        int a = Integer.parseInt("0100",2);
        int b = Integer.parseInt("0101",2);
        System.out.println(a);

        // AND 演算
        int and = a & b;
        System.out.println(Integer.toBinaryString(and));

        // OR
        int or = a | b;
        System.out.println(Integer.toBinaryString(or));

        // XOR
        int xor = a ^ b;
        System.out.println(Integer.toBinaryString(xor));

        // NOT
        int not = ~ a;
        System.out.println(Integer.toBinaryString(not));
    }

    public static void bit2() {
        int a = Integer.parseInt("00100000000000000000000000010000", 2);

        // 左に2ビットシフト
        int b = a << 2;
        System.out.println(Integer.toBinaryString(b));

        // 右に2ビットシフト
        int c = b >> 2;
        System.out.println(Integer.toBinaryString(c));

        // さらに右に2ビットシフト
        int d = c >>> 2;
        System.out.println(Integer.toBinaryString(d));
    }
}
