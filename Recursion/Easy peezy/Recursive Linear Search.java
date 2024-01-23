/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
    
    public static ArrayList<Integer> recurLinearSearch(int arr[], int index, int target, ArrayList<Integer> al){
       
        
        if(index == arr.length){
            return al;
        }
        
        if(arr[index] == target){
            al.add(index);
            
        }
        
       return recurLinearSearch(arr, index + 1, target, al);
        
    }
    
	public static void main(String[] args) {
		int arr[] = {1, 5, 4, 5, 23};
		int n = arr.length;
	    int target = 5;
		ArrayList<Integer> al = new ArrayList();
		// Recursive
		
	    recurLinearSearch(arr, 0, target, al);
		
		System.out.println(al);
		
	}
}
