package per.wsk.study01.dao;

import per.wsk.study01.entity.Book;

import java.util.List;

/**
 * @Author wb_weishaokang
 * @date 2021/6/24 5:09 下午
 * @description
 */
public interface BookDao {

    public void addBook(Book book);


    public void updateBook(Book book);


    public void delete(String id);


    public int selectCount();

    public Book findBookInfo(String id);

    public List<Book> findAllBook();


    public void batchAddBook(List<Object[]> batchArgs);


    public void batchUpdateBook(List<Object[]> batchArgs);


    public void batchDeleteBook(List<Object[]> batchArgs);
}
