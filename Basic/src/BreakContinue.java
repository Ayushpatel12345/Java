public class BreakContinue {
    public static void main(String[] args) {
//        System.out.print("break : ");
//        for (int i=1 ; i<=10 ; i++){
//             if (i == 5){
//                 break;
//             }
//              System.out.print(i + " ");
//        }
//
//        System.out.print("\ncontinue : ");
//        for (int j=1 ; j<=10 ; j++){
//            if (j == 5){
//                continue;
//            }
//            System.out.print(j + " ");
//        }
          System.out.println("label break : ");
          external : for (int p=1 ; p<=8 ; p++){
              internal : for (int q=1 ; q<=8 ;q++){
                  System.out.print(q);
                  if (p==4){
                      break external;
                  }
                  System.out.println();
              }
          }
    }
}
