import java.util.HashMap;
/**
 * A class to load a text into a hashmap in order to create a serachable
 * dictionary of archaic words and definitions
 * @author Alyssa Hoshor
 */
import java.util.Map;
import java.io.*;

public class Dictionary {
	
	private HashMap<String,String> dictionary;
	
	public Dictionary() {
		dictionary = new HashMap<String,String>(436);
	}//end constructor
/**
 * Method to extract words and definitions from a document 
 * and load them into a searchable hashtable
 * @return hashtable dictionary
 */
	public HashMap<String, String> loadDictionary() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("DictionaryWordValuePairs.txt"));
			String line;
			while((line = br.readLine()) != null) {
				String [] parts = line.split(":");
				String word = parts[0].trim();
				String definition = parts[1].trim();
				dictionary.put(word,definition);
			}//end while
		} catch (Exception e) {
			e.printStackTrace();
		}//end catch
		finally {
			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
				}//end catch
			}//end if
		
		}//end finally
		return dictionary;
	}//end load dictionary
	
	/**
	 * Method to print entire dictionary
	 */
	public void printDictionary() {
		for(Map.Entry<String,String> entry : dictionary.entrySet() ) {
			String word = entry.getKey();
			String definition = entry.getKey();
			System.out.println("Word: " + word + " Definition: " + definition);
			}//end for loop
		}//end printDictionary
	
	/**
	 * Method to return word, definition, and hashcode key to user.
	 * @param key
	 * @return word, definition and hashcode key String.
	 */
	public String getKey(String key) {
		String k = "Word: " + key + " Definition: " + dictionary.get(key) + " Hashkey: " + key.hashCode();
		return k;
	}//end getKey method


}//end class
