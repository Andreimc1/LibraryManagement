/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagement.classes;

import com.mycompany.librarymanagement.entities.Book;
import java.util.Scanner;

/**
 *
 * @author Andrei
 */
public class BookFinder {

    private Iterable<Book> books;
    public Object findBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the title of the book:");
        String title = scanner.nextLine();
        
        
        for (int i = 0; i < Book.getTitle(); i++) {        
            if (Book.getTitle().equals(title)) {
            return Book.bookTitle;
        }
    }
   
    

