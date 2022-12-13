package day36_Inheritance.Tasks.bookTask;

public class AudioBook extends Book {

    public int lenght;
    public String narrator;

    public void setInfo(String title, String type, String author, int price, int lenght, String narrator) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
        this.lenght = lenght;
        this.narrator = narrator;
    }

    public void listen(){
        System.out.println(title + " is being listened");
    }
}
