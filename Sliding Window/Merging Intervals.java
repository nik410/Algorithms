import java.util.*;
public class MergingArrays {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			al.add(a);
		}
		
		ArrayList<Integer> bl=new ArrayList<Integer>();
		for(int i=0;i<m;i++) {
			int a=sc.nextInt();
			bl.add(a);
		}
		
		
		ArrayList<Integer> ans=new ArrayList<Integer>();
		int l=0,r=0;
		
		while(l<n ||r<m) {
			if(l==n &&r!=m) {
				ans.add(bl.get(r));
				r++;
				
			}
			else if(r==m &&l!=n) {
				ans.add(al.get(l));
				l++;
				
			}
		else if(al.get(l)<=bl.get(r) &&l<=n-1) {
				ans.add(al.get(l));
				l++;
				
			}
			else if(al.get(l)>=bl.get(r) && r<=m-1) {
				ans.add(bl.get(r));
				r++;
				
			
			}
			
			
		}
		for(int i=0;i<ans.size();i++) {
			System.out.print(""+ans.get(i)+" ");
		}
		
		
		
		
		
 
	}
 
}
