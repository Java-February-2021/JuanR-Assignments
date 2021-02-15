package com.juan.hashMap;
import java.util.Set;

public interface HashMap {
 public static void main(String[] args) {
	 HashMap<String, String> trackList = new HashMap<String, String>();
	 trackList.put("Welcome", "Welcome to coding Dojo");
	 trackList.put("Hello there", "It is me");
	 trackList.put("Knocking on the door", "I am the one who knocks");
	 trackList.put("Here again", "Here I am again");
	 
	 Set<String> keys = trackList.keySet();
	 for(String key : keys) {
		 System.out.println(key);
		 System.out.println(trackList.get(key));
	 }
 }
}
