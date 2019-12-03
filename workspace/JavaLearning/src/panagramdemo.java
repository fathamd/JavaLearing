import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class panagramdemo {

	public static void main(String[] args) {
		String abc="fatha mohamed qureshi";
		char []a=abc.toCharArray();
		Set<String> set= new HashSet<String>();
		for(int i=0;i<=a.length-1;i++){
			set.add(String.valueOf(a[i]));
		}
		Iterator<String> iterate= set.iterator();
		while(iterate.hasNext()){
			System.out.print(iterate.next()); 
		}
	}

}
