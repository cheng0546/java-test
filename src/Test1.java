import java.lang.reflect.Array;
import java.util.*;

public class Test1 {

    public static String reverseWords(String s) {
        String str = s.trim();
        List<String> arr = Arrays.asList(str.split(" +"));
        Collections.reverse(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.size(); i++) {
            sb.append(arr.get(i) + " ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        String[] str1 = s.split("");
        String[] str2 = t.split("");
        Arrays.sort(str1);
        System.out.println(str1.toString());
        Arrays.sort(str2);
        System.out.println(str2.toString());

        if (str1.toString().equals(str2.toString())) {
            System.out.println(true);
        }
        System.out.println(false);

        String str = "a good   example    ";
        System.out.println(reverseWords(str));

        String y = "100";
        System.out.println(Integer.valueOf(y));

        Set<String> set = new HashSet<>();
        System.out.println(set.add(null));


        String oldStr = "142.45d/2gh,45%s54*$ 5abR";
        String newStr = oldStr.replaceAll("[^0-9a-z ]", ""); // 只保留小写字母，数字和空格
        System.out.println(newStr);



    }
}
