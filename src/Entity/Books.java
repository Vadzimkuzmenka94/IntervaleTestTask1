package Entity;

import java.io.Serializable;
import java.util.ArrayList;

public class Books implements Serializable {
    {
        idGenerator++;
    }
    private static int idGenerator = 0;
    private int id = idGenerator;

    public static int getIdGenerator() {
        return idGenerator;
    }

    public static void setIdGenerator(int idGenerator) {
        Books.idGenerator = idGenerator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String title;
    String author;
    int year;

    public Books( String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "" +
                " номер книги : " + id  + '\'' +
                " Название книги : " + title + '\'' +
                " Автор книги : " + author + '\'' +
                " Год : " + year +
                '|' + "\n";
    }
}
