package syh.dao;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import syh.entity.User;

import java.util.List;

/**
 * @author SYH
 * @create 2021-10-25 19:51
 */

public interface UserDao {
    List<User> getAll();
}
