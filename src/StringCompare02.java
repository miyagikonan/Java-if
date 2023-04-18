import java.util.Scanner;

public class StringCompare02 {
    public static void main(String[] args) {
        System.out.print("入力値1：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();

        System.out.print("入力値2：");
        var sc2 = new Scanner(System.in);
        var s2 = sc2.nextLine();

        sc.close();
        sc2.close();

        if(s1.equalsIgnoreCase(s2)) {
            System.out.println("入力値が一致しました");
        } else {
            System.out.println("入力値が一致しません");
        }
    }
}
