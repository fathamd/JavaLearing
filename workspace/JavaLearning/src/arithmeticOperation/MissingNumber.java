package arithmeticOperation;

public class MissingNumber {
	public static void main(String[] args) {
		char ch[]={11,12,13,15,16};
		int n=ch.length+1;
		int arrsum=0;
		for(int i=0;i<ch.length;i++){
			arrsum=arrsum+ch[i];
		}
		int sum=n*(n+1)/2;
		int missnumber=sum-arrsum;
		System.out.println("missing number is:" + missnumber); 
	}

}
