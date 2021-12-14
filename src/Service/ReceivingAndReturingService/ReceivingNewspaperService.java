package Service.ReceivingAndReturingService;

import Entity.Library;

import java.util.Scanner;

public class ReceivingNewspaperService {
    public void ReceivingNewspaper (Library library) {
        int i;
        System.out.println(library.getNewspapersArrayList());
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите индекс газеты, которую хотите взять");
        i = scanner.nextInt();
        library.getNewspapersArrayList().remove(i-1);
        System.out.println("после того, как Вы взяли книгу доступными остались" + library.getNewspapersArrayList());
    }
}
