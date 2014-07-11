package info.efom.Gyakuhiki;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jn on 2014/07/08.
 */
public class GenericsClass<T> {
    private T data;

    public GenericsClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public static <E> List<E> toList(E e) {
        return Arrays.asList(e);
    }
}
