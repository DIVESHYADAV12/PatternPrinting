// Input : 6
// Output :
// * *
// * *
// * * * *
// * * * *
// * * * * * *
// * * * * * *

import java.util.Scanner;
class Pattern13{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n/2;i++){
        for(int j=1;j<=i*2;j++){
            System.out.print("* ");
        }
        System.out.println();
        for(int j=1;j<=i*2;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
        
    }
}

        