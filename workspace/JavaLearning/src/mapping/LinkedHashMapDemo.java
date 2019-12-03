package mapping;

import java.util.*;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
     
		
	LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
	map.put("fatha", 123);
	map.put("shaista", 456);
	map.put("arham", 789);
	
	Set set= map.entrySet(); 
	Iterator it=set.iterator();
	while(it.hasNext()){
		Map.Entry me=(Map.Entry) it.next();
		System.out.print(me.getKey() + "," + me.getValue()); 
	}
	}
}
