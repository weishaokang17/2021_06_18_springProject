package per.wsk.study01.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import per.wsk.study01.entity.Book;

import java.util.Arrays;
import java.util.List;

/**
 * @Author wb_weishaokang
 * @date 2021/6/24 5:09 下午
 * @description
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addBook(Book book) {
        //1 创建 sql 语句
        String sql = "insert into t_book values(?,?,?)";
        //2 调用方法实现
        int update = jdbcTemplate.update(sql,book.getUserId(), book.getUsername(), book.getUstatus());
        System.out.println(update);
    }



    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set username=?,ustatus=? where userId=?";
        Object[] args = {book.getUsername(), book.getUstatus(),book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }


    @Override
    public void delete(String id) {
        String sql = "delete from t_book where userId=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }


    //查询表记录数
    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }


    //查询返回对象
    @Override
    public Book findBookInfo(String id) {
       String sql = "select * from t_book where userId=?";//调用方法
        Book book = jdbcTemplate.queryForObject(sql, new
                BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }



    //查询返回集合
    @Override
    public List<Book> findAllBook() {
        String sql = "select * from t_book";//调用方法
        List<Book> bookList = jdbcTemplate.query(sql, new
                BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }



    //批量添加
    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        //返回一个值都是1的数组，因每条插入的数据返回值都是1
        System.out.println(Arrays.toString(ints));
    }


    //批量修改
    @Override
    public void batchUpdateBook(List<Object[]> batchArgs) {
        String sql = "update t_book set username=?,ustatus=? where userId=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        //返回一个值都是1的数组，因每条插入的数据返回值都是1
        System.out.println(Arrays.toString(ints));
    }


    //批量删除
    @Override
    public void batchDeleteBook(List<Object[]> batchArgs) {
        String sql = "delete from t_book where userId=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

}
