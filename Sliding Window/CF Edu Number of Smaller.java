    import java.util.ArrayList;
    import java.util.Scanner;
     
    public class NumberofSmaller {
     
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
    		
    		int ans[]=new int[m];
    		int l=0,r=0,count=0,in=0;
    		while(r<m &&l<n  ) {
    			 if(al.get(l)<bl.get(r) &&l<=n-1  ) {
    				count++;
    				l++;
    				ans[r]=count;
    				
    				
    				
    			}
    			
    			
    			else 
    			{
    				ans[r]=l; 
    				r++;
    			}
    		}
    		
           for(int i=0;i<ans.length;i++) {
        	  if(ans[i]==n) {
        		  for(int j=i;j<ans.length;j++) {
        			  ans[j]=n;
        		  }
        	  }
        	   System.out.print(ans[i]+" ");
           }		
     
    	}
     
    }
