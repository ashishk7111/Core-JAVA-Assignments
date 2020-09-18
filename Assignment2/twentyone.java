// import java.util.Scanner;
// class twentyone{
	
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		int ar[] = new int[2];
// 		for(int i=0;i<2;i++){
// 			System.out.println("Enter ele");
// 			ar[i]=sc.nextInt();
// 		}
// 		for(int i=0;i<2;i++){
// 			System.out.println(ar[i]);
// 		}
// 	}
// }


import java.util.Scanner;

class twentyone{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int ar[]=new int[10];

		int sum=0;

        for(int i=0;i<ar.length;i++){

			ar[i]=sc.nextInt();
			sum=sum+ar[i];
		}
		
		System.out.println("Sum = "+sum);

        
    }
}
