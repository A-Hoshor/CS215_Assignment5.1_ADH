/**
 * Class to test dictionary hashmap of archaic word pairings
 * @author Alyssa H
 *
 */

public class Application {

	public static void main(String[] args) {
		
		Dictionary a = new Dictionary();
		a.loadDictionary();
		//a.printDictionary();
		System.out.println(a.getKey("sweeting"));
		System.out.println(a.getKey("divers"));
		System.out.println(a.getKey("timbrel"));
		System.out.println(a.getKey("appetency"));
		System.out.println(a.getKey("bootless"));

	}//end main method

}//end application class
