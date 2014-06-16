import info.efom.Gyakuhiki.*;

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
    }

    public static void p(String s) {
        System.out.println();
        System.out.println(s);
    }
}
