package Service.SortService;

import Entity.Library;
import Service.SortService.ComporatorsForSortService.ComporatorForSortJournailService;
import Service.SortService.ComporatorsForSortService.ComporatorForSortService;

import java.util.Collections;

public class SortJournailService {
    public void SortJourails (Library library) {
        Collections.sort(library.getJournailsArrayList(), new ComporatorForSortJournailService());
        System.out.println("отсортированный по автору вариант библиотеки");
        System.out.println(library.getJournailsArrayList());
    }
}

