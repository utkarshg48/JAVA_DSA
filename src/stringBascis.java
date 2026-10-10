import java.util.Scanner;

public class stringBascis {

    //CHECK STRING IS PALINDROME OR NOT
    static void palindromeString(String str){
        String newstr="";
       for(int i=str.length()-1;i>=0;i--){
           char ch=str.charAt(i);
            newstr=newstr+ch;
        }
        if(str.equals(newstr)) {
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not Plaindrome");
        }
    }






//    //REVERSE A STRING
//    static String reverseString(String str){
//        String newstr="";
//        for(int i=str.length()-1;i>=0;i--){
//            char ch=str.charAt(i);
//            newstr=newstr+ch;
//        }
//        return newstr;
//    }









    //COUNT VOWEL IN A STRING
//    static int countVowel(String str){
//        int count=0;
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
//                count++;
//            }
//
//
//
//        }
//        return count;
//    }





   static void main() {
     String str="nitin";
     palindromeString(str);
//       String value=reverseString(str);
//        System.out.println(value);
//        String lastName= new String("Gupta");
//        System.out.println(lastName);
//        System.out.println(firstName.length());
//        System.out.println(firstName.charAt(2));

//        String str1="Harman";
//        String str2= new String("harman");
//        if(str1==str2){
//            System.out.println("Harman is devansh ");
//        }
//        else{
//            System.out.println("Harman is not devansh ");
//        }
//
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equalsIgnoreCase(str2));

//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the input string : ");
//        String str=sc.nextLine();
//        System.out.println("Value of nextLine   "+ str);
//
//        String str2=sc.next();
//        System.out.println("Value of next   "+ str2);

//        String str="Utkarsh";
//        for(int i=0;i<str.length();i++){
//            System.out.println(str.charAt(i));
//        }

        //COUNT LENGTH OF STRING WITHOUT LENGTH FUNCITINO
//        String str="Harman";
//        int len=0;
//        char[] arr=str.toCharArray();
//        for(char value :arr){
//            len=len+1;
//        }
//        System.out.println(len);
    }
}


