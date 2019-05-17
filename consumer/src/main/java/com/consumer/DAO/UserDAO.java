package com.consumer.DAO;
import com.model.User;


public interface UserDAO {

    void add(User user);

    void remove(User user);

    void changeMdp(User user);

}
