package info.efom.Gyakuhiki;

/**
 * Created by jn on 2014/07/08.
 */
public enum Sex implements Color {
    MAN{
        @Override
        public String getColor() {
            return "青";
        }
    },
    WOMEN{
        @Override
        public String getColor() {
            return "赤";
        }
    };
}
