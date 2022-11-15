/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.librarymanagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class LibraryManagement {

	public static void main(String[] args) {

		final String file = "C:\\Users\\Admin\\Downloads\\MOCK_DATA (1).csv";
		BufferedReader reader = null;
		String line = "";
		// above we create var
		try {
			reader = new BufferedReader(new FileReader(file));
			while ((line = reader.readLine()) != null) {

				String[] row = line.split(",");
				for (String index : row) {
					System.out.printf(index);
				}
				System.out.println();
			}
		}
		// try process is to ready the first line and the While process is to repeate
		// the reading line until finish the lines
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
