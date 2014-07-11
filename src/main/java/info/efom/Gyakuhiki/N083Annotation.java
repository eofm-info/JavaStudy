package info.efom.Gyakuhiki;

import java.util.List;

/**
 * Created by jn on 2014/07/11.
 */
public class N083Annotation {
    @Override
    public String toString() {
        return "piyo";
    }

    @Deprecated
    public String getMessage() {
        return "非推奨メソッド";
    }

    @SuppressWarnings("rawtypes")
    public List getMessageList() {
        return null;
    }
}
