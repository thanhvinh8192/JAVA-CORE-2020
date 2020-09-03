package Lesson6.Activity6_4;

import java.util.Scanner;

public class BookManagenement {
    private int totalBook;
    private Book[] books;

    public BookManagenement(int totalBook) {
        books = new Book[totalBook];
        Scanner input = new Scanner(System.in);
        for (int i=0; i<totalBook; i++) {
            System.out.print("Book Name " + (i+1) +": ");
            String nameBook = input.nextLine();
            System.out.print("Author of " + nameBook + ": ");
            String nameAuthor = input.nextLine();
            System.out.print("Price: ");
            long priceBook = input.nextLong();
            System.out.print("Total Sold: ");
            long totalSold = input.nextLong();
            input.nextLine();
            books[i] = new Book(nameBook, nameAuthor, priceBook, totalSold);
        }
    }
    public int countBestSeller(){
        int count =0;
        for (Book i : books) {
            if (i.checkBestSeller()){
                count++;
            }
        }
        return count;
    }

    public String BestSoldBook(){
        long bestSold = 0;
        Book book = new Book();
        for (Book i : books) {
            if (bestSold <= i.getTotalSold()) {
                bestSold = i.getTotalSold();
                book = i;
            }
        }
        return "Book Name: " + book.getNameBook() + "     Total Sold: " + book.getTotalSold();
    }

    public void PrintInfo(){
        for (Book i : books) {
            System.out.println(i.toString());
        }
    }
}