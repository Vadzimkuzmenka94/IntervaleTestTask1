package Entity;

import java.io.Serializable;
import java.util.ArrayList;

public class Newspapers implements Serializable {

    {
        idGenerator++;
    }
    private static int idGenerator = 0;
    private int id = idGenerator;

    public static int getIdGenerator() {
        return idGenerator;
    }

    String title;
    String month;
    int year;



    public Newspapers(String title, String month, int year) {
        this.title = title;
        this.month = month;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
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
                " номер газеты : " + id  + '\'' +
                " Название газеты : " + title + '\'' +
                " Месяц выхода : " + month + '\'' +
                " Год выхода : " + year +
                '|' + "\n";
    }
}
