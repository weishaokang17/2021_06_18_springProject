package per.wsk.study01.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import per.wsk.study01.entity.Book;
import per.wsk.study01.service.BookService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wb_weishaokang
 * @date 2021/6/24 5:45 下午
 * @description
 */
public class TestJDBCTemplate {

    @Test
    public void test01(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService",
                BookService.class);

//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("java");
//        book.setUstatus("a");
//        bookService.addBook(book);


//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("芯片设计");
//        book.setUstatus("01");
//        bookService.updateBook(book);


//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("芯片设计");
//        book.setUstatus("01");
//        bookService.updateBook(book);


        bookService.deleteBook("1");
    }



    @Test
    public void test02() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService",
                BookService.class);
        int count = bookService.findCount();

        System.out.println(count);

    }

    @Test
    public void test03() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService",
                BookService.class);
        Book bookInfo = bookService.findBookInfo("1");

        System.out.println(bookInfo);

        List<Book> allBook = bookService.findAllBook();

        System.out.println(allBook);
    }


    @Test
    public void test04(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService",
                BookService.class);
        //批量添加测试
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3","java","a"};
        Object[] o2 = {"4","c++","b"};
        Object[] o3 = {"5","MySQL","c"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        //调用批量添加
        bookService.batchAddBook(batchArgs);
    }


    @Test
    public void test05(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService",
                BookService.class);

        //批量修改
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"java0909","a3","3"};
        Object[] o2 = {"c++1010","b4","4"};
        Object[] o3 = {"MySQL1111","c5","5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        //调用方法实现批量修改
        bookService.batchUpdateBook(batchArgs);

    }


    @Test
    public void test06(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService",
                BookService.class);

        //批量删除
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        //调用方法实现批量删除
        bookService.batchDeleteBook(batchArgs);

    }

}
