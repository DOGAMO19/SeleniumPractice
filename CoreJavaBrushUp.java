import java.util.Iterator;

public class CoreJavaBrushUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Arrays
		//Declare an Array 
		int[] myArray = new int[3];
		int[] myArray2 = {1,2,3,4,5,6,7,8,9};
		//Give a value in an array position
		myArray[0] = 5;
		myArray[1] = 11;
		myArray[2] = 22;
		//Display a value in a certain position array
		System.out.println(myArray[0]); //5
		System.out.println(myArray2[1]); //2
		
		System.out.println("-----------------");
		
		//For loop - always minus than length because the array index initialize in 0, if we put minus or equals it takes the last position and this index it doesn't exist
		for (int i = 0; i < myArray2.length; i++) {
			System.out.println(myArray2[i]);
		}
		
		String[] names = {"Daniel","Osvaldo","Raul"};
		
		//Enhanced For loop
		for(String name : names) {
			System.out.println(name);
		}
	}

}
