import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStream {

    public static Stream<String> createStream() throws FileNotFoundException {
//        // 1. Collections - stream(), parallelStream()
//        List<Integer> list = new ArrayList<>();
//        Stream<Integer> stream = list.stream();
//        Stream<Integer> parallelStream = list.parallelStream();

//        // 2. Arrays - stream()
//        Integer[] nums = new Integer[10];
//        Stream<Integer> stream = Arrays.stream(nums);

//        // 3. Stream - of(), generate(), iterate()
//        Stream<Integer> streamOf = Stream.of(1, 2, 3, 4);
//        Stream<Double> streamGenerate = Stream.generate(Math::random).limit(4);
//        Stream<Integer> streamIterate = Stream.iterate(0, (x) -> x + 2).limit(4);

//        // 4. BufferedReader.line()
//        BufferedReader reader = new BufferedReader(new FileReader("/txt.txt"));
//        Stream<String> stream = reader.lines();

        // 5. Pattern.splitAsStream()
        Pattern pattern = Pattern.compile(",");
        Stream<String> stream = pattern.splitAsStream("a, b, c, d");

        return stream;
    }

    public static void main(String[] args) {
//        System.out.println(IntStream.range(0, 4).sum());

//        // 1. 筛选与切片
//
//        Stream<Integer> stream = Stream.of(6, 4, 6, 7, 3, 9, 8, 10, 12, 14, 14);
//
//        Stream<Integer> newStream = stream.filter(s -> s > 5) // 过滤不符合条件的元素 6 6 7 9 8 10 12 14 14
//                .distinct() // 去重 6 7 9 8 10 12 14
//                .skip(2) // 跳过前n个元素 9 8 10 12 14
//                .limit(2); // 获取前n个元素 9 8
//        newStream.forEach(System.out::println);
//
//        // 2. 映射
//
        List<String> list = Arrays.asList("a,b,c", "1,2,3");
        //将每个元素转成一个新的且不带逗号的元素
        Stream<String> s1 = list.stream().map(s -> s.replaceAll(",", ""));
        s1.forEach(System.out::println); // abc  123
        Stream<String> s3 = list.stream().flatMap(s -> {
            //将每个元素转换成一个stream
            String[] split = s.split(",");
            System.out.println(split);
            Stream<String> s2 = Arrays.stream(split);
            return s2;
        });
        s3.forEach(System.out::println); // a b c 1 2 3


//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24);
//
//        Integer v = list.stream().reduce((x1, x2) -> x1 + x2).get();
//        System.out.println(v);   // 300
//
//        Integer v1 = list.stream().reduce(10, (x1, x2) -> x1 + x2);
//        System.out.println(v1);

    }



}
