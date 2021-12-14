package Service.ReceivingAndReturingService;

import Entity.Library;

import java.util.Scanner;

public class ReceivingJournailService {
    public void ReceivingJournail (Library library) {
        int i;
        System.out.println(library.getJournailsArrayList());
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите индекс журнала, который хотите взять");
        i = scanner.nextInt();
        library.getJournailsArrayList().remove(i-1);
        System.out.println("после того, как Вы взяли книгу доступными остались" + library.getJournailsArrayList());
    }
}
