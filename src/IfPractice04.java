import java.util.Scanner;

public class IfPractice04 {
    public static void main(String[] args) {
        System.out.println("数値を入力してください。");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        sc.close();
        var num = Integer.parseInt(s1);

        if (num % 4 == 0 && (num % 100 != 0 || num % 400 == 0)) {
            System.out.println("閏年です");
        }
    }
}
//        西暦の年が4で割り切れること。
//        ただし、100で割り切れる年はうるう年ではないこと。
//        ただし、400で割り切れる年はうるう年であること。
