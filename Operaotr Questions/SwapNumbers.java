public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = a;

        a=b;
        b=c;

        a = a+b;
        b = a-b;
        a = a-b;
    
        System.out.println("Here is the value of a "+a);
        System.out.println("Here is the value of b "+b);
    }
    
}
