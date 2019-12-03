package StringOperations;

import java.util.*;

public class occurance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the string:");
		String str = input.nextLine();
		System.out.println(str);
		// String str1="fatha";
		char ch[] = str.toCharArray();
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0, j = 1; i < ch.length; i++) {
			if (map.containsKey(String.valueOf(ch[i]))) {
				int value = map.get(String.valueOf(ch[i]));
				map.put(String.valueOf(ch[i]), value + 1);
			} else {
				map.put(String.valueOf(ch[i]), j);
			}
		}
		for (Map.Entry<String, Integer> key : map.entrySet()) {
			System.out.print(key.getKey() + key.getValue());
		}
	}
}
