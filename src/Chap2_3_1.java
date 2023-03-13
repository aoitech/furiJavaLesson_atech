import java.util.Scanner;
public class Chap2_3_1 {
    public static void main(String[] args) {
        System.out.println("年齢は？");
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        if ( age < 20 ) {
            System.out.println("あなたは" + age + "歳です\nあなたは未成年です");
        } else {
            System.out.println("あなたは" + age + "歳です\nあなたは成人しています");
        }
        System.out.println("ブロック外だよ");
    }
}
