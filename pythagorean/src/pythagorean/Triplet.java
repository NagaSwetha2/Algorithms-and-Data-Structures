package pythagorean;

public class Triplet {
public static void main(String[] args){
	int a,b,c;
	int sq=(int) Math.sqrt(1000);
	for(int i=1;i<=sq;i++){
		
		for(int j=i+1;j<=sq;j++){
			a=j*j-i*i;
			b=i*j*2;
			c=i*i+j*j;
			if(a+b+c==1000){
				System.out.println(a*b*c);
				return;
			}
			
		}
	}
}}

