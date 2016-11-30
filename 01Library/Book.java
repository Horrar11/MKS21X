public class Book {
    private String author;
    private String title;
    private String ISBN;

    public Book(){
	author = "Author";
	title = "Title";
	ISBN = "ISBN";
    }

    public Book(String ath, String ttl, String isbn){
	author = ath;
	title = ttl;
	ISBN = isbn;
    }

    public String getAuthor(){
	return author;
    }

    public String getTitle(){
	return title;
    }

    public String getISBN(){
	return ISBN;
    }

    public void setAuthor(String ath){
	author = ath;
    }

    public void setTitle(String ttl){
	title = ttl;
    }

    public void setISBN(String isbn){
	ISBN = isbn;
    }

    public String toString(){
	return title + ", " + author + ", " + ISBN;
    }
