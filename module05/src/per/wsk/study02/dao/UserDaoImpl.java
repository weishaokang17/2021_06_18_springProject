package per.wsk.study02.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author wb_weishaokang
 * @date 2021/6/25 9:08 下午
 * @description
 */
@Repository
public class UserDaoImpl implements UserDao {



    @Autowired
    private JdbcTemplate jdbcTemplate;



    //lucy 转账 100 给 mary
    //少钱
    @Override
    public void reduceMoney() {
        String sql = "update t_account set money=money-? where username=?";
        jdbcTemplate.update(sql,100,"lucy");
    }

    //多钱
    @Override
    public void addMoney() {
        String sql = "update t_account set money=money+? where username=?";
        jdbcTemplate.update(sql,100,"mary");
    }
}
