/**
 * 
 */
package com.mycompany.librarymanagement.entities;

public class Book {

    public static Object getTitle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	
	private String id;
	// TODO colocar propriedades como private
	private String authorFirstName;
	private String authorLastName;
	private String bookTitle;
	private String genre;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	// TODO Criar getters e setter para todas as propriedades
        public String getAuthorFirstName(){
            return authorFirstName;
        }
        public void setAuthorFirstName(String authorFirstName){
            this.authorFirstName = authorFirstName;
        }
        public String getAuthorLastName(){
            return authorLastName;
        }
        public void setAuthorLastName(String authorLastName){
            this.authorLastName = authorLastName;
        }
        public String getBookTitle(){
            return bookTitle;
        }
        public void setBookTitle(String bookTitle){
            this.bookTitle = bookTitle;
        }
        public String getGenre(){
            return genre;
        }
        public void setGenre(String genre){
            this.genre = genre;
        }
}
