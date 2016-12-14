public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    String author;
    String title;
    String ISBN;
    String callNumber;

    public LibraryBook (String ath, String ttl, String isbn, String call) {
	super.Book(ath, ttl, isbn);
	callNumber = call;
    }

    
