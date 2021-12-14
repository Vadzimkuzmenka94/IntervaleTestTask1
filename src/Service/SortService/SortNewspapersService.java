package Service.SortService;

import Entity.Library;
import Service.SortService.ComporatorsForSortService.ComporatorForSortJournailService;
import Service.SortService.ComporatorsForSortService.ComporatorFornNewspaperService;

import java.util.Collections;

public class SortNewspapersService {
    public void SortNewspapers (Library library) {
        Collections.sort(library.getNewspapersArrayList(), new ComporatorFornNewspaperService());
        System.out.println("отсортированный по автору вариант библиотеки");
        System.out.println(library.getNewspapersArrayList());
    }
}
