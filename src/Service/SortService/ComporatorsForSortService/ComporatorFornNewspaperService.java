package Service.SortService.ComporatorsForSortService;

import Entity.Journails;
import Entity.Newspapers;

import java.util.Comparator;

public class ComporatorFornNewspaperService implements Comparator<Newspapers> {
@Override
public int compare(Newspapers o1, Newspapers o2) {
        return o1.getTitle().compareTo(o2.getTitle());
        }
}
