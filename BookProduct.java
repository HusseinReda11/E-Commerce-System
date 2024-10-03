public class BookProduct extends product{
    private String publisher;
    private String author;
    public BookProduct(int productId, String oop, double v, String xPublications, String author) {
    }
    public BookProduct(String publisher, String author) {
        this.publisher = publisher;
        this.author = author;
    }
    public BookProduct(int productId, String name, float price, String publisher, String author) {
        super(productId, name, price);
        this.publisher = publisher;
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
