import java.util.Scanner;

class twentyfour{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int ar[]= new int[5];

        System.out.println("Enter 5 elemnts");

        for(int i=0;i<5;i++){

            ar[i]=sc.nextInt();

        }

        System.out.println("Enter elemnt to be searched");

        int b=sc.nextInt();

        int found=0;
        for(int i=0;i<5;i++){
            if(ar[i]==b){
                found++;
            }
            
            }

            if(found!=0){

                System.out.println("Element found");
            }
            else{
                System.out.println("Element not found");
            }
               
                
        }
    }

        
//     }
/*
Write a program to search an element in the array.
*/

// import java.util.Scanner;

// class twentyfour{

// 	public static void main (String args[]){

// 		Scanner sc = new Scanner(System.in);
			
// 		System.out.println("Enter size of the array: ");
// 		int size = sc.nextInt();

// 		int arr[] = new int[size];

// 		for(int i=0; i<size; i++){
// 			System.out.print("Enter a number: ");
// 			arr[i]=sc.nextInt();
// 		}

// 		System.out.println("Enter number to search: ");
// 		int srch = sc.nextInt();

// 		for(int i=0; i<size; i++){
// 			if(arr[i]==srch){
// 				System.out.println("Element "+srch+" found at index "+(i+1));
// 				break;
//             }
//             else{
//                 System.out.println("Element not found");
//             }
// 		}	
		

// 	}

// }