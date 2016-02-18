/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refnumber;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numberofPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numberofPages;
        
    }
   public void setRefNumber(String ref) {
       refnumber = ref;
    }
   // Add the methods here ...
   public String getAuthor()
   {    
       return author;
    }
   public String getTitle()
    {
        return title;
    }
   public int getPages()
   {
       return pages;
    }
   public String getRefnumber()
    {
        return refnumber;
    }
    
      
   public void printAuthor()
   {
       System.out.println("Author: " + author);
    }
    
   public void printTitle()
   {
       System.out.println("Title:" + title);
    }
   
   public void printDetails()
   {
       System.out.println("Title:" + title);
       System.out.println("Author: " + author);
       System.out.println("pages: " + pages);
    // Ald je de or hier omgedraaid zou hebben, dan zou hij geen ene fuck doen.    
      if(refnumber == null || refnumber.length() == 0){
          
           System.out.println("refnumber: ZZZ" );
           
        }
        else {
            System.out.println("refnumber: " + refnumber);
    } }}

