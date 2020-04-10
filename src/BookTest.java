import com.c3mm.controller.BookController;
import com.c3mm.model.BookModel;
import com.c3mm.view.BookView;

public class BookTest
{
	public static void main(String[] args)
	{
		BookModel book = new BookModel();
		book.retrieveModelbyISBN("1234567890");
		BookView view = new BookView();
		
		BookController controller = new BookController(book, view);
		
		controller.updateView();
		
		controller.setBookAuthor("Chechi");
		controller.setBookName("My Book");
		controller.updateView();
	}
}
