import java.util.Scanner;

public class inputoutput {
    static void main() {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of first num");
        int firstNum=sc.nextInt();

        System.out.println("Enter the value of second num");
        int secondNum=sc.nextInt();

        int ans=firstNum+secondNum;
        System.out.println("Answer is: "+ans);
        System.out.println("Enter the marks in decimal ");
        float marks=sc.nextFloat();
        System.out.println("Your marks is :"+marks);

        sc.close();



    }
}
