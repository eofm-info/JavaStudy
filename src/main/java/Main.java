import info.efom.Gyakuhiki.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    /**
     * mainメソッド。
     * @param args
     */
    public static void main(String args[]) {
        System.out.println("hello world.");

        p("Example011");
        Study011.staticMemberImport();

        p("Example013");
        Study013.javaLiteral();

        p("Example014");
        Study014.numCal();

        p("Example015");
        Study015.bit();
        Study015.bit2();

        p("Example016");
        Study016.comp();

        p("Example017");
        Study017.piyo();

        p("Example019");
        Study.n019();

        p("Example020");
        Study.n020();

        p("Example023");
        Study.n023();

        p("Example027");
        Study.n027();

        p("Example028");
        Study.n028();

        p("Example029");
        Study.n029();

        p("Example030");
        Study.n030();

        p("Example031");
        Study.n031();

        p("Example032");
        Study.n032();

        p("Example033");
        Study.n033();

        p("Example042");
        Study.n042();

        p("Example043");
        Study.n043();

        p("Example063");
        HelloWorld instance  = new HelloWorld();
        String result = instance.getHello("Piyo");
        instance.printHello(result);

        p("Example064");
        N064Interface n064 = new N064Impl();
        n064.hello("n064 example");

        p("Example065");
        System.out.println(n064.n065DefaultMethod());

        p("Example066");
        N066 n066 = new N066();
        N066.Inner inner = n066.new Inner(); // ふむん
        n066.outerMethod();

        p("Example067");
        N067 n067 = new N067();

        p("Example068");
        N068Sub n068Sub = new N068Sub("n068 piyo");
        n068Sub.print();

        // TODO: piyo

        p("Example075");
        Study.compare(Sex.MAN);
        Study.n075();

        p("Example076");
        Color color1 = Sex.MAN;
        String n076str1 = color1.getColor();
        Color color2 = Sex.WOMEN;
        String n076str2 = color2.getColor();
        System.out.println(n076str1);
        System.out.println(n076str2);

        p("Example080");
        FileStore<FileOutputStream> store1 = new FileStore<>();
        // コンパイルエラー
        //FileStore<FileInputStream> store2 = new FileStore<>();

        // コンパイラを味方に！
        // -> コンパイラに、より多くの情報を伝える
        // アノテーション！

        // コンパイラの裏を書く
        // -> リフレクション

        // オブジェクトをJavaプロセスの外へ出したい
        // シリアライズ <-> デシリアライズ
        // マージャリング(ruby)

        p("Example086");
        Study.n086();
    }


    public static void p(String s) {
        System.out.println();
        System.out.println(s);
    }
}
