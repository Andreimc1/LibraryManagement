package com.mycompany.librarymanagement.fileloaders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.librarymanagement.entities.Book;

public class BooksFileLoader {

	private List<Book> books = new ArrayList<>();
	
	public List<Book> loadBooksFile(String file){
		BufferedReader reader = null;
		String line = "";
		// above we create var
		try {
			reader = new BufferedReader(new FileReader(file));
			while ((line = reader.readLine()) != null) {
				createBook(line);
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
		
		return books;
	}
	
	private void createBook(String line) {
		String[] row = line.split(",");
		Book book = new Book();
		book.setId(row[0]);
		// TODO Substituir por getters e setters e colocar todos os dados do arquivo nos objectos
		book.authorFirstName = row[1];
		book.authorLastName = row[2];
		// bookTitle;
		// genre;

		books.add(book);
	}
	
}
