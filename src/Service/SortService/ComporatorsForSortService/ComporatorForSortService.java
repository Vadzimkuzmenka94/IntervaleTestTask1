package Service.SortService.ComporatorsForSortService;

import Entity.Books;
import Entity.Library;

import java.awt.print.Book;
import java.util.Comparator;

public class ComporatorForSortService implements Comparator<Books> {
    @Override
    public int compare(Books o1, Books o2) {
        return o1.getTitle().compareTo(o2.getTitle());

    }
}

