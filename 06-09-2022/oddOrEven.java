package ZohoGraduationSchool;
import java.util.Scanner;
public class oddOrEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();

        if((number&1)==1)
            System.out.println("The number is odd");
        else
            System.out.println("The number is even");
    }
}
