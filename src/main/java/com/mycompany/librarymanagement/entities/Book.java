/**
 * 
 */
package com.mycompany.librarymanagement.entities;

public class Book {
	
	private String id;
	// TODO colocar propriedades como private
	public String authorFirstName;
	public String authorLastName;
	public String bookTitle;
	public String genre;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	// TODO Criar getters e setter para todas as propriedades
}
