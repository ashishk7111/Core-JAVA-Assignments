import java.util.Scanner;

class twentythree{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int ar[]=new int[5];

        for(int i=0;i<5;i++){

            ar[i]=sc.nextInt();
        }

        for(int i=4;i>=0;i--){

            System.out.println(ar[i]);
        }
    }
}