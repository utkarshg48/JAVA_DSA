public class BasicMath {
    /


//    static void printAllPrimeNumber(int num){
//        System.out.println(1);
//        for(int i=2;i<=num;i++){
//            if(num%i!=0){
//                System.out.println(i);
//            }
//        }
//    }



    static boolean checkPerfectNumber(int num){
        int sum=1;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                int firstFactor=i;
                int secondFactor=num/i;
                sum=sum+firstFactor+secondFactor;
            }
        }
        if(sum==num){
            return true;
        }
        else{
            return false;
        }
    }




    static boolean checkArmstrong(int num){
        int originalNum=num; //FROM THE LOOP NUM BECOMES ZERP AT THE END, SO WE TAKE CREATE THIS VARIABLE TO COMAPRE IT WITH THE SUM
        int sum=0;
        while(num!=0){
            int digit=num%10;  //This gives the last digit
            sum=sum+digit*digit*digit;
            num=num/10;  //REMOVES THE LAST DIGIT
        }
        if(originalNum==sum){
            return true;
        }
        return false;
    }


    //GCD OF TWO NUMBERS
    static int getGcd(int a,int b){
        while(b!=0){
            int oldValueOfB=b;
            b=a%b;
            a=oldValueOfB;
        }
        int ans=a;
        return ans;
    }

    //GET LCM
    static int getLcm(int a,int b){
        int gcd=getGcd(a,b);
        int product=a*b;
        int lcm=product/gcd;
        return lcm;
    }




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
        int num=7;
//        printAllPrimeNumber(num);
//        System.out.println(checkPerfectNumber(num));
//        System.out.println(checkArmstrong(num));
//        System.out.println(getGcd(18,12));
//        System.out.println(getLcm(18,12));
//        primeCheck(num);
//        reverseDigits(num);
    }

}
