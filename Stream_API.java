
/*
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Demo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // System.out.println(list);
        // for(int i =0;i<list.size();i++){
        //     System.out.print(list.get(i) + " ");
        // }
        // list.forEach(n->System.out.println(n));
        // list.forEach(action);
        // Consumer<String> con = 
        // Stream<Integer> s1=list.stream();
        // Stream<Integer> s2= s1.filter(n -> n % 2 == 0);
        // Stream<Integer> s3 =s2.map(n -> n*2);
        // int result = s3.reduce(0,(c,e) -> c + e);
        int result = list.stream()
                        .filter(n -> n % 2 == 0)
                        .map(n -> n * 2)
                        .reduce(0, (c, e) -> c + e);

        System.out.println(result);

        // s1.forEach(S -> System.out.print(S + " "));
        // System.out.println("-------------------------");
        // s3.forEach(S -> System.out.print(S + " "));
    }
}
*/

/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int result = arr.stream()
                        .filter(n -> n % 2 == 0)
                        .map(n -> n * 2)
                        .reduce(0, (c, e) -> c + e);
        System.out.println(result);
    }
}
