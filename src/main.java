import Entity.Books;
import Entity.Journails;
import Entity.Library;
import Entity.Newspapers;
import Service.FindService.FindBookService;
import Service.FindService.FindJournailService;
import Service.FindService.FindNewspaperService;
import Service.PrintService.PrintBooksService;
import Service.PrintService.PrintJournailsService;
import Service.PrintService.PrintLibraryService;
import Service.PrintService.PrintNewspapersService;
import Service.ReceivingAndReturingService.*;
import Service.SortService.SortBooksService;
import Service.SortService.SortJournailService;
import Service.SortService.SortNewspapersService;
import Service.WriteToBinFileService;


import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        ArrayList<Books> booksArrayList = new ArrayList<>();
        Books book_1 = new Books("Война и мир", "Толстой Л.Н.", 1872);
        Books book_2 = new Books("Пиковая Дама", "Пушкин А.С.", 1873);
        Books book_3 = new Books("Мертвые души", "Гоголь Н.В.", 1889);
        Books book_4 = new Books("Анна Каренина", "Толстой Л.Н.", 1870);
        Books book_5 = new Books("Братья Карамазовы", "Достоевский Ф.М.", 1856);
        Books book_6 = new Books("Преступление и наказание", "Достоевский Ф.М.", 1858);
        booksArrayList.add(book_1);
        booksArrayList.add(book_2);
        booksArrayList.add(book_3);
        booksArrayList.add(book_4);
        booksArrayList.add(book_5);
        booksArrayList.add(book_6);

        ArrayList<Journails> journailsArrayList = new ArrayList<>();
        Journails journail_1 = new Journails("ПлэйБой", "5_Май", 2020);
        Journails journail_2 = new Journails("Законность и правопорядок", "8_Август", 2020);
        Journails journail_3 = new Journails("Беларусь Сегодня", "6_Июнь", 2020);
        Journails journail_4 = new Journails("Космополитен", "6_Июнь", 2020);
        Journails journail_5 = new Journails("Каламбур", "2_Февраль", 2020);
        Journails journail_6 = new Journails("Один Дома", "1_Январь", 2020);
        journailsArrayList.add(journail_1);
        journailsArrayList.add(journail_2);
        journailsArrayList.add(journail_3);
        journailsArrayList.add(journail_4);
        journailsArrayList.add(journail_5);
        journailsArrayList.add(journail_6);

        ArrayList<Newspapers> newspapersArrayList = new ArrayList<>();
        Newspapers newspaper_1 = new Newspapers("Комсомольская правда", "1_Январь", 2021);
        Newspapers newspaper_2 = new Newspapers("Вечерний Гомель", "2_Февраль", 2021);
        Newspapers newspaper_3 = new Newspapers("Гомельская правда", "8_Август", 2019);
        Newspapers newspaper_4 = new Newspapers("Прессбол", "9_Сентябрь", 2018);
        Newspapers newspaper_5 = new Newspapers("Спорт Экспресс", "7_Июль", 2021);
        Newspapers newspaper_6 = new Newspapers("Аргументы и факты", "5_Май", 2021);
        newspapersArrayList.add(newspaper_1);
        newspapersArrayList.add(newspaper_2);
        newspapersArrayList.add(newspaper_3);
        newspapersArrayList.add(newspaper_4);
        newspapersArrayList.add(newspaper_5);
        newspapersArrayList.add(newspaper_6);

        Library library = new Library("Библиотека имени Ленина", booksArrayList, journailsArrayList, newspapersArrayList);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "Выберете пункт меню:" + "\n" +
                            "1. Поиск книги по названию" + "\n" +
                            "2. Поиск журнала по названию" + "\n" +
                            "3. Поиск газеты по названию" + "\n" +
                            "4. Вывести список всех книг" + "\n" +
                            "5. Вывести список всех журналов" + "\n" +
                            "6. Вывести список всех материалов, имеющихся в библиотеке" + "\n" +
                            "7. Вывести список всех газет" + "\n" +
                            "8. Взять книгу домой" + "\n" +
                            "9. Вернуть книгу" + "\n" +
                            "10. Взять журнал домой" + "\n" +
                            "11. Вернуть журнал" + "\n" +
                            "12. Взять газету домой" + "\n" +
                            "13. Вернуть газету" + "\n" +
                            "14. Отсортировать список книг" + "\n" +
                            "15. Отсортировать список журналов" + "\n" +
                            "16. Отсортировать список газет" + "\n" +
                            "17. Вывести всю библиотеку в текстовый бин файл" + "\n" +
                            "18. Выход" + "\n"

            );
            int choice = scanner.nextInt();
            if (choice == 18) {
                break;

            }
            switch (choice) {
                case 1:
                    FindBookService findBookService = new FindBookService();
                    findBookService.FindBook(library);
                    break;
                case 2:
                    FindJournailService findJournailService = new FindJournailService();
                    findJournailService.FindJournail(library);
                    break;
                case 3:
                    FindNewspaperService findNewspaperService = new FindNewspaperService();
                    findNewspaperService.FindNewsPaper(library);
                    break;
                case 4:
                    PrintBooksService printBooksService = new PrintBooksService();
                    printBooksService.PrintBooksService(library);
                    break;
                case 5:
                    PrintJournailsService printJournailsService = new PrintJournailsService();
                    printJournailsService.printJournail(library);
                    break;
                case 6:
                    PrintLibraryService printLibraryService = new PrintLibraryService();
                    printLibraryService.printLibrary(library);
                    break;
                case 7:
                    PrintNewspapersService printNewspapersService = new PrintNewspapersService();
                    printNewspapersService.PrintNewspapers(library);
                    break;
                case 8:
                    ReceivingBookService receivingBookService = new ReceivingBookService();
                    receivingBookService.ReceivingBook(library);
                    break;
                case 9:
                    ReturingBookService returingBookService = new ReturingBookService();
                    returingBookService.ReturingBook(library);
                    break;
                case 10:
                    ReceivingJournailService receivingJournailService = new ReceivingJournailService();
                    receivingJournailService.ReceivingJournail(library);
                    break;
                case 11:
                    ReturingJournailService returingJournailService = new ReturingJournailService();
                    returingJournailService.ReturingJournail(library);
                    break;
                case 12:
                    ReceivingNewspaperService receivingNewspaperService = new ReceivingNewspaperService();
                    receivingNewspaperService.ReceivingNewspaper(library);
                    break;
                case 13:
                    ReturingNewspaperService returingNewspaperService = new ReturingNewspaperService();
                    returingNewspaperService.ReturingNewsPaper(library);
                    break;
                case 14:
                    SortBooksService sortBooksService = new SortBooksService();
                    sortBooksService.SortBook(library);
                    break;
                case 15:
                    SortJournailService sortJournailService = new SortJournailService();
                    sortJournailService.SortJourails(library);
                    break;
                case 16:
                    SortNewspapersService sortNewspapersService = new SortNewspapersService();
                    sortNewspapersService.SortNewspapers(library);
                    break;
                case 17:
                    WriteToBinFileService writeToBinFileService = new WriteToBinFileService();
                    writeToBinFileService.WriteToFile(library);
                    break;
            }
        }
    }
}








