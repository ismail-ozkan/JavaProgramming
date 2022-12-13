package day36_Inheritance.Tasks.bookTask;

public class EBook extends Book{

    public String size;
    public int page;

    public void setInfo(String title, String type, String author, int price, String size, int page) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
        this.size = size;
        this.page = page;
    }

    public void readBook(){
        System.out.println(title + " is being read");
    }

    public String toString() {
        return "EBook{" +
                "size='" + size + '\'' +
                ", page=" + page +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
