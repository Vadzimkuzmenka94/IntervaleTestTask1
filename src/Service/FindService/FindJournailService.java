package Service.FindService;

import Entity.Books;
import Entity.Journails;
import Entity.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class FindJournailService {
    public void FindJournail (Library library) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите название журнала, который хотите найти");
        String JournailSearch = scanner.nextLine();

        for (i = 0; i < library.getJournailsArrayList().size() - 1; i++) {
            if (library.getJournailsArrayList().get(i).getTitle().equals(JournailSearch) == true) {
                ArrayList<Journails> list = new ArrayList<>();
                list.add(library.getJournailsArrayList().get(i));
                System.out.println("Журнал найден " + list);
            }
        }
    }
}
