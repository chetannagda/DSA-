import java.util.Scanner;
public class PowerFunctionWithoutUsingMathPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        System.out.print("Enter the Power : ");
        int pow = sc.nextInt();
        int result = 1;
        for (int i = 1; i<=pow; i++){
            result *= num;
            System.out.println(result);
        };
    }
}
