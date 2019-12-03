package cap;

import java.util.LinkedHashMap;
import java.util.Map;

public class charcount {

	public static void main(String[] args) {
		  String str="fatha mohamed";
		    char ch[]=str.toCharArray();
		   Map<String,Integer> map= new LinkedHashMap<String,Integer>();
		    for(int i=0,j=1;i<ch.length;i++)
		    {
		       if(map.containsKey(String.valueOf(ch[i])))
		      {
		         int value=map.get(String.valueOf(ch[i]));
		         map.put(String.valueOf(ch[i]),value+1);
		       }
		        else
		        {
		              map.put(String.valueOf(ch[i]),j);
		        }
		    }
		    for(Map.Entry<String,Integer> entry:map.entrySet()){
		      System.out.print(entry.getKey()+entry.getValue());
		    }
	}

}
