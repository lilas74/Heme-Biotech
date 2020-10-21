package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Utility class for extracting Strings from a File that may contain many
 * duplications
 * 
 * @author lilas
 * 
 *         This utility does not need to order the list
 */
public class ReadFile {
	/*
	 * =============================================================================
	 * METHOD FOR READING ANY FILE AND CONVERT EVERY LINE IN A LIST OF STRING
	 * =============================================================================
	 */

	/**
	 * Methods for converting a readed file to a list of Strings If no data is
	 * available, return an empty List
	 * 
	 * @param file
	 * @param list
	 * @return value from the operation, which is a list of strings,a raw listing of
	 *         all Symptoms obtained from a data source, duplicates are
	 *         possible/probable
	 */
	public static List<String> ReadFileToConvert(File file, List<String> list) {

		try {
			BufferedReader reader = new BufferedReader(new FileReader(file.getPath()));
			String line = reader.readLine();

			while (file.length() > 0) {
				list.add(line.substring(0, 1).toUpperCase() + line.substring(1));

				line = reader.readLine();
				if (line == null) {
					reader.close();
					break;
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			

		} catch (IOException e) {
			e.printStackTrace();

		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();

		}

		return list;

	}

}

