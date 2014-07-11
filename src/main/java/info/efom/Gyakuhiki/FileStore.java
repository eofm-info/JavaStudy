package info.efom.Gyakuhiki;

import java.io.OutputStream;
import java.io.Serializable;

/**
 * Created by jn on 2014/07/08.
 */
public class FileStore<T extends OutputStream> {

    private <E extends Serializable & Comparable<E>> int compare(E data1, E data2) {
        return data1.compareTo(data2);
    }
}
