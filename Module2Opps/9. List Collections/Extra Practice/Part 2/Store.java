import java.util.ArrayList;

public class Store {

    private ArrayList<Book> books;
    public Store(){
        this.books=new ArrayList<>();
    }
    public Book getBook(int index) {

        return new Book(books.get(index));
    }

    public void setBook(int index,Book bk){

        this.books.set(index, new Book(bk));
    }

   public void  addBook(Book bk){
    this.books.add(new Book(bk));
   }

   public boolean contains(Book book){
    return this.books.contains(book);
   }

   public void sellBook(String title){
   // this.books.remove()
    for(int i=0;i<this.books.size();i++){
        if(this.books.get(i).getTitle().equals(title)){
            this.books.remove(i);
        }
    }
   }
}
