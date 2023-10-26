import java.util.Scanner;
class WithoutTemporaryVariable {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first value");
        int a= scan.nextInt();
        System.out.println("Enter the second value");
        int b= scan.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
