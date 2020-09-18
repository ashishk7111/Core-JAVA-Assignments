import java.util.Scanner;

class nineteen{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        int no=12;

        int sum=0;

        System.out.print(no);
        
        for(int i=1;i<=num;i++)
        {
            sum=sum+no;
            no=no+10;
            System.out.print(" + "+no);
        }

        System.out.println(" = "+sum);
    }
}

// import java.util.Scanner;

// class Main{ 
//     public static void main(String[] args) 
//         {
//             Scanner sc=new Scanner(System.in);
//             System.out.println("Enter the Number ");
//             int no=sc.nextInt();
//             int res=12;
//             int sum=0;
//             for(int i=1;i<=no;i++)
//             {
//                 System.out.print(res+" ");
//                  res =res+10;
//                  sum=sum+res;
//             }
//             System.out.println("");
//             System.out.println("Sum of Series : "+sum);
//         }
//     }