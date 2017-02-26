
public class Multiple {

public int lcm(int n){
	int multiple=1;
	for(int i=2;i<=20;i++){
		multiple*=i/gcd(i,multiple);
	}
		return multiple;
	}
	public int gcd(int a,int b){
		
		return (0==b)?a:gcd(b,a%b);
	}


public static  void main(String[] args){
	Multiple m=new Multiple();
	System.out.println(m.lcm(20));
	
}


}
