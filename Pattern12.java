import java.util.Scanner;
class Pattern12{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
        for(int i=1;i<=m;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=1;i<=n-2;i++){
            System.out.print("*");
            for(int j=1;j<=m-2;j++){
                System.out.print(" ");

            }
            System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<=m;i++){
            System.out.print("*");
        }
    }
}

        