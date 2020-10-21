package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * This class is used to sort a Map and to generate a file with the new sorted
 * TreeMap and read the new file
 * 
 * @author lilas lounes
 *
 */

public class SortAndGenerate {

	/*
	 * =============================================================================
	 * INITIALIZATION OF OUTPUT VARIABLES
	 * =============================================================================
	 */
	static List<String> list = new ArrayList<String>();
	final static String outputFilePath = "result.out.txt";

	static TreeMap<String, Integer> mapSorted;

	static BufferedWriter write1;

	/**
	 * 
	 * @param map
	 * @throws IOException
	 */
	/*
	 * =============================================================================
	 * METHOD TO SORT A MAP AND TO CONVERT IT IN TREEMAP
	 * =============================================================================
	 */

	public static void docOut(Map<String, Integer> map) throws IOException {
		TreeMap<String, Integer> result = sortedMap(map);
		Set<Entry<String, Integer>> set = result.entrySet();

		File file = new File(outputFilePath);
		FileWriter writer = new FileWriter(file);
		BufferedWriter write1 = null;
		try {

			write1 = new BufferedWriter(writer);

			for (Map.Entry<String, Integer> paire : set) {
				write1.write(paire.getKey() + " :" + paire.getValue());
				write1.newLine();

			}
			write1.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				write1.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		/**
		 * Reuse of the ReadFileToConvert() method from ReadFile to display the result
		 */
		ReadFile.ReadFileToConvert(file, list);
		for (String symptom : list) {
			System.out.println(symptom);
		}
	}
	/*
	 * =============================================================================
	 * METHOD TO SORT A MAP AND TO CONVERT IT IN TREEMAP
	 * =============================================================================
	 */

	/**
	 * 
	 * @param map
	 * @return a TreeMap
	 */
	public static TreeMap<String, Integer> sortedMap(Map<String, Integer> map) {
		TreeMap<String, Integer> mapTemp = new TreeMap<String, Integer>(map);
		return mapTemp;
	}

}
