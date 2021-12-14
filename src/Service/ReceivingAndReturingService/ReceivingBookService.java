package Service.ReceivingAndReturingService;

import Entity.Library;

import java.util.Scanner;

public class ReceivingBookService {
    public void ReceivingBook (Library library) {
        int i;
        System.out.println(library.getBooksArrayList());
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите индекс книги, которую хотите взять");
        i = scanner.nextInt();
        library.getBooksArrayList().remove(i-1);
        System.out.println("после того, как Вы взяли книгу доступными остались" + library.getBooksArrayList());
    }
}
