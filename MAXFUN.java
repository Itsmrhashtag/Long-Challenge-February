/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	try {
			Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        while(t-->0){
	            int n = sc.nextInt();
//	            int max=0,min=0;
	            long a[]=new long[n];
	            for(int i=0;i<n;i++) {
	            	a[i]=sc.nextLong();
	            }
//	           min=a[0];
//	           max=a[0];
//	           for(int i=0;i<n;i++) {
//	        	   if(a[i]>max) {
//	        		   max=a[i];
//	        	   }
//	        	   if(a[i]<min) {
//	        		   min=a[i];
//	        	   }
//	           }
//	           int ans=max-min;
//	           ans=ans*2;
//	           System.out.println(ans);
	            Arrays.sort(a);
	            long ans=Math.abs(a[0]-a[n-1])+Math.abs(a[n-1]-a[1])+Math.abs(a[0]-a[1]);
	            System.out.println(ans);
	        }
		}catch (Exception e) {
		}
	}
}
