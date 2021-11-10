package syh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import syh.dao.UserDao;
import syh.entity.User;

import java.util.List;

/**
 * @author SYH
 * @create 2021-10-26 10:54
 */
@Service
@Transactional
public class UserServicecImpl implements UserService{
    @Autowired
    private UserDao dao;
    @Override
    public List<User> getAll() {
        return dao.getAll();
    }
}
