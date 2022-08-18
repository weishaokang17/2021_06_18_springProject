package per.wsk.study01.service;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.wsk.study01.dao.BookDao;
import per.wsk.study01.entity.Book;

import java.util.List;


/**
 * @Author wb_weishaokang
 * @date 2021/6/24 5:13 下午
 * @description
 */
@Service
public class BookService {

    @Autowired
    private BookDao bookDao;


    public void addBook(Book book){
        bookDao.addBook(book);
    }


    public void updateBook(Book book){
        bookDao.updateBook(book);
    }


    public void deleteBook(String id){
        bookDao.delete(id);
    }

    public int findCount(){
       return bookDao.selectCount();
    }

    public Book findBookInfo(String id){
       return bookDao.findBookInfo(id);
    }

    public List<Book> findAllBook(){
        return bookDao.findAllBook();
    }

    public void batchAddBook(List<Object[]> batchArgs){
        bookDao.batchAddBook(batchArgs);
    }

    public void batchUpdateBook(List<Object[]> batchArgs){
        bookDao.batchUpdateBook(batchArgs);
    }

    public void batchDeleteBook(List<Object[]> batchArgs){
        bookDao.batchDeleteBook(batchArgs);
    }
}
