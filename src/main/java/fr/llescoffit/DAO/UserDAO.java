package fr.llescoffit.DAO;

import fr.llescoffit.Model.User;

import java.util.List;

public interface UserDAO {

    void add(User user);

    void remove(User user);

    List<User> select();

    void changeMDP(User user);

    String connexion(User user);


}
