package Service.SortService.ComporatorsForSortService;

import Entity.Books;
import Entity.Journails;

import java.util.Comparator;

public class ComporatorForSortJournailService implements Comparator <Journails> {
    @Override
    public int compare(Journails o1, Journails o2) {
        return o1.getTitle().compareTo(o2.getTitle());
        }
    }

