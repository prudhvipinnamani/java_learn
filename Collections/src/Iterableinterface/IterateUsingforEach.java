package Iterableinterface;

import java.util.*;

public class IterateUsingforEach {
	public static void main(String[] args)
    {
          // create a list
        List<String> list = new ArrayList<>();
  
          // add elements to the list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
  
          // Iterate through the list
        list.forEach(
            (element) -> { System.out.println(element); });
    }

}
