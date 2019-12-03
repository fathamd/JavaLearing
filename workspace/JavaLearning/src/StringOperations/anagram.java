package StringOperations;

import java.util.Arrays;

public class anagram {
	public static void main(String args[]){
		boolean status=false;
		String str1="fathsa";
		String str2="thafa";
	
		int count=0;
		char ch1[]=str1.toLowerCase().toCharArray();
		char ch2[]=str2.toLowerCase().toCharArray();
		int a=ch1.length;
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		//status=Arrays.equals(ch1,ch2);
		for(int i=0,j=0;i<ch1.length & j<ch2.length;i++,j++){
			if(ch1[i]==ch2[j]){
				count++;
			}
		}
		if(count==a){
			status=true;
		}
		if(status)
			System.out.println("given string is anagram");
		else
			System.out.println("not anagram"); 
				
	}
}
