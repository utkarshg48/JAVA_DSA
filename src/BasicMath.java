public class BasicMath {
    //PRIME NUMBER
    static void primeCheck(int num){
        for(int i=2;i<=num-1;i++){ //or i<num since num can be divided by 1 and itself
            if(num%i==0){
                System.out.println("the number is not prime ");

            }
            else{
                System.out.println("The Number is Prime ");

            }
        }
    }





//    //REVERSE and PALINDROME CHECKER A NUMBER
//    static void reverseDigits(int num){
//        int originalNum=num;
//
//        int revNum=0;
//        while(num!=0){
//            int digit=num%10;
//            revNum=revNum*10+digit; //REVERSE A NUMBER LOGIC
//            num=num/10;
//        }
//        System.out.println(revNum);
//        if(originalNum==revNum){  //NUM BECOMES ZERO FROM THE LOOP, SO WE CANNOT COMPARE NUM WITH revNum
//            System.out.println("the Number is palindrome");
//        }
//        else{
//            System.out.println("The Number is not Palindrome ");
//        }
//    }



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
        int num=11;
        primeCheck(num);
//        reverseDigits(num);
    }

}
