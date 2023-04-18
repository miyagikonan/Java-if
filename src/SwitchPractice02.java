import java.util.Scanner;

public class SwitchPractice02 {
    public static void main(String[] args) {
        System.out.println("入力値：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        sc.close();

//        switch(s1) {
//            case "品川" -> System.out.println("東京まで 田町 浜松町 新橋 有楽町 を通過します");
//            case "田町" -> System.out.println("東京まで 浜松町 新橋 有楽町 を通過します");
//            case "浜松町" -> System.out.println("東京まで 新橋 有楽町 を通過します");
//            case "新橋" -> System.out.println("東京まで 有楽町 を通過します");
//        }

        var str = "東京まで ";

        switch(s1) {
            case "品川": str += "田町 ";
            case "田町": str += "浜松町 ";
            case "浜松町": str += "新橋 ";
            case "新橋": str += "有楽町 ";

            default:System.out.println(str + "を通過します");
                break;

        }


    }
}
