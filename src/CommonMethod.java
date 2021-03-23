import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonMethod {
    public static void main(String[] args) {
        // 1. 数组

        System.out.println("------数组-------");
        // 1.1 声明方法
        System.out.println("------1.1-------");
        String[] aArray = new String[5];
        String[] bArray = {"a","b","c", "d", "e"};
        String[] cArray = new String[]{"a","b","c","d","e"};

        // 1.2 排序
        System.out.println("------1.2-------");
        int[] intArray = {1, 342, 25, 6, 8, 13, 52, 32, 12, 55, 178};
        // Arrays.sort()排序的实现是快速排序
        Arrays.sort(intArray);

        // 1.3 打印数组
        System.out.println("------1.3-------");
        //循环打印
        for (int i : intArray) {
            System.out.println(i);
        }
        // Arrays.toString()转为String打印
        String arrayToString = Arrays.toString(intArray);
        System.out.println(arrayToString);

        // 1.4 数组转为列表
        System.out.println("------1.4-------");
        // 方法一：Arrays.asList()不能对基本类型如int，byte，char等数组转换，只能对引用类型Integer，Byte，Character数组转换
        // String类型可用asList转换，基本类型可以使用其他方法
        // Arrays.asList返回值是java.util.Arrays类中一个私有静态内部类java.util.Arrays.ArrayList，
        // 它并非java.util.ArrayList类，java.util.Arrays.ArrayList类具有 set()，get()，contains()等方法，
        // 但是不具有添加add()或删除remove()方法，所以不能对转换完对list进行添加删除操作，只能查找
        List<String> list = Arrays.asList(bArray);
        list.forEach(item -> {
            System.out.println(item);
        });
        // 方法二：对方法一的改进（添加和删除操作）
        // 通过ArrayList的构造器，将Arrays.asList(strArray)的返回值由java.util.Arrays.ArrayList转为java.util.ArrayList
        // 使用场景：需要在将数组转换为List后，对List进行增删改查操作，在List的数据量不大的情况下，可以使用。
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(bArray));
        strList.add("f");
        strList.forEach(System.out::println);
        // 方法三：通过Collections.addAll(arrayList, strArray)方式转换，根据数组的长度创建一个长度相同的List，
        // 然后通过Collections.addAll()方法，将数组中的元素转为二进制，然后添加到List中，这是最高效的方法。
        // 使用场景：需要在将数组转换为List后，对List进行增删改查操作，在List的数据量巨大的情况下，优先使用，可以提高操作速度。
        ArrayList<String> strList2 = new ArrayList<>();
        Collections.addAll(strList2, bArray);
        // 方法四：Java8以上，通过流stream转换（仅int[], long[], double[]）
        List<Integer> intList = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        // String数组：
        List<String> strList3 = Stream.of(bArray).collect(Collectors.toList());

        // 1.5 列表转为数组
        System.out.println("------1.5-------");
    }
}
