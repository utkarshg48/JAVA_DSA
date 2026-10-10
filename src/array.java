import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        //MAX ELEMENT In AN 2D ARRAY
        int arr[][]={{12,34,46},{34,57,6},{34,56}};
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);





//        int arr[][]={{12,34,46},{34,57,6},{34,56}};
//        int sum=0;
//        for(int i=0;i<=arr.length-1;i++){
//            for(int j=0;j<=arr[i].length-1;j++){
//                sum=sum+arr[i][j];
//            }
//        }
//        System.out.println(sum);





//        Scanner sc = new Scanner(System.in);
//
//
//        //2D ARRAY
//        //declaration
//        int[][] arr;
//        //allocation
//        arr=new int[3][4];
//
//        //initialization
//        int[][] brr= new int[2][2];
//
//
//        System.out.println("Enter the 2d Array elements: ");
//        for(int i=0;i<=brr.length-1;i++){
//            for(int j=0;j<=brr[i].length-1;j++){
//                System.out.print("Enter the element: "+i +" Row and "+j +" Column");//because it could have diff no. of columns
//                brr[i][j]=sc.nextInt();
//            }
//            System.out.println();
//        }









//        //FIND MAX VALUE INSIDE AN ARRAY
//        int arr[]={2,34,-5,67,45};
//        int n=arr.length;
//        int min=arr[0];
//        for(int i=0;i<=n-1;i++){
//            if(arr[i]<min){
//                min=arr[i];
//            }
//        }
//        System.out.println(min);







//        Scanner sc = new Scanner(System.in);
//        int arr[]=new int[5];
//        int n=arr.length;
//        for(int i=0;i<=n-1;i++){
//            arr[i]=sc.nextInt();
//        }
//
//        int sum=0;
//        for(int i=0;i<=n-1;i++){
//            sum=sum+arr[i];
//        }
//        System.out.println("the sum is "+sum);

//        //declaration
//        int arr[];
//
//        //Alocation
//        arr = new int[5];
//
//        //initialization
//        int brr[] = {5, 6, 7, 8,};
////        brr[2]=25;
////        System.out.println(brr[2])
//        int n=brr.length;
////        for(int i=0;i<=n-1;i++){
////            System.out.println(brr[i]);
////        }
//
//        //for each loop
//        for(int val:brr){
//            System.out.println(val);
//        }



    }
}
