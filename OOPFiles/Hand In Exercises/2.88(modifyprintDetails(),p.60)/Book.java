/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private String refNumber;
    private int pages;

    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber ="";
    }

    public void printAuthor()
    {
        System.out.println ( "The author is " + author);
    }

    public void printTitle()
    {
        System.out.println ( "The title is " + title);
    }

    public void printPages()
    {
        System.out.println ( "The amount of pages are " + pages);
    }

    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }

    public String getRefNumber()
    {
        return refNumber;
    }

    public void printDetails()
    {
        System.out.println ( "Book Title: " + title);
        System.out.println ( "Book Author: " + author); 
        System.out.println ( "Amount of Pages: " + pages); 
    }
}