package coding;

import java.util.ArrayList;
import java.util.List;

/*
 * The Selection sort algorithm is based on the idea of finding 
 * the minimum or maximum element in an unsorted array and then 
 * putting it in its correct position in a sorted array.
 * 
 */

public class SelectionSort {
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
		sSort(input);
	}

}
