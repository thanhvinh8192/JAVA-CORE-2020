package Lesson6.Activity6_4;

public class Book {
    private String nameBook;
    private String authorBook;
    private long priceBook;
    private long totalSold;

    public Book(String nameBook, String authorBook, long priceBook, long totalSold) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.priceBook = priceBook;
        this.totalSold = totalSold;
    }

    public Book() {

    }

    public String toString(){
        return "Book Name: " + nameBook +
                "    Author: " + authorBook +
                "    Price: " + priceBook +
                "    Total Sold: " + totalSold;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public long getPriceBook() {
        return priceBook;
    }

    public void setPriceBook(long priceBook) {
        this.priceBook = priceBook;
    }

    public long getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(long totalSold) {
        this.totalSold = totalSold;
    }

    public boolean checkBestSeller(){
        if(getTotalSold()>1000){
            return true;
        }
        else {
            return false;
        }
    }
}
