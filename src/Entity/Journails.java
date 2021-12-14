package Entity;

import java.io.Serializable;
import java.util.ArrayList;

public class Journails implements Serializable {

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

    public Journails(String title, String month, int year) {
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
                " номер журнала : " + id  + '\'' +
                "Название журнала : " + title + '\'' +
                " месяц выхода : " + month + '\'' +
                " год выхода : " + year +
                '|'  + "\n";
    }
}
