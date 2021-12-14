package Service.FindService;

import Entity.Books;
import Entity.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class FindBookService {
    public void FindBook(Library library) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите название книги, которую хотите найти");
        String BookSearch = scanner.nextLine();
        for (i = 0; i < library.getBooksArrayList().size() - 1; i++) {
            if (library.getBooksArrayList().get(i).getTitle().equals(BookSearch) == true) {
                ArrayList <Books> list = new ArrayList<>();
                list.add(library.getBooksArrayList().get(i));
                System.out.println("Книга найдена " + list);
            }
        }
    }
}
