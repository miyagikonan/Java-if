import java.util.Scanner;

public class IfPractice02 {
    public static void main(String[] args) {
        System.out.println("数値を入力してください。");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        sc.close();
        var num = Integer.parseInt(s1);

        if (num >= 80) {
            System.out.println("A評価です");
        } else if (num >= 60 ) {
            System.out.println("B評価です");
        } else if (num >= 40 ) {
            System.out.println("C評価です");
        } else if (num >= 20 ) {
            System.out.println("D評価です");
        } else  {
            System.out.println("E評価です");
        }
    }
}
