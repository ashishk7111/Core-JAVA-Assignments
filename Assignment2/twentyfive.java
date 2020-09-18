// import java.util.Scanner;

// class twentyfive{

//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);

//         int ar[]=new int[8];

//         for(int i=0;i<8;i++){

//             ar[i]=sc.nextInt();
//         }

//         int sume=0;

//         for(int i=0;i<8;i+=2){

//             sume=sume+ar[i];
//         }

//         int sumo=0;
        
//         for(int i=1;i<8;i+=2){

//             sumo=sumo+ar[i];
//         }

//         System.out.println("sum of even="+sume);
//         System.out.println("sum of odd="+sumo);
                
//     }
// }


// import java.util.Scanner;

// class twentyfive{

//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);

//         int ar[]=new int[8];

//         for(int i=0;i<8;i++){

//             ar[i]=sc.nextInt();
//         }

//         int sume=0;
//         int sumo=0;
        
//         for(int i=0;i<8;i+=2){
            
//             if(ar[i] % 2 == 0){

//             sume+=ar[i];
//             }
//         else{
//             sumo=sumo+ar[i];
//         }

//         }
//         System.out.println("sum of even="+sume);
//         System.out.println("sum of odd="+sumo);
                
//     }
// }


/*
Write the program to find the sum of even elements and sum of odd elements present in the array of integer type.
*/

// import java.util.Scanner;
// //import java.util.Array;

// class twentyfive{

// 	public static void main (String args[]){

// 		Scanner sc = new Scanner(System.in);
		
// 		System.out.println("Enter the size of an array: ");
// 		int size = sc.nextInt();

// 		int arr[] = new int[size];
		

// 		for(int i=0; i<size; i++){
// 			System.out.println("Enter a number: ");
// 			arr[i]=sc.nextInt();
// 		}

// 		int even = 0;
// 		int odd = 0;

// 		for (int i=0; i<size; i++){

// 			if(arr[i] % 2 == 0){
// 				even+=arr[i];
// 			}else{
// 				odd+=arr[i];
// 			}
// 		}

// 		System.out.println("sum of even elements: "+even);
// 		System.out.println("sum of odd elements: "+odd);
		
			

// 	}

// }


import java.util.Scanner;

class twentyfive{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int ar[]=new int[8];

        for(int i=0;i<8;i++){

            ar[i]=sc.nextInt();
        }

        int sume=0;
        int sumo=0;
        
        for(int i=0;i<8;i++){
            
            if(ar[i] % 2 == 0){

            sume+=ar[i];
            }
        else{
            sumo=sumo+ar[i];
        }

        }
        System.out.println("sum of even="+sume);
        System.out.println("sum of odd="+sumo);
                
    }
}