import java.util.Scanner;

class twenty{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();

        int b=sc.nextInt();

        int flag=0;

        int i;
        for( i=a;i<=b;++i){

            for(int j=1; j<=i/2;j++){

                if(i%j==0){

                    flag++;
                }
            }

            if(flag==2){
                System.out.println("Prime="+i);
            }
        }
    }
}

