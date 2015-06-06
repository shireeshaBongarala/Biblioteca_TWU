import com.twu.biblioteca.BibliotecaOutputHandler;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BooksTest {

    @Test
    public void testIfBookDetailsArePrintedOnConsole(){
        Books books = new Books();

        ArrayList<String> actualListOfBooks = new ArrayList<String>(Arrays.asList("C Balagurusamy", "C++", "Java"));


        assertThat(actualListOfBooks.toString(), is(books.toString()));



    }

}
