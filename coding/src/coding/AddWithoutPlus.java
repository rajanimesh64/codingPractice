package coding;

public class AddWithoutPlus {
	

	/*
	 * @Author-Animesh Raj
	 * Code to add two numbers without using plus,with the help of Binary operators
	 */
	
	
	public static void  addwithoutplusnew(int a,int b) {
		
		int exAdd=a^b;
		int carry=a&b;
		int c,d;
		while(carry!= 0) {
			c=carry << 1;
			d=exAdd;
			exAdd=c^d;
			carry=c&d;
			
		}
		System.out.println(exAdd);
	}
	
	
public static void main(String[] args) {
	addwithoutplusnew(-10,200);
	
	
	
}


}
