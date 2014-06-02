package info.efom.Gyakuhiki;

/**
 * Created by jn on 2014/05/27.
 */
public class Study017 {
    public static void piyo() {
        int age = 10;
        String s = age >= 20 ? "成人" : "未成年";
        System.out.println(s);

        // if文の場合
        String t = null;
        if (age >= 20) {
            t = "成人";
        } else {
            t = "未成年";
        }

        System.out.println(t);
    }
}
