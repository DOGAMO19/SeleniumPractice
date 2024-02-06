
public class CoreJavaBrushUp3 {
	public static void main(String[] args) {
		
		//String is a object in Java
		
		//String literal - If the two string has the same value, java won't create a two objects, it's refers a the object with the same value
		String s = "Hello World"; 
		String s1 = "Hello World";
		
		//String with the class  - If two string has the same value it doesn't matter, java creates two different objects 
		String s2 = new String("Goodbye");
		String s3 = new String("Goodbye");
		
		//Split method (Dividir un array por un delimitidor en especifico)
		String stringToSplit = "Java course selenium testing automation";
		String[] splittedString = stringToSplit.split(" "); //Split the string in each white space, so it returns an array with 5 strings (Java , course, selenium, testing, automation)
		for(String splitted : splittedString) {
			System.out.println(splitted);
		}
		System.out.println(splittedString[0]); //Java
		
		//Trim method (Eliminar espacios en blanco a la izquierda y derecha de un string)
		String[] splittedStringWhiteSpaces = stringToSplit.split("selenium"); //Split the string when it found a selenium word, returns [Java course, testing automation]
		System.out.println(splittedStringWhiteSpaces[0]); //Java course
		System.out.println(splittedStringWhiteSpaces[1]); // testing automation (this string has a white space in the left side)
		System.out.println(splittedStringWhiteSpaces[1].trim()); // testing automation (this string hasn't a white space in the left side)
		
		//Display a string letter by letter 
		for(int i = 0; i < s2.length(); i++) {
			System.out.println(s2.charAt(i)); //We use charAt(index) to display letter by letter (char is a unique letter)
		}
		
		System.out.println("*************************************");
		
		//Display a string reverse 
		for(int i = s2.length()-1 ;i >= 0; i--) {  //Use length()-1 because the length method isn't count an index 0 to string 
			System.out.println(s2.charAt(i));
		}
	}
}
