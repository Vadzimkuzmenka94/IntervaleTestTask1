package Service.PrintService;

import Entity.Library;

public class PrintJournailsService {
    public void printJournail (Library library) {
        System.out.println(library.getJournailsArrayList());
    }
}
