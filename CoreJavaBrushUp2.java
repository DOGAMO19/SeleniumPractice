import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray2 = {1,2,3,4,5,6,7,8,9};
		
		//check if array has multiple of 2
		for(int i=0 ; i < myArray2.length; i++) { //loop to check all the values in the array 
			if(myArray2[i] % 2 == 0) { //Check if the number in the index it's multiple of 2
				System.out.println(myArray2[i] + " is a multiple of 2"); //Display the number it's a multiple of 2
				//break; //Stop the program it found a multiple of 2
			} else {
				System.out.println(myArray2[i] + " is not multiple of 2"); //Display the numbers hasn't a multiple of 2
			}
		}
		
		//Generate a dynamic positions array list
		ArrayList<String> products = new ArrayList<String>();
		products.add("Smart T.V"); //Add element in a list
		products.add("Smartwatch"); //Add element in a list
		products.add("Smartphone"); //Add element in a list
		System.out.println(products.get(1)); //Get an element in a position 1 in a list 
		//products.remove(0); //Remove/Delete an element in position 0 in a list
		System.out.println("**************************************");
		
		//Display all the arrayList elements 
		//Normal For Loop
		for(int i=0 ; i < products.size(); i++) { //Get the arrayList size with the size() method, instead length in the normal arrays  
			System.out.println(products.get(i)); //Display each element of the arrayList 
		}
		System.out.println("****************************************");
		//For Each or Enhancement For Loop
		for(String product: products) {
			System.out.println(product); //Display each element of the arrayList 
		}
		
		
		System.out.println("***********************************");
		
		//Convert normal array to arrayList, with this change we can use an arrayList methods 
		String[] persons = {"Martinez","Ruiz","Diaz","Sol","Manuelle"};
		List<String> personsArrayList = Arrays.asList(persons); //Wit Arrays.asList convert the normal array to arrayList 
		System.out.println(personsArrayList.get(0)); //Display the number Martinez
		for(String person : personsArrayList) {
			System.out.println(person);
		} 
		System.out.println(personsArrayList.contains("Garcia"));
		
	}
}
