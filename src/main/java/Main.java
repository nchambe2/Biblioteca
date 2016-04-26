import com.thoughtworks.tw101.biblioteca.Application;
import com.thoughtworks.tw101.biblioteca.Library;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> bookList = new ArrayList<String>();
        bookList.add("The Bible");
        bookList.add("The Quran");

        Library library = new Library(bookList);
        Application application = new Application(System.out, library);

        application.start();
    }
}
