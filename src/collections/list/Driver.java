package collections.list;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        MyArrayList<String> ml = new MyArrayList<>();
        ml.add("Hello");
        ml.add("World");
//        ml.addAll("World", MyArrayList);

        String[] str = new String[ml.size()];
        ml.toArray(str);

        System.out.println(Arrays.toString(str));
        System.out.println(ml);
    }
}
