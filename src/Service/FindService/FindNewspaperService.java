package Service.FindService;

import Entity.Books;
import Entity.Library;
import Entity.Newspapers;

import java.util.ArrayList;
import java.util.Scanner;

public class FindNewspaperService {
    public void FindNewsPaper (Library library) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите название газеты, которую хотите найти");
        String NewspaperSearch = scanner.nextLine();

        for (i = 0; i < library.getNewspapersArrayList().size(); i++) {
            if (library.getNewspapersArrayList().get(i).getTitle().equals(NewspaperSearch) == true) {
                ArrayList<Newspapers> list = new ArrayList<>();
                list.add(library.getNewspapersArrayList().get(i));
                System.out.println("Газета " + list);
            }
        }
    }
}
