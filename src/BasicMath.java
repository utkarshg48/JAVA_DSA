public class BasicMath {
    //REVERSE A NUMBER
    static void sumDigits(int num){
        String reverse="";
        while(num!=0){
            int digit=num%10;
            reverse=reverse+digit;
            num=num/10;
        }
        System.out.println(reverse+" ");
    }



    //SUM OF A DIGITS OF A NUMBER
//    static void sumDigits(int num){
//        int sum=0;
//        while(num!=0){
//            int digit=num%10;
//            sum=sum+digit;
//            num=num/10;
//        }
//        System.out.println(sum);
//    }




    //COUNT DIGITS OF A NUMBER
//    static void countDigits(int num){
//        int count=0;
//        while(num!=0){
////            int digit=num%10;
//            num=num/10;
//            count++;
//        }
//        System.out.println(count);
//    }






    //PRINT DIGITS
//    static void printDigits(int num){
//        while(num!=0){
//            int digit=num%10;
//            System.out.println(digit);
//            num=num/10;
//        }
//    }

    public static void main(String args[]){
        int num=6345 ;
        sumDigits(num);
    }

}
