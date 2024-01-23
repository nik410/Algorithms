/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    
    public static boolean recurCheckIfSortedOrNot(int arr[],int index){
        if(index == arr.length - 1){
            return true;
        }
        
        if(arr[index] > arr[index + 1])return false;
        
        return (recurCheckIfSortedOrNot(arr, index + 1) && true);
        
    }
    
	public static void main(String[] args) {
		int arr[] = {1,2,4,5,23};
		int n = arr.length;
		
// 	     Iteretive
// 		int flag =  0;
// 		for(int i = 0; i < n - 1; i++){
// 		    if(arr[i] > arr[i + 1]){
// 		        flag = 1;
// 		        System.out.println("It is not in Sorted Form");
// 		        break;
// 		    }
// 		}
// 		if(flag == 0){
// 		    System.out.println("It is in Sorted Form");
// 		}
		
		
		// Recursive
		
		System.out.println(recurCheckIfSortedOrNot(arr, 0));
		
	}
}
