package info.efom.Gyakuhiki;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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

    public static void n023() {
        Optional<String> exist = Optional.of("123");

        // 空のOptional
        Optional<String> empty = Optional.empty();

        // 値がnull意外の場合は値を持つOptional, nullの場合は空のOptionalを生成する
        String value = "piyo";
        Optional<String> optional = Optional.ofNullable(value);

        // 値を取得
        String value1 = optional.get();

        // 値が存在しない場合は空文字列を返す
        String value2 = optional.orElse("");

        // 値が存在しない場合はラムダ式の結果を返す
        String value3 = optional.orElseGet(() -> {
            return new SimpleDateFormat("yyyyMMddHHmmSS").format(new Date());
        });

        // 値が存在しない場合は例外をスローする
        // java.lang.Exceptionを設定できないんだけど……
        //String value4 = optional.orElseThrow(() -> new Exception("値がありません"));
        String value4 = optional.orElseThrow(() -> new RuntimeException("値がありません"));

        // 値が存在するがどうかを判定して処理を行う。
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }

        // 値がある場合だけラムダ式の処理を行う
        optional.ifPresent(s -> {
            System.out.println(s);
        });
    }

    public static void n027() {
        // if
        int i = 10;

        if (i < 10) {
            System.out.println("10より小さい");
        } else {
            System.out.println("10以上");
        }

        // else は省略可
        if (i < 10) {
            System.out.println("10より小さい");
        }

        // 条件が複数の場合、最初にtrueになった1ブロックのみ実行される
        if (i < 20 && i % 2 == 0) {
            System.out.println("20より小さいかつ偶数"); // 実行される
        } else if (i < 20) {
            System.out.println("20より小さい"); // 実行されない
        } else {
            System.out.println("それ意外");
        }

        // {}省略できる
        if (i < 10) System.out.println("10より小さい");


        // いぇーブロックのスコープ！
        String name = "piyo";
        if (name != null) {
            // ブロック外で宣言したnameをブロック内で参照可能
            String m = "Hello " + name;
        }

        // コンパイルエラー
        //System.out.println(m);

        // ブロックで変数のスコープを固定する
        {
            String name2 = "piyo";
        }
        {
            // 同じ名前が使える
            String name2 = "ぴよ";
        }
    }

    public static void n028() {
        // switch
        int i = 10;

        switch(i) {
            case 10:
                System.out.println("10");
                break;

            // それ意外
            default:
                System.out.println("10以外");
        }

        // defaultは省略可能
        switch (i) {
            case 10:
                System.out.println("10");
                break;
        }

        // break を省略すると次のcase文を実行
        switch (i) {
            case 5:
            case 10:
                System.out.println("5または10");
                break;
            default:
                System.out.print("それ以外");
        }

        // if, else switch !!!
        String str = null;
        if (str == null) {
            // nullの時
        } else switch (str) {
            case "hoge":
                // ...
        }
    }

    public static void n029() {
        // for
        for (int i = 0; i < 3; i++) {
            System.out.println(i + "番目の処理");
        }

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");

        // for文の場合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 拡張for
        for (String str : list) {
            System.out.println(str);
        }
    }

    public static void n030() {
        // while
        int i = 0;
        while (i < 5) {
            i = (int)(Math.random() * 10);
            System.out.println(1);
        }

        // do, while
        int j = 0;
        do {
            System.out.println(j);
        } while (j > 0); // false なので終了
    }

    public static void n031() {
        // 繰り返し処理を途中で終了するじゃん?
        List<String> list = Arrays.asList("Scala", "Java", "Groovy");

        for (String str : list) {
            if ("Java".equals(str)) {
                break;
            }
            System.out.println(str); // => Scala
        }

        for (String str : list) {
            if ("Java".equals(str)) {
                continue;
            }
            System.out.println(str); // => Scala, Groovy
        }

        // 入れ子になったループは
        // label:
        // break outer;
        // 明示的に指定して抜ける必要がある
    }

    public static void n032() {
        // 例外
        try {
            new File("test").createNewFile();
        // IOExceptionが発生した場合
        } catch (IOException e) {
            System.out.println("ファイルの生成に失敗しました" + e.getMessage());
        }

        try {
            new File("test").createNewFile();
            // IOExceptionが発生した場合
        } catch (IOException e) {
            System.out.println("ファイルの生成に失敗しました" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception発生"); // 実行されない
        }

        try {
            // コンパイルできひん
            //new File("test").createNewFile();
        } finally {
            System.out.println("必ず実行される");
        }
    }

    public static void n033() {
        // 複数の例外をまとめてキャッチ
        try {
            Date date = new SimpleDateFormat("yyyyMMdd").parse("20140401");

            new File(String.format("新規ファイル%s.txt", date.getTime())).createNewFile();

        // ParseExceptionまたはIOExceptionが発生した場合
        } catch (ParseException | IOException e) {
            System.out.println("例外発生: " + e.getMessage());
        }

        // catch(fileNotFoundException | IOException e) コンパイルエラーになるよ
    }

    public void n034() throws IOException {
        // 例外をスローしたい
        File file = new File("test.txt");

        if (file.createNewFile()) {
            System.out.println("ファイルを作成しました");
        } else {
            // ファイルが既に存在する場合はIOExceptionをスロー
            throw new IOException("ファイルはすでに存在します。");
        }
    }

    public void n034_2() throws ParseException, IOException {
        // 複数例外スロー
    }

    public static void n035() {
        try (FileInputStream in = new FileInputStream("test.txt")) {
            // 読み込み処理
        } catch (IOException e) {
        }
    }

    // 37 - 41 はスキップで
    // 暇ならやる

    public static void n042() {
        // 文字列を連結したい
        String str = "Hello " + "World!";
        System.out.println(str);

        //String str2 = "";
        //for (long i = 0; i < Long.MAX_VALUE; i++) {
        //    str2 = str2 + " ";
        //}

        StringBuilder sb = new StringBuilder();
        sb.append("Hello ");
        sb.append("World!");

        String str3 = sb.toString();
        System.out.println(str3);
    }

    public static void n043() {
        String str = "こんにちは世界";
        int strlength = str.length();
        System.out.println(strlength);

    }

}
