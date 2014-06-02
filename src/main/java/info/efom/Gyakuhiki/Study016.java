package info.efom.Gyakuhiki;

/**
 * Created by jn on 2014/05/27.
 */
public class Study016 {
    public static void comp() {
        int i1 = 123;
        int i2 = 123;
        int i3 = 456;

        if (i1 == i2) {
            System.out.println("i1とi2は等しい");
        }

        if (i1 != i3) {
            System.out.println("i1とi3は等しくない");
        }

        if (i1 < i3) {
            System.out.println("i3はi1より大きい");
        }

        String s1 = "123";
        String s2 = new String("123");

        if (s1 == s2) {
            System.out.println("s1とs2の参照が等しい");
        }

        if (s1.equals(s2)) {
            System.out.println("s1とs2の値が等しい");
        }

        // 値の大小を比較
        int result = s1.compareTo(s2);
        if (result == 0) {
            System.out.println("値が等しい");
        } else if (result < 0) {
            System.out.println("s1はs2より小さい");
        } else if (result > 0) {
            System.out.println("s1はs2より大きい");
        }
    }
}
