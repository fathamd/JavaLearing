package Chegg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {

	     ArrayList<Long> array = new ArrayList<Long>();
	     Scanner input = new Scanner(new File("numbers.txt"));
	     int counter = 0;
	     while(input.hasNextLine() && counter < 50)
	     {
	         array.add(input.nextLong());
	         counter++;
	     }
	     Long[] intArr = new Long[array.size()];
	        array.toArray(intArr);


	     ArrayList<String> array2 = new ArrayList<String>();
	     Scanner input2 = new Scanner(new File("names.txt"));
	     int counter2 = 0;
	     while(input2.hasNextLine() && counter2 < 50)
	     {
	         array2.add(input2.nextLine());
	         counter2++;
	     }
	        String[] strArr = new String[array2.size()];
	        array2.toArray(strArr);

			
			
			LinkedHashMap<Long, String> productMap = new LinkedHashMap<Long, String>();
			for (int i=0;i<array.size();i++) {
			   productMap.put(Long.valueOf(intArr[i]),String.valueOf(strArr[i])); 
			}
				System.out.println("Before sorting"); 
	        for (Map.Entry<Long,String> entry : productMap.entrySet()) 
	            System.out.println("Phone number = " + entry.getKey() +
	                             ", Name = " + entry.getValue());
	        
	        System.out.println("After sorting phone numbers"); 
	        
			TreeMap<Long, String> treeMap = new TreeMap<Long, String>(productMap);
			for (Map.Entry<Long,String> entry1 : treeMap.entrySet()) 
	            System.out.println("Phone number = " + entry1.getKey() +
	                             ", Name = " + entry1.getValue());
	        

	}

}
