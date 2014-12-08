/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

import exemploModel.Book;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;





/**
 *
 * @author rafael
 */
public class ListBooksController extends AbstractController
{
    public ListBooksController()
    {
        
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
        List<Book> books = new LinkedList<>();
        
        books = Book.getAllBooks();

        return new ModelAndView("listBooks","books", books);
    }
}
