import java.util.ArrayList;

public class Books {

    public ArrayList<String> listOfBooks = new ArrayList<String>();

    public Books(){
        listOfBooks.add("C Balagurusamy");
        listOfBooks.add("C++");
        listOfBooks.add("Java");
    }

    @Override
    public String toString(){
        return listOfBooks.toString();
    }
}
