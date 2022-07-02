package coding;

import java.util.ArrayList;
import java.util.List;

/*
 * Bubble sort is based on the idea of repeatedly comparing pairs of adjacent elements 
 * and then swapping their positions if they exist in the wrong order. 
 */

public class BubbleSort {
	static void bSort(List<Integer> a) {
		int swaps=0;
		
		int endpointer=a.size();
		int starting=0;
		while(endpointer!=0) {
			if(a.get(starting) >a.get(starting+1)) {
				int tmp=a.get(starting);
				a.set(starting,a.get(starting+1));
				a.set(starting+1, tmp);
				swaps+=1;
			}starting+=1;
			
			if(starting==endpointer-1) {
				endpointer-=1;
				starting=0;
			}
			if(starting==endpointer) {
				break;
			}
		}
		System.out.format("Array is sorted in %d swaps.\n",swaps);
		System.out.format("First Element: %d\n",a.get(0));
		System.out.format("Last Element: %d",a.get(a.size()-1));
		
	}
	
	
public static void main(String[] args) {
	List<Integer> inp= new ArrayList<>();
	inp.add(4);
	inp.add(3);
	inp.add(2);
	inp.add(1);
	bSort(inp);
}

}
