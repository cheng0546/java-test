//import java.io.BufferedReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.Authenticator;
//import java.net.PasswordAuthentication;
//import java.net.URL;
//import java.net.URLConnection;
//import java.util.Collections;
//import java.util.Properties;
//import java.util.Scanner;
//
//import javax.jms.Session;
//import javax.mail.*;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//import java.security.GeneralSecurityException;
//
//public class Test {
//
////    public static boolean isExisted(int[] ints, int k) {
////        return Arrays.stream(ints).boxed().collect(Collectors.toList()).contains(k);
////    }
//
////    // 1.
////    public static void printNumber(int start, int end) {
////        for (int i = start; i <= end; i++) {
////            if (i % 3 == 0 && i % 7 == 0) {
////                System.out.println("OpenSource");
////            } else if (i % 3 == 0) {
////                System.out.println("Open");
////            } else  if (i % 7 == 0) {
////                System.out.println("Source");
////            } else {
////                System.out.println(i);
////            }
////        }
////    }
//
////    // 2.
////    int target;
////    int count = 0;
////
////    Test(int target) {
////        this.target = target;
////    }
////
////    public int verify(int guess) {
////        return Integer.compare(target, guess);
////    }
////
////    public void guessNumber(int start, int end) {
////        int mid = start + (end + 1 - start) / 2;
////        count++;
////        int result = verify(mid);
////        System.out.printf("The guessed number is : %d, guessed %d times \n", mid, count);
////        if (result == 0 && count <= 50) {
////            System.out.println("WIN !");
////            System.out.println("The solution is : " + mid);
////        } else if (result == 1) {
////            guessNumber(mid, end);
////        } else if (result == -1) {
////            guessNumber(start, mid);
////        } else {
////            System.out.println("LOSE !");
////        }
////    }
//
////    // 8.
////    public static final String PATTERN = "(?=.*Odoo)(?=.*#rules).*";
////
////    public static boolean isContained(String content) {
////        return Pattern.matches(PATTERN, content);
////    }
//
////    // 9.
////    function getAlphabetArray() {
////        var alphabetArray = new Array();
////        for (var i = 0; i < 26; i++) {
////            alphabetArray.push(String.fromCharCode(65 + i));
////        }
////        return alphabetArray;
////    }
//
//
////    public static int getSum(String[] strings) {
////        int sum = 0;
////        for (String str : strings) {
////            if (isInteger(str)) {
////                sum += Integer.parseInt(str);
////            }
////        }
////        return sum;
////    }
//
////    public static boolean isInteger(String str) {
////        boolean result = true;
////        try {
////            Integer.valueOf(str);
////        } catch (Exception e) {
////            result = false;
////        }
////        return result;
////    }
////
////    public static int getSum(String[] strings, int index, int sum) {
////        if (index >= strings.length) {
////            return sum;
////        }
////        if (isInteger(strings[index])) {
////            sum += Integer.parseInt(strings[index]);
////        }
////        return getSum(strings, index + 1, sum);
////    }
//
////    public static void downloadNet() throws MalformedURLException {
////        // 下载网络文件
////        int bytesum = 0;
////        int byteread = 0;
////
////        URL url = new URL("https://www.sap.com/belgique/index.html");
////
////        try {
////            URLConnection conn = url.openConnection();
////            InputStream inStream = conn.getInputStream();
////            FileOutputStream fs = new FileOutputStream("/Users/cheng/Downloads/newTest");
////
////            byte[] buffer = new byte[1204];
////            int length;
////            while ((byteread = inStream.read(buffer)) != -1) {
////                bytesum += byteread;
////                System.out.println(bytesum);
////                fs.write(buffer, 0, byteread);
////            }
////        } catch (FileNotFoundException e) {
////            e.printStackTrace();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////    }
//
//
//
//    public static void sendEmail(String email) {
//        //创建一个配置文件并保存
//        Properties properties = new Properties();
//
//        properties.setProperty("mail.host","smtp.qq.com");
//
//        properties.setProperty("mail.transport.protocol","smtp");
//
//        properties.setProperty("mail.smtp.auth","true");
//
//
//        //QQ存在一个特性设置SSL加密
//        MailSSLSocketFactory sf = new MailSSLSocketFactory();
//        sf.setTrustAllHosts(true);
//        properties.put("mail.smtp.ssl.enable", "true");
//        properties.put("mail.smtp.ssl.socketFactory", sf);
//
//        //创建一个session对象
//        Session session = Session.getDefaultInstance(properties, new Authenticator() {
//            @Override
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication("619046217@qq.com","16位授权码");
//            }
//        });
//
//        //开启debug模式
//        session.setDebug(true);
//
//        //获取连接对象
//        Transport transport = session.getTransport();
//
//        //连接服务器
//        transport.connect("smtp.qq.com","619046217@qq.com","16位授权码");
//
//        //创建邮件对象
//        MimeMessage mimeMessage = new MimeMessage(session);
//
//        //邮件发送人
//        mimeMessage.setFrom(new InternetAddress("619046217@qq.com"));
//
//        //邮件接收人
//        mimeMessage.setRecipient(Message.RecipientType.TO,new InternetAddress("875203654@qq.com"));
//
//        //邮件标题
//        mimeMessage.setSubject("Hello Mail");
//
//        //邮件内容
//        mimeMessage.setContent("我的想法是把代码放进一个循环里","text/html;charset=UTF-8");
//
//        //发送邮件
//        transport.sendMessage(mimeMessage,mimeMessage.getAllRecipients());
//
//        //关闭连接
//        transport.close();
//    }
//
//    public static void main(String[] args) {
//
////        int[] ints = new int[]{1, 3, 5, 6};
////        int m = 3;
////        int n = 4;
////        System.out.println(isExisted(ints, m));
////        System.out.println(isExisted(ints, n));
//
//        // 1.
////        printNumber(1, 99);
//
////        // 2.
////        Test test = new Test(1000000);
////        test.guessNumber(1, 1000000);
//
////        // 8.
////        boolean isMatched = isContained("Hello, this is Odoo, please read the #rules carefully.");
////        System.out.println(isMatched);
//
////        String[] strings = {"abc", "aa", "2", "4"};
////        System.out.println(getSum(strings, 0, 0));
//
//
////        String result = "";
////        BufferedReader buffer = null;
////        try {
////            String urlNameString = "https://www.sap.com/belgique/index.html";
////            URL url = new URL(urlNameString);
////            URLConnection connection = url.openConnection();
////            connection.setRequestProperty("accept", "*/*");
////            connection.setRequestProperty("connection", "Keep-Alive");
////            connection.setRequestProperty("user-agent",
////                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
////            connection.connect();
////            buffer = new BufferedReader(new InputStreamReader(
////                    connection.getInputStream()));
////            String line;
////            while ((line = buffer.readLine()) != null) {
////                result += line.replaceAll("SAP", "Odoo");
////            }
////            System.out.println(result);
////        } catch (Exception e) {
////            System.out.println(e);
////            e.printStackTrace();
////        }
////        finally {
////            try {
////                if (buffer != null) {
////                    buffer.close();
////                }
////            } catch (Exception e2) {
////                e2.printStackTrace();
////            }
////        }
////        FileWriter writer;
////        try {
////            writer = new FileWriter("/Users/cheng/Downloads/newTest/token.txt");
////            writer.write(result);
////            writer.flush();
////            writer.close();
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
//
////        String address = new String("上海\\上海市|闵行区\\吴中路");
////        String[] splitAddress=address.split("\\\\|\\|");
////        System.out.println(splitAddress[2]);
//
////        Scanner scanner = new Scanner(System.in);
////        String[] scores = scanner.nextLine().split(" ");
////        System.out.printf("score1 = %d, score2 = %d, score3 = %d", Integer.parseInt(scores[0]), Integer.parseInt(scores[1]), Integer.parseInt(scores[2]));
//    }
//}
