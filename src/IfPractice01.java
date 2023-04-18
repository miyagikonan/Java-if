import java.util.Scanner;

public class IfPractice01 {
    public static void main(String[] args) {
        System.out.println("数値を入力してください。");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var num1 = Integer.parseInt(s1);

        var str = num1 >= 60 ? "合格です" : "不合格です";
        System.out.println(str);

//        if(num1 >= 60) {
//            System.out.println("合格です");
//        } else {
//            System.out.println("不合格です");
//        }
        sc.close();
    }
}
