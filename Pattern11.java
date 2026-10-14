// Input : n = 4
// Output : 

// Solid Square:
// ****
// ****
// ****
// ****

// Hollow Square:
// ****
// *  *
// *  *
// ****


import java.util.Scanner;
class Pattern11{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        for(int j=1;j<=n;j++){
            for(int i=1;i<=n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=1;i<=n/2;i++){
            System.out.print("*");
            for(int j=1;j<=n-2;j++){
                System.out.print(" ");

            }
            System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            System.out.print("*");
        }

        
        
        
}
}