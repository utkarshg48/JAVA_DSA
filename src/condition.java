import java.util.Scanner;

public class condition {
    static void main() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("write the daily practice number :");
//        int dailyPractice= sc.nextInt();
//
//
//        if(dailyPractice>=10){
//            System.out.println("Good Consistency ");
//        }
//        else{
//            System.out.println("Bad consistency5");
//        }

//            int streakDays=20;
//            String status= (streakDays>=30)?"Consistent":"Not Consistent";
//        System.out.println(status);

        int dayNumber=5;
        switch(dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day ");
        }




    }
}
