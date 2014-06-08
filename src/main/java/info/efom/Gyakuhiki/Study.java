package info.efom.Gyakuhiki;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Created by jn on 2014/05/27.
 */
public class Study {
    public static void n018() {
        String value = "piyo";

        // null の時に length やるとぬるぽで死ぬ
        if (value != null & value.length() != 0) {
        }

        // null のときは length を呼ばない
        if (value != null && value.length() != 0) {
        }
    }

    public static void n019() {
        // オブジェクトの型

        Object obj1 = "abc";
        Object obj2 = new ArrayList<>();
        Object obj3 = null;

        // obj1 がStringか調べる
        if (obj1 instanceof String) {
            // objがStringの場合のみ実行
            String str = (String) obj1;
        }

        // obj2 がListか調べる
        // ArrayList は List の実装クラス
        if (obj2 instanceof List) {
            System.out.println("obj2 instance of List");
        }

        // nullはobjectではない
        if (obj3 instanceof Objects) {
        }
    }

    public static void n020() {
        // 変数型変換
        int a = 10;
        long b = a; // より広い範囲を持つ型にそのまま代入できる。

        long a2 = 10;
        //int b2 = (long) a2; // 本文ママ
        int b2 = (int) a2; // TODO: intじゃね？

        double c = 1.5;
        int d = (int) c; // 小数部が切り捨てられ1になる
        System.out.println(d);

        //long e = 2147483648;
        long e = 2147483648L; // Lがいるな……
        int f = (int) e;
        System.out.println(f); // 桁あふれで -2147483648

        // 参照型変換
        ArrayList<String> arrayList = new ArrayList<>();
        List<String> list = arrayList; // ArrayListはListインターフェイスの実装だから代入できる

        // ダウンキャスト
        List<String> list2 = new ArrayList<>();
        ArrayList<String> arrayList2 = (ArrayList<String>) list2; // キャストが必要
        // ClassCastException が発生するよ
        // LinkedList<String> linkedList = (LinkedList<String>) list;

        // Class#cast()
        Object obj = new Integer(1);
        Integer i = Integer.class.cast(obj);
    }


    public static void n022() {
        // null!!!!!
        // 明示的にnullを代入
        String str = null;
        String str2; // コンパイルエラーになる……あれ？

        //if (str.equals("Java")) { // 死ぬ
        if ("Java".equals(str)) {
            // 片方が文字列リテラルなら、比較するときリテラル側のequalsを呼び出せば
            // ぬるぽ回避できる
        }
    }

}
