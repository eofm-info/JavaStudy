package info.efom.Gyakuhiki;

public class N066 {
    private String outerField = "outer ";

    public class Inner {
        private String innerField = "inner";

        public String innerMethod() {
            //outerMethod();
            return outerField + innerField;
        }
    }

    public void outerMethod() {
        Inner inner = new Inner();

        // インナークラスのprivateフィールドへアクセス可能
        System.out.println(inner.innerField);
        System.out.println(inner.innerMethod());

        StaticInner staticInner = new StaticInner();
        System.out.println(staticInner.sInnerField);
        System.out.println(staticInner.sInnerMethod());
    }

    public static class StaticInner {
        private String sInnerField = "static inner ";

        public String sInnerMethod() {
            //outerMethod(); // 呼べない
            return sInnerField;
        }
    }
}
