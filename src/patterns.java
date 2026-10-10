public class patterns {
    static void
    main() {
//        RECTANGLE
//        for(int i=1;i<=3;i++){
//            for(int j=1;j<=5;j++){
//                System.out.print("* ");
//            }
//            System.out.println( );
//        }

//           RIGHT ANFLE TRIANGLE
//        int n=5;
//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=row;col++){
//                System.out.print("* ");
//            }
//            System.out.println(
//            );
//
//
//        }

//        RHOMBUS
//        int n=5;
//        for(int row=1 ;row<=n;row++){
//            //for each row -> spaces and stars
//
//            //spaces
//            for(int col=1;col<=n-row;col++){
//                System.out.print("  ");
//            }
//            //stars
//            for(int col=1;col<=n;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //INVERTED RIGHT ANGLE TRIANGLE
//         int n=5;
//          for( int row=1;row<=n;row++){
//              for( int col=1; col<=n-row+1;col++){
//                  System.out.print("* ");
//              }
//              System.out.println();
//          }

        //SOLID PYRAMID
//        int n=5;
//        for(int row=1;row<=n;row++){
//            //spaces
//            for( int col=1;col<=n-row;col++){
//                System.out.print("  ");
//            }
//
//            //stars
//            for(int col=1;col<=2*row-1;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }

         //HPLLOW RECTANGLE PATERN
//        int n=4;
//        for(int row=1;row<=n;row++) {
//            //for each row 6 col
//            //part 1
//            for (int col = 1; col <= 6; col++) {
//                if (row == 1 || row == n) {
//                    System.out.print("* ");
//                } else {
//                    //middle rows
//                    if (col == 1) {
//                        System.out.print("* ");
//                    } else if (col == 6) {
//                        System.out.print("* ");
//                    } else {
//                        //middle columns
//                        System.out.print("  ");
//                    }
//                }
//            }
//            //move to next row
//            System.out.println();
//        }

        //HOLLOW RIGHT ANGLE TRIANGE
//        int n=5;
//        for(int row=n;row<=n;row++){
//            //part 1
//            for(int col=1; col<=row;col++){
//                if(row==1 || row==2 || row==n){
//                    System.out.print("* ");
//                }
//            }
//        }

        //HOLLOW PYRAMID
//        int n=5;
//        for(int row=1;row<=n;row++){
//            //part 1 ->spaces
//            for(int col=1;col<=n-row;col++){
//                System.out.print("  ");
//            }
//
//            //part 2
//            if(row==1 || row==n){
//                for(int col=1;col<=(2*row-1);col++){
//                    System.out.print("* ");
//                }
//            }
//            else{
//                //middle rows
//                //1*
//                System.out.print("* ");
//
//                //spaces
//                for(int col=1;col<=(2*row-3);col++){
//                    System.out.print("  ");
//                }
//
//                //1*
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //ANOTHER PATTERN
//        int n=4;
//        for( int row=1;row<=n;row++){
//
//            //PART1
//            for(int col=1;col<=row;col++){
//                System.out.print("* ");
//            }
//
//            //PART2
//            for(int col=1;col<=2*(n-row);col++){
//                System.out.print("  ");
//            }
//
//            //PART3
//            for(int col=1;col<=row;col++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//        //INVERTED SYMMETRICAL HALF
//
//        for(int row=1;row<=n;row++){
//            //PART 4
//            for(int col=1;col<=n-row+1;col++){
//                System.out.print("* ");
//            }
//
//            //PART 5
//            for(int col=1;col<=2*(row-1);col++){
//                System.out.print("  ");
//            }
//
//            //PART 6
//             for(int col=1;col<=n-row+1;col++){
//                 System.out.print("* ");
//             }
//             //move to next row
//            System.out.println();
//        }

        //NUMBERED RIGHT ANGLE TRIANGLE PATTERN
//        int n=5;
//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=row;col++){
//                System.out.print(col+" " );
//            }
//            System.out.println();
//        }

        //ANOTHER PATTERN
//        int n=5;
//        int count=1;
//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=row;col++) {
//
//                System.out.print(count+" ");
//                count++;
//            }
//            System.out.println();
//        }

        //ABCD PATTERN
//        int n=4;
//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=row;col++){
//                System.out.print((char)(64+col)+" ");
//            }
//            System.out.println();
//        }

        //ANOTHER PATTERN
//        int n=5;
//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=row;col++){
//                int a=n-col;
//                int b='A';
//                int ans=a+b;
//                char finalAns=(char)ans;
//                System.out.print(finalAns+" ");
//
//
//            }
//            System.out.println();
//        }

        //PYRAMID 1,2,3 PATTERN
        int n=4;
        for(int row=1;row<=n;row++){
            //PART 1
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }

            //PART 2
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            //PART 3
            int rowValue=row;
            int decrowValue=row-1;
            for(int col=1;col<=row-1;col++){
                System.out.print(decrowValue+" ");
                decrowValue--;
            }


            System.out.println();
        }








    }
}
