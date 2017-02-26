package s;

import java.awt.List;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class s1 {
	
	/*public static boolean p(int palindrome){
		int sum=0;int r=0;
	while(palindrome>0){
		 r=palindrome%10;
		  sum=(sum*10)+r; 
		palindrome=palindrome/10;
	}
		return r==palindrome;
	}*/
	
	public  boolean isPalin(int m){
		String  s=Integer.toString(m);
		
		StringBuilder b=new StringBuilder(s).reverse();
		String r=b.toString();
		
		if(r.equals(s)){
			return true;
		}
		return false;
	}
	public static void main(String[] ar){
		ArrayList<Integer> al=new ArrayList<Integer>();
		int m=14538992;int p=0;
		s1 a1=new s1();
		for(int i=999;i>=100;i--){
			for(int j=999;j>=100;j--){
				int s=i*j;
				
				if(a1.isPalin(s) && s>p){
					p=s;
				}
			}
		}
		
		System.out.println(p);
		
		
				
				
			
	}
}
		
		

