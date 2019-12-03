import java.util.*;
import java.util.Map.Entry;


public class capclient {
	public static char findFirst(String input)
	{
		LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
		char ch[]=input.toCharArray();
		for(int i=0,j=0;i<ch.length;i++){
			if(map.containsKey(String.valueOf(ch[i]))){
			int temp=map.get(String.valueOf(ch[i])); 
			   Integer value=temp+1;
			     map.put(String.valueOf(ch[i]),value);
		     }
			else
				map.put(String.valueOf(ch[i]),j);
		}
		Set set= map.entrySet();
		for(Entry<String, Integer> in:map.entrySet()){
			int val=in.getValue();
			if (val==1)
				{
				String c=in.getKey(); 
				return c.String.valueOf(c);
			  break;
				}
		}
		
	}
	public static boolean doTestsPass(){
		String inputs[]={"apple","racecars","ababdc"};
		char outputs[]={'a','e','d'};
		boolean result=true;
		for(int i=0;i< inputs.length;i++)
		{
			result= result && findFirst(inputs[i]) == outputs[i];
			if(!result)
				System.out.println("Test Failed for:" + inputs[i]);
			else
				System.out.println("Test passed for:" + inputs[i]);
		}
		return result;
	}

	public static void main(String[] args) {
     doTestsPass();
	}

}
