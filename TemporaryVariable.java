import java.util.Scanner;
class TemporaryVariable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scan.nextInt();
        System.out.println("Enter the second number");
        int b= scan.nextInt();
        int c=a; //temporary variable
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }
}