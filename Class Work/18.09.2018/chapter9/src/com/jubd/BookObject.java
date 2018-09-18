
package com.jubd;

public class BookObject {
    int serialNumber;
    String bookName;
    String writerName;

    public BookObject(int serialNumber, String bookName, String writerName) {
        this.serialNumber = serialNumber;
        this.bookName = bookName;
        this.writerName = writerName;
    }
    
    public static void main(String[] args) {
        BookObject book=new BookObject(100, "Java", "Md. Rajaul Islam");
        System.out.println("The example of Book by Constructor is : "+ book);
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    @Override
    public String toString() {
        return "BookObject{" + "serialNumber=" + serialNumber + ", bookName=" + bookName + ", writerName=" + writerName + '}';
    }
    
    
    
}
