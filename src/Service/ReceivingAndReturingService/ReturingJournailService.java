package Service.ReceivingAndReturingService;

import Entity.Books;
import Entity.Journails;
import Entity.Library;

import java.util.Scanner;

public class ReturingJournailService {
    public void ReturingJournail (Library library) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите журнал который вы хотите вернуть");
        library.getJournailsArrayList().add(new Journails(scanner.nextLine(),scanner.nextLine(),scanner.nextInt()));
        System.out.println(library.getJournailsArrayList());
    }
}
