/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagement.classes;

import java.util.Scanner;

/**
 *
 * @author Andrei
 */
public class Menu {
    
    public void show(){
        int option = -1;
        do{
            System.out.println("1 - Search for a specific book by title and/or author name.");
            System.out.println("2 - List all books by title and/or author name alphabetical order.");
            System.out.println("3 - Search for a specific student by name and/or ID.");
            System.out.println("4 - List all students by alphabetical name and/or ID order.");
            System.out.println("5 - Register that a student has borrowed a book.");
            System.out.println("6 - If a book is borrowed and another student wants to borrow it, allow the user to add that reader to a waiting list (queue).");
            System.out.println("7 - Register that a student has returned a book.");
            System.out.println("8 - If a book is returned and has a waiting queue, display to the user the next student waiting for that book.");
            System.out.println("9 - For a specific student, list the books that they have borrowed.");
            System.out.println("99 - Exit program.");
            
            option = readMenuOption();

            if (option == 1){
                BookFinder finder = new BookFinder();
                finder.findBook();
            }
        }while(option != 99);
    }
    
    private int readMenuOption(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number of the menu option that you want:");
        return scanner.nextInt();
    }
    
}