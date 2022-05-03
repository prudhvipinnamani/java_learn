package Iterableinterface;

import java.util.*;

public class IterateUsingEnhancedForLoop {
	public static void main (String[] args) {
	// create a list
    List<String> list = new ArrayList<String>();

    // add elements
    list.add("Geeks");
    list.add("for");
    list.add("Geeks");

    // Iterate through the list
    for( String element : list ){
        System.out.println( element );
    }
  }
}
