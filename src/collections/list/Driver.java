package collections.list;


import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {

        //ArrayList

//        MyArrayList<Integer> ml = new MyArrayList<>();
//        ml.add(1);
//        ml.add(2);
//        ml.add(3);
//        ml.add(4);
//        System.out.println("ArrayList "+ml);
//
//        Object[] ar1 = ml.toArray();
//        System.out.println("ToArray " + Arrays.toString(ar1));


//        MyArrayList<String>  marvel = new MyArrayList<>();
//        marvel.add("Iron man");
//        marvel.add("Hulk");
//        marvel.add("Captain america");
//        marvel.add("Thor");
//        System.out.println("marvel: " + marvel.toString());
//
//        MyArrayList<String>  movies = new MyArrayList<>();
//        movies.add("Untouchable");
//        movies.add("Spiderman");
//        movies.add("Greenbook");
//        System.out.println("movies: " + movies.toString());
//
//        movies.addAll(1, marvel);
//        System.out.println("movies: " + movies.toString());


        //LinkedList

        MyLinkedList<Integer> ll = new MyLinkedList<>();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);

        System.out.println(ll);

        ll.remove(30);

        System.out.println(ll);




    }
}
