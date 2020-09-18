import java.util.Scanner;

class twentytwo{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int ar[]=new int[5];

        for(int i=0;i<5;i++){

            ar[i]=sc.nextInt();
        }

        for(int i=0;i<5;i++){

            for(int j=i+1;j<5;j++){

                if(ar[i]>ar[j]){

                    ar[j]=ar[i];
                }
            }

            
        }
        for(int k=4;k>=0;k--){
        System.out.println(ar[k]);
    }
    
    }
}