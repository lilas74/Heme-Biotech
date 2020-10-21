package com.hemebiotech.analytics;



import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * Main class to Start the Programm
 * 
 * @author lilas lounes
 */
public class AnalyticsCounter {
	/*
	 * =============================================================================
	 * ====== INITIALIZATION OF ALL VARIABLES, INPUT FILE TO READ, OUTPUB LIST OF===
	 * OCCURENCES, OUTPUT HASHMAP(KEY,VALUE)
	 * =============================================================================
	 */
	/*
	 * filepath a full or partial path to file with symptom strings in it, one per
	 * line
	 */
	static File doc = new File("symptoms.txt");
	static List<String> list = new ArrayList<String>();
	static Map<String, Integer> map = new HashMap<String, Integer>();

	/**
	 * 
	 * @param args
	 * @throws IOException Signals that an I/O exception of some sort has occurred.
	 *                     This class is the general class of exceptions produced by
	 *                     failed or interrupted I/O operations.
	 */
	public static void main(String[] args) throws IOException {

		ReadFile.ReadFileToConvert(doc, list);// File.txt to analyze and to convert in a given list
		CountSymptoms.compterOcc(list, map);// Count occurrences of the same Strings in a Map <String,Integer>
		SortAndGenerate.docOut(map);// Sort the map, write a new File, and read it and display

	}

}
