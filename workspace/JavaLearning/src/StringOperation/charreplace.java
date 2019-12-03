package StringOperation;

public class charreplace {

	public static void main(String[] args) {
       String str="Cognizant Technology Solution";
       char ch[]=str.toCharArray();
       for(int i=0;i<ch.length;i++){
    	   if(ch[i]=='g'){
    		   ch[i]='f';
    	   }
       }
       String str2=new String(ch);
       System.out.println(str2); 
	}

}
