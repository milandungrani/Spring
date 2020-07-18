package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class UserDataAccessService implements UserDao {

    private static List<User> Database = new ArrayList<>();

    @Override
    public int insertUser(User user) {
        user.setId(Database.size() + 1);
        Database.add(user);
        return 1;
    }

    @Override
    public List<User> selectAllUser() {
        return Database;
    }

}