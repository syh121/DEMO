package syh.service;

import org.springframework.stereotype.Repository;
import syh.entity.User;

import java.util.List;

/**
 * @author SYH
 * @create 2021-10-26 10:53
 */
public interface UserService {
    List<User> getAll();
}
