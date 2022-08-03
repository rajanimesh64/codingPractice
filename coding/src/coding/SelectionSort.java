package coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * The Selection sort algorithm is based on the idea of finding 
 * the minimum or maximum element in an unsorted array and then 
 * putting it in its correct position in a sorted array.
 * 
 */

public class SelectionSort {
	
	  public static int makeAnagram(String a, String b) {
		    // Write your code here
		    int common=0;
		   final int uncommon=0;
		    Map<Character,Integer> aFrequency= new  HashMap<>();
		    Map<Character,Integer> bFrequency= new  HashMap<>();
		    int i=0;
		    int j=0;
		    while(i != a.length()){
		    	if(aFrequency.containsKey(a.charAt(i))) {
		    		char tmp=a.charAt(i);
		    		aFrequency.put(tmp,aFrequency.get(tmp)+1);       
		    	}else {
		    		aFrequency.put(a.charAt(i),1);
		    	}i++;
		    } 
		    while(j != b.length()){
		    	if(bFrequency.containsKey(b.charAt(j))) {
		    		char tmp=b.charAt(j);
		    		bFrequency.put(tmp,bFrequency.get(tmp)+1);       
		    	}else {
		    		bFrequency.put(b.charAt(j),1);
		    	}j++;
		    } 
		    aFrequency.forEach((key,val) -> {
		    	if(bFrequency.containsKey(key)) {
		    		int tmp=Math.abs(val-bFrequency.get(key));
		    		uncommon+=tmp;
		    	}
		    });
		    
		    
		    int minimumdelete=(a.length()-common)+(b.length()-common);
		    
		    
		    return minimumdelete;
		    }

		
	
	
	static void sSort(List<Integer> inp) {
		int endPointer=inp.size()-1;
		int startingPointer=0;
		int max=-1;
		int maxpointer=0;
		while(endPointer  !=0) {
			if(max< inp.get(startingPointer)) {
				max= inp.get(startingPointer);
				maxpointer=startingPointer;
			}startingPointer+=1;
			if(endPointer==startingPointer-1) {
				int tmp=inp.get(endPointer);
				inp.set(endPointer,max);
				inp.set(maxpointer ,tmp);
				endPointer-=1;
				startingPointer=0;
				max=-1;
			}
			
		}
		System.out.println(inp.toString());
	}
	
	public static void main(String[] args) {
		makeAnagram("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke");
		List<Integer> input= new ArrayList<>();
//		input.add(10);
//		input.add(3);
//		input.add(9);
//		input.add(7);
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		//sSort(input);
	}

}
