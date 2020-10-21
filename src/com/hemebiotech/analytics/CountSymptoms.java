package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * This class aims to count the occurrences of the same symptom from a list and
 * add them to a Hashmap <key , values> where the key is the word and the value
 * is the number of occurrences
 *
 * @author lilas lounes
 *
 */
public class CountSymptoms {
	/*
	 * =============================================================================
	 * ====== METHOD FOR COUNTING OCCURENCES OF THE SAME WORD IN A GIVEN LIST=======
	 * =============================================================================
	 */
	/**
	 * 
	 * @param list   of String to count
	 * @param result is a map where to store the result
	 * @return a map <String, Integer> where the String is the key and the Integer
	 *         the value of the number of occurences
	 */
	public static Map<String, Integer> compterOcc(List<String> list, Map<String, Integer> result) {

		for (String word : list) {
			Integer count = result.get(word);
			result.put(word, (count == null) ? 1 : count + 1);
		}
		return result;
	}

}
