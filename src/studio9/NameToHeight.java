package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 * interface is telling what the methods should have but no code telling computer 
	 * what works
	 * Class is what we are using (useless without interface)
	 */
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Map<String,Integer> name = new HashMap<String,Integer>(); //interface = class; integer can be used more than int
		name.put("Bella", 69);
		name.put("Becca", 64);
		name.put("Tanuja", 60);
		
		System.out.println("Enter name or 'quit' to exit");
		while(true) {
			String current = in.next();
			if(current.equals("quit")){
				break;
			}
			else if (name.get(current) == null){
				System.out.println("Name is not in map");
			}
			else {
				System.out.println(current + " " + name.get(current));
			}
			
			
		}
		

	}
}
