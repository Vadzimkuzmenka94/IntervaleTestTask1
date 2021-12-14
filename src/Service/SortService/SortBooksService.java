package Service.SortService;

import Entity.Library;
import Service.SortService.ComporatorsForSortService.ComporatorForSortService;

import java.util.Collections;

public class SortBooksService {
    public void SortBook (Library library) {
        Collections.sort(library.getBooksArrayList(), new ComporatorForSortService());
        System.out.println("отсортированный по автору вариант библиотеки");
        System.out.println(library.getBooksArrayList());
    }
}
