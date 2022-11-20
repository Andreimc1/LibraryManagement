/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.librarymanagement;

import com.mycompany.librarymanagement.classes.Menu;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.librarymanagement.entities.Book;
import com.mycompany.librarymanagement.fileloaders.BooksFileLoader;

/**
 *
 * @author Admin
 */
public class LibraryManagement {
	
	private static List<Book> books = new ArrayList<>();

	public static void main(String[] args) {
		
		loadFiles();
		for(int i = 0; i < books.size(); i++)
		{
			System.out.println(books.get(i).getId());
		}
		showMenu();

	}
	
	private static void loadFiles() {
		loadBooksFile();
		loadStudentsFile();
		loadBorrowingsFile();
	}
	
	private static void showMenu() {
            Menu menu = new Menu();
            menu.show();
	}
	
	private static void loadBooksFile() {
		BooksFileLoader loader = new BooksFileLoader(); 
		books = loader.loadBooksFile("\\resources\\MOCK_DATA.csv");
	}
	
	private static void loadStudentsFile() {
		// Ainda vai ser feito
	}
	
	private static void loadBorrowingsFile() {
		// Ainda vai ser feito
	}
}
