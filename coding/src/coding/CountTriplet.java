package coding;

import java.util.*;

public class CountTriplet {

	public static int tripletCount(List<Integer> arr, int r) {
		Collections.sort(arr);
		Set<Integer> uniVal=  new HashSet<>();
		uniVal.addAll(arr);
		HashMap<Integer,Integer> numberAndCount= new HashMap<>();
		for (Integer val : arr) {
			if(numberAndCount.containsKey(val)) {
				int tmp=numberAndCount.get(val);
				numberAndCount.put(val,tmp+1);
			}else {
				numberAndCount.put(val,1);
			}
		}
		int tripletCount=0;
		int j=1;
		while(j<arr.size()-1) {
			int tmp=arr.get(j);
			if((uniVal.contains(tmp/r)) && (uniVal.contains(tmp)) && (uniVal.contains(tmp*r)) ) {
				tripletCount+=numberAndCount.get(tmp/r);
				j+=1;
			}else {
				j+=1;
			}
			
		}
		return tripletCount;
	}
	
	public static void main(String[] args) {
		
		List<Integer> inp= new ArrayList<>();
		inp.add(3);
		inp.add(3);
		inp.add(3);
		inp.add(3);
		inp.add(3);
		inp.add(3);
		//inp.add(16);
		inp.add(9);
		inp.add(27);
		//inp.add(4);
		//inp.add(8);
		int result=tripletCount(inp,3);
		System.out.println(result);
}
}
