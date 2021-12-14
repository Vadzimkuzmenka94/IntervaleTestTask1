package Service.ReceivingAndReturingService;

import Entity.Books;
import Entity.Library;

import java.util.Scanner;

public class ReturingBookService {
    public void ReturingBook (Library library) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите книгу которую вы хотите вернуть (Введите название книги, нажмите ВВОД. Введите автора, нажмите ВВОД и т.д)");
        library.getBooksArrayList().add(new Books(scanner.nextLine(),scanner.nextLine(),scanner.nextInt()));
        System.out.println(library.getBooksArrayList());
    }

}
