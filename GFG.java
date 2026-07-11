import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
/* 
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
/*
class GFG {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,2,8,6,20,47);
        // List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Stream<Integer> result = arr.stream()
                        .filter(n -> n % 2 == 0)
                        .map(n-> n +2)
                        .sorted();

        result.forEach(n ->System.out.println(n));
    }
}
*/

