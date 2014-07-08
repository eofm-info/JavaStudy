package info.efom.Gyakuhiki;

import java.util.Comparator;

public class N067 {
    Comparator<String> comparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    };

    public void outer(final String message) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("N067! " + message);
            }
        };
    }
}
