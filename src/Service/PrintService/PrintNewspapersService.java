package Service.PrintService;

import Entity.Library;

public class PrintNewspapersService {
    public void PrintNewspapers (Library library) {
        System.out.println(library.getNewspapersArrayList());
    }
}
