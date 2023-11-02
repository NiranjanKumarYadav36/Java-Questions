class Book{
    private String title;
    private String author;
    private int year;

    Book(String title, String author, int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }

    Book(String title, String author){
        this(title,author,-1);
    }

    Book(String title){
        this(title,"unkown",-1);
    }

    void display(){
        System.out.println("title: "+title);
        System.out.println("author: "+author);
        System.out.println("year: "+(year==-1 ? "unkown": year));
    }
}

public class three{
    public static void main(String[] args){

        Book b1 = new Book("java programming");
        Book b2 = new Book("design patterns", "john doe");
        Book b3 = new Book("data structure","jane smith",2020);
        Book b4 = new Book("unkown book");

        System.out.println("book 1 details:");
        b1.display();
        
        System.out.println("book 2 details:");
        b2.display();

        System.out.println("book 3 details:");
        b3.display();
        
        System.out.println("book 4 details:");
        b4.display();
    }
}