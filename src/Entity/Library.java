package Entity;

import java.io.Serializable;
import java.util.ArrayList;

public class Library implements Serializable {
    String name;
    private ArrayList <Books> booksArrayList = new ArrayList<>();
    private ArrayList <Journails> journailsArrayList = new ArrayList<>();
    private ArrayList <Newspapers> newspapersArrayList = new ArrayList<>();
    public Library(String name, ArrayList<Books> booksArrayList, ArrayList<Journails> journailsArrayList, ArrayList<Newspapers> newspapersArrayList) {
        this.name = name;
        this.booksArrayList = booksArrayList;
        this.journailsArrayList = journailsArrayList;
        this.newspapersArrayList = newspapersArrayList;
    }


    public ArrayList<Books> getBooksArrayList() {
        return booksArrayList;
    }

    public void setBooksArrayList(ArrayList<Books> booksArrayList) {
        this.booksArrayList = booksArrayList;
    }

    public ArrayList<Journails> getJournailsArrayList() {
        return journailsArrayList;
    }

    public void setJournailsArrayList(ArrayList<Journails> journailsArrayList) {
        this.journailsArrayList = journailsArrayList;
    }

    public ArrayList<Newspapers> getNewspapersArrayList() {
        return newspapersArrayList;
    }

    public void setNewspapersArrayList(ArrayList<Newspapers> newspapersArrayList) {
        this.newspapersArrayList = newspapersArrayList;
    }

    @Override
    public String toString() {
        return "Библиотека" + "\n" +
                "Книги : " + booksArrayList + "\n" +
                " Журналы : " + journailsArrayList + "\n" +
                " Газеты : " + newspapersArrayList + "\n" +
                '}';
    }
}

