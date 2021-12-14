package Service;

import Entity.Books;
import Entity.Journails;
import Entity.Library;
import Entity.Newspapers;

import java.io.*;
import java.util.ArrayList;

public class WriteToBinFileService {
    public void WriteToFile(Library library) {
       /* File file = new File("Список книг и объектов, содержащихся в библиотеке");
        PrintWriter pw;
        {
            try {
                pw = new PrintWriter(file);
                pw.println(library);
                pw.println(library.getBooksArrayList());
                pw.println(library.getJournailsArrayList());
                pw.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }*/

        try {
            FileOutputStream fos = new FileOutputStream("library.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(library);

            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



