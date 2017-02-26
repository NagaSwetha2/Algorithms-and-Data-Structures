
public class Difference {

public int findSum(int n){

	return (n*(n+1)*(2*n+1))/6;
	
}

public int  findSquare(int n){
	
	return (int) Math.pow((n*(n+1))/2, 2);
}
public static void main(String[] args){
	Difference d=new Difference();
	int n=100;
	
	System.out.println(d.findSquare(n)-d.findSum(n));
	
	
}
}
