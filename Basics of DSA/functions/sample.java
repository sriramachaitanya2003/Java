import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class sample {
    public static void main(String args[]) {
        List<Integer> sqVals = Arrays.asList(25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 255);
        List<Integer> origValues = sqVals.stream().map(i -> (int) Math.sqrt(i)).collect(Collectors.toList());

        Map<Integer, Integer> mapSquare = new HashMap<>();
        mapSquare = IntStream.range(0, origValues.size())
                .boxed()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toMap(origValues::get, sqVals::get));
        
        mapSquare.forEach((key, value) -> System.out.printf("%d: %d\n", key, value));
}
}
