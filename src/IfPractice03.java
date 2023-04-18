import java.util.Scanner;

public class IfPractice03 {
    public static void main(String[] args) {
        System.out.println("数値を入力してください。");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        sc.close();
        var num = Integer.parseInt(s1);

        if (num >= 60 && num % 2 == 0) {
            System.out.println(num);
        } 
    }
}
