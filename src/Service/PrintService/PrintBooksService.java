package Service.PrintService;

import Entity.Library;

public class PrintBooksService {
    public void PrintBooksService (Library library) {
        System.out.println(library.getBooksArrayList());
    }
}
