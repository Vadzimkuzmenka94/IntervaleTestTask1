package Service.ReceivingAndReturingService;

import Entity.Books;
import Entity.Library;
import Entity.Newspapers;

import java.util.Scanner;

public class ReturingNewspaperService {
    public void ReturingNewsPaper (Library library) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите газету которую вы хотите вернуть");
        library.getNewspapersArrayList().add(new Newspapers(scanner.nextLine(),scanner.nextLine(),scanner.nextInt()));
        System.out.println(library.getNewspapersArrayList());
    }
}
