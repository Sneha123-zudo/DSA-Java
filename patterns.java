

public class patterns{
    public static void main(String args[]){
///        for(int i=1; i<=4; i++){
//          for(int j=1; j<=5; j++){
//              System.out.print("*");
//          }
//          System.out.println();
//      }


//        for(int i=1; i<=4; i++){
//            for(int j=1; j<=5; j++){
//                if(i==1 || j==1 || i==4 || j==5){
//                    System.out.print("*");
//
//                }
//                else{
//                    System.out.print(" ");
//
//                }
//            }
//            System.out.println();
//        }
    

//for(int i=1; i<=4; i++){
//    for(int j=1; j<=i ; j++) {
//        System.out.print("*");
//    } 
//System.out.println(" ");
//}

//for(int i=4 ; i>=1; i--){
//    for(int j=1; j<=i; j++){
//        System.out.print("*");
//    }
//    System.out.println();
//}

//for(int i=1 ; i<=4; i++){
//    for(int j = 1; j<=4-i; j++){
//        System.out.print(" ");
//    }
//        for(int j = 1; j<=i; j++){
//        System.out.print("*");
//    }
//    System.out.println();
//}

//for(int i = 1; i<=5; i++){
//    for(int j=1; j<=i; j++){
//        System.out.print(j);
//    }
//    System.out.println();
//}

//for(int i = 5; i>=1; i--){
//    for(int j=1; j<=i;j++){
//        System.out.print(j + " " );
//    }
//    System.out.println();
//}

//int num = 1;
//for(int i = 1; i<=5; i++){
//    for(int j=1; j<=i;j++){
//        System.out.print(num + " ");
//        num++;
//    }
//    System.out.println();
//}

//for(int i = 1; i<=5; i++){
//    for(int j=1; j<=i;j++){
//        if((i+j)%2==0){
//            System.out.print("1 ");
//        }
//        else{
//            System.out.print("0 ");
//
//        }
//    }
//    System.out.println();
//}

//for(int i =1; i<=5; i++){
//
//    for(int j = 1; j<=5-i; j++){
//        System.out.print(" ");
//    }
//    for(int j =1 ;j<=5; j++){
//               if(i==1 || j==1 || i==5 || j==5){
//                   System.out.print("*");
//               }
//               else{
//                   System.out.print(" ");
//               }
//           }
//
//    System.out.println(" ");
//}



//for(int i =1; i<=5; i++){
//
//    for(int j = 1; j<=5-i; j++){
//        System.out.print(" ");
//    }
//    for(int j =1 ;j<=i; j++){
//        System.out.print(i + " ");
//           }
//
//    System.out.println(" ");
//}


//for(int i =1; i<=5; i++){
//
//    for(int j = 1; j<=5-i; j++){
//        System.out.print(" ");
//    }
//    for(int j =i ;j>=1; j--){
//        System.out.print(j);
//    }
//    for(int j =2 ;j<=i; j++){
//        System.out.print(j);
//    }
//
//    System.out.println(" ");
//}


for(int i =1; i<=5; i++){

    for(int j = 1; j<=5-i; j++){
        System.out.print(" ");
    }
    for(int j =1 ;j<=2*i-1; j++){
        System.out.print("*");
           }

    System.out.println(" ");

    }
    for(int i =5; i>=1; i--){

    for(int j = 1; j<=5-i; j++){
        System.out.print(" ");
    }
    for(int j =1 ;j<=2*i-1; j++){
        System.out.print("*");
           }

    System.out.println(" ");

    }
 }
}
